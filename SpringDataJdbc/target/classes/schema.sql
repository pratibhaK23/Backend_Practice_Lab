CREATE TABLE if not exists Book (
    id BIGINT auto_increment PRIMARY KEY,
    title VARCHAR(255),
    about VARCHAR(255),
    author VARCHAR(255),
    language VARCHAR(255) ,
    isIssued BOOLEAN default false
);


CREATE TABLE if not exists User(
userId BIGINT auto_increment PRIMARY KEY,
username VARCHAR(255),
password VARCHAR(255),
email VARCHAR(255)
);
