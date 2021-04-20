-- Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará 
-- com as informações dos alunos deste registro dessa escola. 

-- Crie uma tabela alunos/a/e e utilizando a habilidade de abstração
-- e determine 5 atributos relevantes dos alunos/a/e para se trabalhar com o serviço dessa escola.

-- Popule esta tabela com até 8 dados;

-- Faça um select que retorne o/as alunos/a/e com a nota maior do que 7.

-- Faça um select que retorne o/as alunos/a/e com a nota menor do que 7.

-- Ao término atualize um dado desta tabela através de uma query de atualização.

-- Criar um banco de dados
create database db_escola;

-- Acessa o banco de dados
use db_escola;

-- Criar tabela
create table tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
matricula varchar(6) not null,
sexo varchar(255) not null,
turno varchar(50) not null,
nota decimal(6),
primary key(id)
);

-- Inserir uma informaçao na tabela
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Rafaela", "123456","Feminino", "Manhã", 8.9);
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Vitoria", "654321","Feminino", "Manhã", 10);
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Marcelo", "864557","Masculino", "Noite", 5.9);
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Timothee", "967354","Masculino", "Tarde", 3.9);
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Ryan", "491738","Masculino", "Manhã", 9.5);
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Pietra", "784529","Feminino", "Noite", 7.0);
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Marcos", "76409","Masculino", "Tarde", 6.0);
insert into tb_alunos (nome,matricula,sexo,turno,nota) values ("Paula", "653890","Feminino", "Manhã", 8.9);

-- Buscar alguma informação
select * from tb_alunos;
select * from tb_alunos where nota > 7;
select * from tb_alunos where nota < 7;

-- Atualização de dados
update tb_alunos set nota = 8 where id = 5;

-- Buscar alguma informação (novamente)
select * from tb_alunos;

-- Deletar Alguma informação
delete from tb_alunos where id = 3;
delete from tb_alunos where id = 10;
delete from tb_alunos where id = 7;
delete from tb_alunos where id = 12;
delete from tb_alunos where id = 12;

-- Buscar alguma informação (novamente)
select * from tb_alunos;

-- Deletar Alguma informação (novamente)
delete from tb_alunos where id = 13;
