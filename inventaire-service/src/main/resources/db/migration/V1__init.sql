-- File: V1__init.sql

-- Drop table if exists (for safety during development; optional)
DROP TABLE IF EXISTS t_inventaire;

-- Create table t_inventaire
CREATE TABLE t_inventaire (
                             id BIGINT PRIMARY KEY AUTO_INCREMENT,
                             sku_code VARCHAR(255),
                             quantity INTEGER
);

-- Optional: Add any additional constraints or indexes here

-- Optional: Insert initial data if needed
-- INSERT INTO t_inventaire (sku_code, quantity) VALUES ('SKU001', 100);
