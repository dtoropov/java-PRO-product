drop schema if  exists java_pro cascade;
create schema if not exists java_pro;

drop table if exists java_pro.user;
create table java_pro.user(id bigserial, name text);

drop table if exists java_pro.product;
create table java_pro.product(id bigserial, name text);

drop table if exists java_pro.userproduct;
create table java_pro.userproduct(id bigserial, userId bigint, productid bigint, account text, balance numeric);

insert into java_pro.user(name)
values('Иван');

insert into java_pro.user(name)
values('Денис');

insert into java_pro.user(name)
values('Илья');


insert into java_pro.product(name)
values('Кредиты');

insert into java_pro.product(name)
values('Депозиты');

insert into java_pro.product(name)
values('Текущие счета');

insert into java_pro.userproduct(userId, productId, account, balance)
values(1, 1, '40817810099910004312', 1000000);

insert into java_pro.userproduct(userId, productId, account, balance)
values(1, 3, '40817810099910004314', 3000000);

insert into java_pro.userproduct(userId, productId, account, balance)
values(2, 1, '40817810099910004311', 1000000);

insert into java_pro.userproduct(userId, productId, account, balance)
values(3, 1, '40817810099910004310', 4000000);
