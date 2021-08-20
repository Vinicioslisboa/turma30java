CREATE DATABASE  db_generation_game_online;

use db_generation_game_online;

CREATE TABLE tb_classe(
id_classe int(2) auto_increment,
raca varchar(20) not null,
especialidade varchar(30) not null,
tipo_de_arma varchar(20) not null,
primary key (id_classe)
) engine InnoDB;

select * from tb_classe;

ALTER TABLE tb_classe 
    CHANGE id id_classe bigint auto_increment;

CREATE TABLE tb_personagem(
id_personagem int auto_increment,
nome varchar(15) not null,
genero char(1) not null check (genero in ('F', 'M','N')),
ataque int(9)not null,
defesa int(9)not null,
personagem_principal boolean,
primary key (id_personagem),
foreign key (id_personagem) references tb_classe(id_classe)
) engine InnoDB;

insert into tb_classe (raca, especialidade, tipo_de_arma) values ("Paladino","Soldado","Lança");
insert into tb_classe (raca, especialidade, tipo_de_arma) values ("Assassino","Furtivo","Adagas");
insert into tb_classe (raca, especialidade, tipo_de_arma) values ("Caçador","Domador","Besta");
insert into tb_classe (raca, especialidade, tipo_de_arma) values ("Guerreiro","Defensor","Espada e Escudo");
insert into tb_classe (raca, especialidade, tipo_de_arma) values ("Mago","Elemental","Staff");

select * from tb_personagem;

update tb_classe set tipo_de_arma = "Espada e Escudo" where id_classe =5;

insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("Bartolomeu",'M',"9000","5000", true);
insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("Soler",'F',"12000","1899", true);
insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("ScrumMaster",'N',"7000","8000", true);
insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("TheRock",'M',"4000","3000", true);
insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("VinDiesel",'N',"2000","2000", false);
insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("Katarina",'F',"1375","2700", true);
insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("Avatar",'N',"3990","1000", false);
insert into tb_personagem (nome, genero, ataque, defesa, personagem_principal) values ("NormaBates",'F',"10000","9000", true);

delete from tb_personagem where id_personagem = 5

SET FOREIGN_KEY_CHECKS=1

select * from tb_personagem where ataque >2000
select * from tb_personagem where ataque > 1000 and ataque < 2000
select * from tb_personagem where nome like "C%"

select * from tb_personagem
inner join tb_classe 
on tb_personagem.id_personagem = tb_classe.id_classe;

select raca from tb_classe;


