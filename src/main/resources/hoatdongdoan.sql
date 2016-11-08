create database hoatdongdoan;
use hoatdongdoan;
create table doanvien(mssv nvarchar(30) primary key,
					  password nvarchar(30),
                      email nvarchar(30));
insert into doanvien values('14110020','12345678','banmai@gmail.com')    ;  
insert into doanvien values('14110022','12345678','bantrua@gmail.com')  ;               
					
