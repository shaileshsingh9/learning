 

create table customers(
cust_id serial primary key,
cust_name varchar(100) not null

);



create table orders(
ord_id serial primary key,
ord_date date not null,
cust_id integer not null,
foreign key (cust_id) references customers (cust_id)
);



create table products(
p_id serial primary key,
p_name varchar(100) not null,
price numeric not null
);

items

create table order_items(
item_id serial primary key,
ord_id integer not null,
p_id integer not null,
quantity integer not null,
foreign  key (ord_id) references orders (ord_id),
foreign key (p_id) references products (p_id)
);


insert into customers(cust_name)
values ('Piyush Pal'),('Ajay Yadav'),('Saurabh Gupta'),('Suraj Singh');

insert into orders(ord_date, cust_id)
values
('2026-08-21', 1),
('2026-08-23', 2),
('2026-09-09', 3),
('2026-09-07', 2);

insert into products(p_name , price)
values
('Laptop', 51000.00),('Mobile', 18000.00),('Keyboard', 500.00),('Charger', 1000.00);

insert into order_items(ord_id, p_id, quantity)
values(1,1,1),(1,4,2),(2,1,1),(3,2,1),(3,4,5),(4,3,1);

select * from order_items;

create view billing_info as
select
c.cust_name, o.ord_date , p.p_name, p.price ,oi.quantity, (oi.quantity*p.price) AS total_price
from order_items oi
join
products p on oi.p_id=p.p_id
join
orders o on o.ord_id=oi.ord_id
join customers c on o.cust_id= c.cust_id;
































