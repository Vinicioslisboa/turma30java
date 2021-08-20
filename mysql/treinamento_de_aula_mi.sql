CREATE DATABASE voo346

use voo346;

CREATE TABLE aviao(
id int auto_increment,
modelo varchar(30) not null,
primary key (id)
) engine = InnoDB;

describe aviao; -- mostra a tabela pedida com o seu tipo de variável

show tables; -- mostra todas as tabelas da DB

select * from aviao;

-- double peso -- 4 casas decimais
-- float numero cientifico -- 8 casas decimais
-- DECIMAL vc define o numero de 0

CREATE TABLE tripulantes(
id int auto_increment,
nome varchar(50) not null,
genero char(1) not null check (genero in ('F', 'M', 'N')),
primary key (id),
FOREIGN KEY (id) REFERENCES aviao(id)
) engine=InnoDB;

desc tripulantes;
select * from tripulantes;


INSERT INTO aviao (modelo) VALUES ("Airbus");
INSERT INTO aviao (modelo) VALUES ("Rayban");
INSERT INTO aviao (modelo) VALUES ("Boing");
INSERT INTO aviao (modelo) VALUES ("Boing");
INSERT INTO aviao (modelo) VALUES ("Airplain");

INSERT INTO tripulantes (nome, genero) VALUES ("Maria", 'F');
INSERT INTO tripulantes (nome, genero) VALUES ("João", 'M');
INSERT INTO tripulantes (nome, genero) VALUES ("Belkimendes", 'N');
INSERT INTO tripulantes (nome, genero) VALUES ("JP Albukeke", 'M');
INSERT INTO tripulantes (nome, genero) VALUES ("Michelle", 'M');

select * from tripulantes where genero = 'N';

SET SQL_SAFE_UPDATES = 0;

update tripulantes set genero = 'F' where id = 5;