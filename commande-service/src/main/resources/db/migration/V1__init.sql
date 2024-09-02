-- Create table t_commandes
CREATE TABLE t_commandes (
                          id SERIAL PRIMARY KEY,
                          commande_number VARCHAR(255) NOT NULL,
                          sku_code VARCHAR(255) NOT NULL,
                          price NUMERIC(19, 2) NOT NULL,
                          quantity INTEGER NOT NULL
);