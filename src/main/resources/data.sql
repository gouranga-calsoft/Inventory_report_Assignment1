-- Insert sample Inventories
INSERT INTO inventory (purchase_dt, cost) VALUES ('2023-05-10', 1500.50);
INSERT INTO inventory (purchase_dt, cost) VALUES ('2023-08-22', 2300.00);
INSERT INTO inventory (purchase_dt, cost) VALUES ('2024-01-15', 800.75);

-- Insert sample Inventory Details
INSERT INTO inventory_details (inventory_id, inventory_details) VALUES (1, '10x Dell Laptops');
INSERT INTO inventory_details (inventory_id, inventory_details) VALUES (1, '5x Wireless Mice');
INSERT INTO inventory_details (inventory_id, inventory_details) VALUES (2, '3x Office Servers');
INSERT INTO inventory_details (inventory_id, inventory_details) VALUES (3, '15x Ergonomic Chairs');
