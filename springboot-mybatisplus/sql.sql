create
database if not exists mybatisplus_db;

use
mybatisplus_db;

create table user
(
    id       int,
    name     varchar(32),
    password varchar(32),
    age      int,
    tel      varchar(15)
);

