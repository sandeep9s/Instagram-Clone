
CREATE DATABASE IF NOT EXISTS instagram_clone;
USE instagram_clone;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL
);

INSERT INTO users (username, password) VALUES ('user1', 'pass1');
