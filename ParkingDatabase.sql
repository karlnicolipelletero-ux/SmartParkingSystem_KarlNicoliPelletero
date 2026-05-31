DROP DATABASE IF EXISTS parking_db;
CREATE DATABASE parking_db;
USE parking_db;

-- Table 1: customer_types
CREATE TABLE customer_types (
    type_name VARCHAR(20) PRIMARY KEY, 
    base_rate INT NOT NULL
);

-- Table 2: slots
CREATE TABLE slots (
    slot_id VARCHAR(5) PRIMARY KEY, 
    status ENUM('Available', 'Occupied') DEFAULT 'Available'
);

-- Table 3: active_reservations
CREATE TABLE active_reservations (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    slot_id VARCHAR(5),
    driver_name VARCHAR(100),
    plate_number VARCHAR(10) UNIQUE,
    contact_number VARCHAR(15),
    customer_type VARCHAR(20),
    fee INT,
    time_in TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_slot FOREIGN KEY (slot_id) REFERENCES slots(slot_id),
    CONSTRAINT fk_type FOREIGN KEY (customer_type) REFERENCES customer_types(type_name)
);

-- Table 4: transaction_history
CREATE TABLE transaction_history (
    history_id INT AUTO_INCREMENT PRIMARY KEY,
    plate_number VARCHAR(10),
    slot_id VARCHAR(5),
    total_paid INT,
    time_out TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Table 5: users
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    password VARCHAR(255),
    role VARCHAR(20) DEFAULT 'Staff'
);

-- Essential Data
INSERT INTO customer_types VALUES ('Senior Citizen', 30), ('Regular', 50);
INSERT INTO slots (slot_id) VALUES ('A1'),('B1'),('C1'),('D1'),('E1'),('F1'),('A2'),('B2'),('C2'),('D2'),('E2'),('F2');