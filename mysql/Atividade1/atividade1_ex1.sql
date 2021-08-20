CREATE DATABASE rh_service

use rh_service;

CREATE TABLE  funcionarios(
id bigint auto_increment,
nome varchar(30) not null,
idade int(2) not null,
setor varchar(25) not null,
cargo varchar(25) not null,
salario DECIMAL(8,2) not null,
primary key (id) 
);

select * from funcionarios

insert into funcionarios (nome, idade, setor, cargo, salario) values ("Ana Souza", 23, "Alimentação","Nutricionista",2550.00);
insert into funcionarios (nome, idade, setor, cargo, salario) values ("Anderson Silva", 29, "Segurança","Controlador de Acesso",1800.00);
insert into funcionarios (nome, idade, setor, cargo, salario) values ("Arnaldo Shulz", 41, "Almocharifado","Estoquista",2000.00);
insert into funcionarios (nome, idade, setor, cargo, salario) values ("Tober Mariguela", 38, "Serviços Gerais","Aux. serviços gerais",1238.00);
insert into funcionarios (nome, idade, setor, cargo, salario) values ("Jason Momocita", 33, "Secretaria","Auxiliar Administrativo",2100.00);

select * from funcionarios where salario > 2000;
select * from funcionarios where salario < 2000;



DELETE FROM funcionarios WHERE id = 6;