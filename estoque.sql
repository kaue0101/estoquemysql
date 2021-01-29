create database estoque;
use estoque;
create table itens (
	marca int primary key auto_increment,
    produtos varchar(50) not null,
    quantidade int not null,
   preco decimal(10,2)
);

show tables;
describe itens;
select * from itens;


/** CRUD - Create **/
insert into itens (produtos,quantidade,preco)
values ('J&B','600','450');

insert into itens (produtos,quantidade,preco)
values ('Suntory ','600','800');

insert into  itens (produtos,quantidade,preco)
values ('Bangalore Malt .','600','900');

insert into  itens (produtos,quantidade,preco)
values ('Directors Specia.','600','450');

insert into itens (produtos,quantidade,preco)
values ('Chivas Regal.','600','350');

insert into itens (produtos,quantidade,preco)
values ('Royal Challenge','600','360');

/** CRUD - Read **/
select * from itens;
select * from itens where id = 1;

/** CRUD - Update **/
update itens set produtos,quantidade,preco = '' where id = 1; 
update itens set produtos,quantidade,preco = '',
fone = '', email = '' where id = 2; 

/** CRUD - Delete **/
delete from ***** where id = 2;