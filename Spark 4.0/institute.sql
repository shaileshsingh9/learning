create table students(
s_id serial primary key,
name varchar(100) not null
);

create table courses(
c_id serial primary key,
name varchar(100) not null,
fee numeric not null
);


create table enrollment(
enrollment_id serial primary key,
s_id int not null,
c_id int not null,
enrollment_date date not null,
foreign key (s_id) references students(s_id),
foreign key (c_id) references courses(c_id)
);

insert into students(name)
values 
('Ram'),('Alex'),('Paul');

insert into courses(name,fee)
values
('Math',500.00),('English',400.00),('Computer',450.00);

insert into enrollment(s_id, c_id, enrollment_date)
values
(1,1, '2024-01-01'),
(1,2, '2024-02-04'),
(2,1, '2024-03-03'),
(2,3, '2024-04-11'),
(3,3, '2024-11-21');
select * from students;
select * from courses;
select * from enrollment;

select s.name, c.name, e.enrollment_date ,c.fee from enrollment e
join students s on e.s_id =s.s_id
join courses c on c.c_id = e.c_id;








