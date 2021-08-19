CREATE DATABASE ecommerce_db;

use ecommerce_db;
CREATE TABLE produtos(
id bigint auto_increment,
nome varchar(30) not null,
marca varchar(30) not null,
valor DECIMAL(8,2)not null,
cor varchar(20),
Tem_no_estoque boolean,
primary key(id)
);

insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Sapato", "Abidas","Vermelho",350.00, true);
insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Camiseta", "Nicer","Preta",39.90, true);
insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Relógio", "Rilex","Dourado",850.00, true);
insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Sandalia", "Rabaianas","Verde",19.00, true);
insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Bermuda", "G&D","Branca",100.00, true);
insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Relógio", "Rilex","Prata",3550.00, false);
insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Sapato", "Pluma","Preto e Branco",250.70, true);
insert into produtos (nome, marca, cor, valor, Tem_no_estoque) values ("Sunga", "Infator Surf","Verde e Branca",50.00, true);

select * from produtos

select * from produtos where valor > 500
select * from produtos where valor < 500