CREATE DATABASE escola_db;

use escola_db;

CREATE TABLE estudantes (
id bigint auto_increment,
nome varchar(30) not null,
turma int(3) not null,
nota decimal(2,1),
periodo varchar(20),
ativo boolean,
primary key(id)
);

select * from estudantes

insert into estudantes (nome, turma, periodo, nota, ativo) values ("Ronaldinho Gaucho", 3, "Manhã", 9.7, true);
insert into estudantes (nome, turma, periodo, nota, ativo) values ("Hulk", 2, "Tarde", 7.7, true);
insert into estudantes (nome, turma, periodo, nota, ativo) values ("Tony Stark", 2, "Tarde", 8.9, false);
insert into estudantes (nome, turma, periodo, nota, ativo) values ("Pantera Negra", 2, "Tarde", 9.1, false);
insert into estudantes (nome, turma, periodo, nota, ativo) values ("Rivaldo", 3, "Manhã", 8.5, true);
insert into estudantes (nome, turma, periodo, nota, ativo) values ("Roberto Carlos", 3, "Manhã", 7.9, true);
insert into estudantes (nome, turma, periodo, nota, ativo) values ("Super Man", 1, "Noite", 9.9, true);
insert into estudantes (nome, turma, periodo, nota, ativo) values ("Bruce Banner", 1, "Noite", 5.9, true);

select * from estudantes where nota > 7;
select * from estudantes where nota < 7;