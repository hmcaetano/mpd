use Northwind

create table Products(
	ProductID int,
	ProductName varchar(50) not null,
	UnitPrice money,--decimal(5,2),
	UnitsInStock int,
	constraint pk_Products primary key(ProductID),
	constraint ck_UnitPrice_Products check(UnitPrice > 0),
	constraint ck_UnitsInStock_Products check(UnitsInStock > 0),
)


--drop table products