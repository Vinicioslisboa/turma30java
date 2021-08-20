CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
id_categoria bigint auto_increment,
Marca varchar(20) not null,
tipo varchar(30), -- elétrica, hidraulica
garantia varchar(20),
primary key(id_categoria)
) engine InnoDB;

select * from tb_categoria;

CREATE TABLE tb_produto(
id_produto bigint auto_increment,
nome varchar(30) not null,
preco DECIMAL(6,2) not null,
material varchar(20),
estoque int(4) not null,
primary key(id_produto),
foreign key(id_produto) references  tb_categoria(id_categoria)
)engine InnoDB;

select * from tb_produto;

insert into tb_categoria (marca, tipo, garantia) values ("3M","Hidraulica","1 ano");
insert into tb_categoria (marca, tipo, garantia) values ("Amanco","Hidraulica","1 ano");
insert into tb_categoria (marca, tipo, garantia) values ("Portinari","Acabamento","1 ano");
insert into tb_categoria (marca, tipo, garantia) values ("Vedacit","Elétrica","3 meses");
insert into tb_categoria (marca, tipo, garantia) values ("Tigre","Elétrica","1 ano");

insert into tb_produto (nome, preco, material, estoque) values ("Ralo Linear",164.90,"PVC",200);
insert into tb_produto (nome, preco, material, estoque) values ("Caixa D'agua 500 lt",359.99,"PVC",120);
insert into tb_produto (nome, preco, material, estoque) values ("Massa Corrida",77.90,"cálcio",500);
insert into tb_produto (nome, preco, material, estoque) values ("Tomada 2 polos",9.99,"PVC",1000);
insert into tb_produto (nome, preco, material, estoque) values ("Cabo de energia 2.5mm",204.49,"Cobre",200);
insert into tb_produto (nome, preco, material, estoque) values ("Tubo soldável 3 mts",25.99,"PVC",350);
insert into tb_produto (nome, preco, material, estoque) values ("Caixa de gordura",490.99,"PVC",200);
insert into tb_produto (nome, preco, material, estoque) values ("Azulejo de parede 1mt²",52.00,"Cerâmica",8000);

SET FOREIGN_KEY_CHECKS=1;

select * from tb_produto where preco > 50.00;
select * from tb_produto where preco >= 3.00 and preco <= 60.00;
select * from tb_produto where nome like "C%";

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_categoria = tb_produto.id_produto;

select nome, preco, estoque from tb_produto;

