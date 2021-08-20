CREATE DATABASE db_farmacia_do_bem;

use db_farmacia_do_bem;

CREATE TABLE tb_categoria(
id_categoria bigint(6) auto_increment,
fabricante varchar(25) not null,
tipo varchar(25) not null,
necessita_receita char(1) not null check (necessita_receita in('S','N')),
primary key(id_categoria)
)engine InnoDB;

select * from tb_produto;

CREATE TABLE tb_produto(
id_produto bigint auto_increment,
nome varchar(40) not null,
forma varchar(20),
valor DECIMAL(5,2) not null,
quantidade varchar(40) not null,
estoque boolean not null,
primary key(id_produto),
foreign key(id_produto) references tb_categoria(id_categoria)
)engine InnoDB;

insert into tb_categoria (fabricante, tipo, necessita_receita) values ("Fizer","Vacina",'S');
insert into tb_categoria (fabricante, tipo, necessita_receita) values ("Backer","Anti-térmico",'N');
insert into tb_categoria (fabricante, tipo, necessita_receita) values ("Medley","Anti-alérgico",'N');
insert into tb_categoria (fabricante, tipo, necessita_receita) values ("Órion","Ansiolítico",'S');
insert into tb_categoria (fabricante, tipo, necessita_receita) values ("Backer","Relaxante Muscular",'N');

insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("Pfizer","Injetável",250.00,"1 dose", false);
insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("Dipirona","Gota",8.00,"25 ml", true);
insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("Histamin","Comprimido",22.00,"20 comprimidos", true);
insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("Sossega Leão","Comprimido",150.00,"12 comprimidos", true);
insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("Anador","Comprimido",7.00,"4 comprimidos", true);
insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("CoronaVac","Injetável",98.00,"1 dose", false);
insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("Novalgina","Gota",35.00,"20 ml", true);
insert into tb_produto (nome, forma, valor, quantidade, estoque) values ("Nebacetin","Pomada",22.00,"100 gramas", false);

SET FOREIGN_KEY_CHECKS=1;

select * from tb_produto where valor > 50.00;
select * from tb_produto where valor >= 3.00 and valor < 61.00;
select * from tb_produto where nome like "%B%"; -- nao existe produtos com letra b por isso utilizei %B%, se fosse a letra inicial seria B%

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_categoria = tb_produto.id_produto;

select nome from tb_produto;