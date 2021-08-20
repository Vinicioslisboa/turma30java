CREATE DATABASE db_cidade_das_frutas;

use db_cidade_das_frutas;

CREATE TABLE tb_categoria(
id_categoria bigint auto_increment,
localidade varchar(20) not null,
fragil boolean not null,
tipo_categoria char(1) not null check (tipo_categoria in('F','L','H')),
primary key(id_categoria)
) engine InnoDB;

select * from tb_categoria;

CREATE TABLE tb_produto(
id_produto bigint auto_increment,
nome varchar(20) not null,
peso double(9,2) not null,
tipo_produto char(1) not null check (tipo_produto in('F','L','H')),
valor DECIMAL(5,2) not null,
estado varchar(20) check (estado in("Fresco", "Congelado")),
primary key(id_produto),
foreign key(id_produto) references tb_categoria(id_categoria)
)engine InnoDB;

insert into tb_categoria (localidade, fragil, tipo_categoria) values ("Importado", true, 'F');
insert into tb_categoria (localidade, fragil, tipo_categoria) values ("Nacional", true, 'H');
insert into tb_categoria (localidade, fragil, tipo_categoria) values ("Nacional", false, 'F');
insert into tb_categoria (localidade, fragil, tipo_categoria) values ("Importado", true, 'L');
insert into tb_categoria (localidade, fragil, tipo_categoria) values ("Importado", true, 'F');

select * from tb_produto;

insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Uva verde", 500.00 , 'F', 8.00, "Fresco");
insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Rúcula", 100.00 , 'H', 10.00, "Fresco");
insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Pêssego", 280.00 , 'F', 17.00, "Congelado");
insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Chuchu", 500.00 , 'L', 5.00, "Fresco");
insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Melancia", 6000.00 , 'F', 25.00, "Fresco");
insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Tangerina", 1000.00 , 'F', 9.00, "Fresco");
insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Couve", 80.00 , 'H', 4.50, "Fresco");
insert into tb_produto (nome, peso, tipo_produto, valor, estado) values ("Banana", 150.00 , 'F', 6.00, "Congelado");

SET FOREIGN_KEY_CHECKS=1;

select * from tb_produto where valor > 50.00;
select * from tb_produto where valor >= 3.00 and valor < 61.00;
select * from tb_produto where nome like "C%";

select * from tb_categoria
inner join tb_produto
on tb_categoria.id_categoria = tb_produto.id_produto;

select nome, tipo_produto from tb_produto;

