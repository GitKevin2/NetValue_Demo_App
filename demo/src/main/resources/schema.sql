DROP TABLE IF EXISTS CUSTOMERS;

CREATE TABLE customers (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL
)

CREATE TABLE rfid_tags (
    rfid_number INT PRIMARY KEY,
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customers(id)
)

CREATE TABLE charge_points (
    serial_number INT PRIMARY KEY,
    connector_qty INT,
    connectors_in_use INT,
)