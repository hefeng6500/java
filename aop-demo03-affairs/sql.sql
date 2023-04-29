drop database if exists spring_db;
create
    database spring_db character set utf8;
use
    spring_db;
create table tbl_account
(
    id    int primary key auto_increment,
    name  varchar(35),
    money double
);
insert into tbl_account
values (1, 'Tom', 1000);
insert into tbl_account
values (2, 'Jerry', 1000);

create table tbl_log
(
    id         int primary key auto_increment,
    info       varchar(255),
    createDate datetime
)

