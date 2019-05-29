create database TODO;
Use TODO;
create table tasks (
id int auto_increment primary key,
description text not null,
due date null, 
actor text);

create table actions(
id int auto_increment primary key,
task_id int,
review text null,
date date not null,
foreign key(tasks_id) references tasks(id));

show tables;
alter table tasks drop due;

create table todos(
id int auto_increment primary key,
task_id int,
due_date date not null,
foreign key(task_id)references tasks(id)
);
show tables;
alter table actions drop task_id;
alter table actions add todo_id int;
alter table actions add foreign key(todo_id) references todo(id);

show tables;
describe todos;
describe tasks; 
alter table tasks drop actor;

describe tasks;
describe actions;
describe actions; 
alter table actions drop task_id;

describe actions;

drop table if exists actions;

show tables;

create table if not exists actions(
id int auto_increment primary key,
todo_id int,
review text null, 
date date not null,
foreign key(todo_id) references todos(id));

alter table actions drop review;
alter table actions add review enum('Suc','Fail');

show tables;
describe actions; 
describe todos;
describe tasks;

insert into tasks (description) 
values("Go Cinema"),
("Go Shop"),
("Washing the dishes"),
("Repair washmachine"),
("Pawing"),
("Go fishing"),
("Visit Parents");

delete descrition from tasks;

describe tasks;

select * from tasks;

insert into todos (task_id, due_date) 
values (2, '2019-04-11'),
       (3, '2019-03-27'),
       (5, '2019-04-12'),
       (5, '2019-07-05'),
       (6, '2019-05-07'),
       (4, '2019-09-18'),
       (8, '2019-10-11'),
       (7, '2019-12-31'),
       (2, '2019-07-03'),
       (3, '2019-08-19'),
       (1, '2019-03-21');
       
       
select * from todos t
join tasks ta on t.task_id = ta.id
order by due_date asc;   

delete from todos
where task_id=1;

delete from tasks 
where id=1;

select * from todos
where task_id=1;
describe tasks;

select * from tasks;

describe actions;
select * from todos;
  
insert into actions(todo_id, date, review) 
values(2,'2019-05-13', 'Suc'),
       (5,'2019-07-01', 'Fail'),
       (3,'2019-05-13', 'Fail'),
       (5,'2019-10-11', 'Suc');
create table fails(
id int primary key,
task_description text,
review enum('Suc','Fail'),
trial date);

describe fails;

drop table fails;       
select description, due_date, review, date from tasks ta
join todos t on t.task_id=ta.id
join actions a on a.todo_id = t.id
where due_date < date && review='Fail'
order by due_date;   

show tables;
select*from actions;

create database todo;
use todo;
show tables;
show tables;

drop database if exists todo;
create database todo;
use todo;
show tables;






     
 



 