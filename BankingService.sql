Alter login sa with password = '123456'

Alter login sa enable


CREATE DATABASE BankingService;
use BankingService;

drop table UserInfo;
drop table BlanceTable;
drop table TransTable;
drop table ProfitTable;





Create table UserInfo
(
	UserId int identity(20001,1) primary key,
	PhoneNo int unique not null,
	FirstName varchar(50) not null,
	LastName varchar(50) not null,
	MiddleName varchar(50) null,
	DateOfBirth varchar(10) not null,
	NationalId varchar(20) null,
	BirthCertificate varchar(20) null,
	PresentAddress varchar(50) not null,
	PremanentAddress varchar(50) not null,
	PasswordNo varchar(20) not null,
	ReferenceId varchar(20) not null,
	AccountType int not null
	
);




insert into UserInfo values(112233,'admin','admin','admin','1996-11-26','1234567','9876543','mohakhali','dhaka','1234','5678',3);
insert into UserInfo values(112235,'sadia','sadia','sadia','1996-11-26','1234567','9876543','rampura','dhaka','1234','5678',3);




Create table TransTable
(
	TransID int identity(50000,1) primary key,
	UserId int FOREIGN KEY REFERENCES UserInfo(UserId)  not null,
	SenderId varchar(50) not null,
	ReciverId varchar(50) not null,
	TransType varchar(50) not null,
	Ammount float not null,
	TransDate Date not null
	
	
);




Create table BlanceTable
(
	BlanceID int identity(70000,1) primary key,
	UserId int FOREIGN KEY REFERENCES UserInfo(UserId)  not null,
	CurrentBlance float not null 

	
	
	
);



Create table ProfitTable
(
	ProfitID int identity(110000,1) primary key,
	UserId int FOREIGN KEY REFERENCES UserInfo(UserId)  not null,
	SenderId varchar(50) not null,
	TransType varchar(50) not null,
	Ammount float not null,
	TransDate Date not null
	
	
);



select * from UserInfo;
select * from BlanceTable;
select * from TransTable;
select * from ProfitTable;






