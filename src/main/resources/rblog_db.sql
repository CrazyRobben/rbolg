/*创建用户表*/
drop table user_tb;
create table user_tb(
  user_id int primary key auto_increment  ,
  user_password VARCHAR(32) NOT NULL,
  user_tel varchar(11),
  user_email VARCHAR(20),
  user_nickname VARCHAR(30)
);
INSERT INTO user_tb(user_password, user_tel, user_email, user_nickname)
VALUES ('8286565161','13716350181','111544210@qq.com','admin');