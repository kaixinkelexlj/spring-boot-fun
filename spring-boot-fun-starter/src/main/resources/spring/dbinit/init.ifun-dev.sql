-- CREATE DATABASE IF NOT EXISTS ifun_dev;
-- GRANT ALL PRIVILEGES ON ifun_dev.* TO root@localhost IDENTIFIED BY 'root';

-- USE ifun_dev;

create table IF NOT EXISTS tb_user(
  id bigint auto_increment,
  gmt_create datetime,
  gmt_modified datetime,
  nick varchar(128),
  uname VARCHAR(128),
  password char(32),
  primary key(id),
  unique key uk_nick(nick)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 comment '用户表';

insert ignore into tb_user(gmt_create, gmt_modified, nick, uname, password)
values(now(), now(), 'ifun_dev', '行默DEV', '4618fa573185897721a96e87c9362f7b');