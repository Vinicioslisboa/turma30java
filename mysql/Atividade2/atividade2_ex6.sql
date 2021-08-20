CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
id_categoria bigint auto_increment,
tipo varchar(30) not null, -- UX, Back, Front, Design
formato varchar(10) not null check (formato in("Presencial", "Online")),
duracao_aula varchar(10) not null ,
primary key(id_categoria)
) engine InnoDB;

select * from tb_categoria;

CREATE TABLE tb_produto(
id_produto bigint auto_increment,
nome varchar(40) not null,
preco DECIMAL(6,2) not null,
duracao varchar(20) not null,
max_turma int(2) not null,
aberto varchar(25),
primary key(id_produto),
foreign key(id_produto) references tb_categoria(id_categoria)
)engine InnoDB;

select * from tb_produto;

insert into tb_categoria (tipo, formato, duracao_aula) values ("Officer", "Online", "3 horas");
insert into tb_categoria (tipo, formato, duracao_aula) values ("Back-end", "Presencial", "5 horas");
insert into tb_categoria (tipo, formato, duracao_aula) values ("Front-end", "Online", "5 horas");
insert into tb_categoria (tipo, formato, duracao_aula) values ("UX Design", "Online", "2 horas");
insert into tb_categoria (tipo, formato, duracao_aula) values ("Front-end", "Presencial", "5 horas");

insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("Excel", 89.90, "1 Mês",40,"3 vezes ao ano");
insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("MySQL", 90.00, "1 Mês",40,"4 vezes ao ano");
insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("ReactJS", 299.00, "3 Mês",25,"4 vezes ao ano");
insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("PhotoShop", 120.90, "3 Mês",30,"3 vezes ao ano");
insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("HTML", 60.00, "1 Mês",40,"6 vezes ao ano");
insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("Power-Ponit", 89.90, "1 Mês",40,"3 vezes ao ano");
insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("Java", 180.00, "3 Mês",20,"3 vezes ao ano");
insert into tb_produto (nome, preco, duracao, max_turma, aberto) values ("CSS", 60.00, "1 Mês",40,"6 vezes ao ano");

SET FOREIGN_KEY_CHECKS=1;

select * from tb_produto where preco > 50.00;
select * from tb_produto where preco >= 3.00 and preco <= 60;
select * from tb_produto where nome like "J%";

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_categoria = tb_produto.id_produto;

select nome, preco, duracao from tb_produto;




