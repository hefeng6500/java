drop database if exists mybatisplus_db2;
create
database if not exists mybatisplus_db2;

use
mybatisplus_db2;

create table tbl_user
(
    id       BIGINT(20) AUTO_INCREMENT NOT NULL COMMENT '主键ID',
    name     VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age      INT(11)     NULL DEFAULT NULL COMMENT '年龄',
    password varchar(32),
    tel      varchar(15),
    PRIMARY KEY (id)
);

INSERT INTO tbl_user (id, name, age, password, tel)
VALUES (1, 'Jone', 18, 'test1@baomidou.com', '18100009999'),
       (2, 'Jack', 20, 'test2@baomidou.com', '18100009999'),
       (3, 'Tom', 28, 'test3@baomidou.com', '18100009999'),
       (4, 'Sandy', 21, 'test4@baomidou.com', '18100009999'),
       (5, 'Billie', 24, 'test5@baomidou.com', '18100009999');
