CREATE DATABASE swing_store_database;
USE swing_store_database;

CREATE TABLE User(
    username VARCHAR(255),
	full_name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    contact VARCHAR(255),
    access_level VARCHAR(255) NOT NULL,
    PRIMARY KEY(username)
);

CREATE TABLE Product(
	id INTEGER AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL UNIQUE,
    category VARCHAR(255),
    price VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE Sale(
    id INTEGER AUTO_INCREMENT,
    total_cost FLOAT NOT NULL,
    seller_username VARCHAR(255),
    date DATETIME NOT NULL,
    PRIMARY KEY(id)
);

-- DROP TABLE User;
-- DROP TABLE Product;
-- DROP TABLE Sale;

INSERT INTO User VALUES("admin", "ADMIN", "test", "1234567893", "Administrator");
INSERT INTO User VALUES("apurv", "apurv", "123", "9022775230", "Manager");
INSERT INTO User VALUES("shubh", "Shubham", "test", "7629832453", "Attendant");

INSERT INTO Product VALUES(null, "Potassium(1 kg)", "Fertilizer", "300");
INSERT INTO Product VALUES(null, "Magnesium(250 gm)", "Fertilizer", "250");

INSERT INTO Sale VALUES(null, 9.99, "Alexandre", '2022-12-16');

SELECT * FROM User;
SELECT * FROM Product;
SELECT * FROM Sale;
