CREATE DATABASE db_pizzaria_legal;

use db_pizzaria_legal;

CREATE TABLE tb_categoria(
id_categoria int auto_increment, 
doce boolean,
tradicional boolean,
especial boolean,
primary key(id_categoria)
) engine InnoDB;


CREATE TABLE tb_pizza(
id_pizza int auto_increment,
sabor1 varchar(25) not null,
sabor2 varchar(25),
tamanho char(1) not null check (tamanho in('P', 'M', 'G')),
valor1 DECIMAL(5,2),
valor2 DECIMAL(5,2),
total DECIMAL(5,2),
primary key(id_pizza),
foreign key(id_pizza) references tb_categoria(id_categoria)
)engine InnoDB;

insert into tb_categoria (doce, tradicional, especial) values (true, false, false);
insert into tb_categoria (doce, tradicional, especial) values (true, false, false);
insert into tb_categoria (doce, tradicional, especial) values (false, true, false);
insert into tb_categoria (doce, tradicional, especial) values (false, false, true);
insert into tb_categoria (doce, tradicional, especial) values (false, false, true);

select * from tb_pizza;

update tb_pizza set total =67.00 where id_pizza=1;

insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Morango", "Nutella", 'G',65.00,69.00,67.00);
insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Banana c/ Leite Cond.", "Nutella", 'G',69.00,69.00,(69.00+69.00)/2);
insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Muzzarela", "Calabresa", 'G',40.00,42.00,(40.00+42.00)/2);
insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Cacciatore", "Cacciofini", 'M',60.00,48.50,(60.00+48.50)/2);
insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Carpaccio", "La glória", 'G',80.00,89.00,(80.00+89.00)/2);
insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Morango", "", 'P',35.00,0,35.00);
insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Nutella", "Banana c/ Leite Cond.", 'M',51.00,51.00,(51.00+51.00)/2);
insert into tb_pizza (sabor1, sabor2, tamanho, valor1, valor2, total) values ("Milho", "Carne seca", 'G',40.00,55.00,(40.00+55.00)/2);

SET FOREIGN_KEY_CHECKS=1;

select * from tb_pizza where total > 45.00;
select * from tb_pizza where total > 29.00 and total <= 60;
select * from tb_pizza where sabor1 or sabor2 like "C%";

select * from tb_categoria
inner join tb_pizza
on tb_categoria.id_categoria = tb_pizza.id_pizza;

select doce from tb_categoria

