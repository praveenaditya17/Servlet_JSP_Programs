create table Student6(
 id  number(10) primary key,
 name  varchar(40) not null,
 gender varchar(20) not null,
 email varchar(50) unique,
 contact number(20) not null unique,
 college varchar(50) not null,
 branch varchar(30) not null);

desc Student6;
select * from Student6 order by id asc;

insert into Student6 (id,name,gender,email,contact,college,branch) values
((select  nvl(max(id),1000)+1 from Student6),'bab','male','bappbluagrahari07@gmail.com',95650072546,'nit','mca');

update Student6 set name='Archna',gender='female',contact='9565072546',email='arch@g',college='Girls.I.C',branch='BA'
where id=1001;




Login
------


create table user_login(
id number(10)primary key,
name varchar2(30) not null,
user_name varchar2(30) not null unique,
user_password varchar2(30) not null,
role varchar2(20)
);

select nvl(max(id),1000)+1 from Student5;
select nvl(max(id),1000)+1 from stu_login;
select nvl(max(department_id),1000)+1 from Department;
insert into user_login values(1001,'Bablu','sis','123','super');
insert into user_login values(1002,'Sunil','sunil','321','admin');
insert into user_login values(1003,'Amit','User','111','user');
commit;
select * from user_login where user_name='sis' and user_password='123';


create table Record(
 id  number(10) primary key,
 s_id number(10),
 creation_time timestamp,
 file_type  blob,
 foreign key(s_id) references Student6(id)
 );
 
 insert into Record (id,s_id,creation_time)values(101,1001,sysdate  );

