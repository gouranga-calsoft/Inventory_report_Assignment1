package com.calsoft.api.repository;

import com.calsoft.api.entity.InventoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface InventoryDetailsRepository extends JpaRepository<InventoryDetails, Long> {

    @Query("SELECT id FROM InventoryDetails id WHERE id.inventory.purchaseDt >= :startDate AND id.inventory.purchaseDt <= :endDate")
    List<InventoryDetails> findByInventoryPurchaseDtBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
