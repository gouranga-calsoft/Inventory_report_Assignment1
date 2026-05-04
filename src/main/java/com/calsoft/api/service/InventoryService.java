package com.calsoft.api.service;

import com.calsoft.api.entity.InventoryDetails;
import com.calsoft.api.repository.InventoryDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryDetailsRepository inventoryDetailsRepository;

    public List<InventoryDetails> getInventoryDetails(LocalDate startDate, LocalDate endDate) {
        return inventoryDetailsRepository.findByInventoryPurchaseDtBetween(startDate, endDate);
    }
}
