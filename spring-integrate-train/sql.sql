create database spring_db character set utf8;
use spring_db;
create table tbl_account
(
    id    int primary key auto_increment,
    name  varchar(35),
    money double
);
