-- Crie um banco de dados para um serviço de RH de uma empresa,
-- onde o sistema trabalhará com as informações 
-- dos funcionaries desta empresa. 

-- Crie uma tabela de funcionaries e utilizando a habilidade de abstração 
-- e determine 5 atributos relevantes dos funcionaries 
-- para se trabalhar com o serviço deste RH.

-- Popule esta tabela com até 5 dados;

-- Faça um select que retorne os funcionaries com o salário maior do que 2000.

-- Faça um select que retorne os funcionaries com o salário menor do que 2000.

-- Ao término atualize um dado desta tabela através de uma query de atualização.

-- Criar um banco de dados
create database db_rh;

-- Acessa o banco de dados
use db_rh;

-- Criar tabela
create table tb_rh(
id bigint auto_increment,
nome varchar(255) not null,
sexo varchar(255) not null,
matricula bigint not null,
salario decimal(6),
turno varchar(50) not null,
primary key(id)
);

-- Inserir uma informaçao na tabela
insert into tb_rh (nome,sexo,matricula,salario,turno) values ("Rafaela", "Feminino","12345", 1200.00, "Manhã" );
insert into tb_rh (nome,sexo,matricula,salario,turno) values ("Vitoria", "Feminino","123456", 2000.00, "Manhã" );
insert into tb_rh (nome,sexo,matricula,salario,turno) values ("Timothee", "Masculino","54321", 3000.00, "Tarde" );

-- Buscar alguma informação
select * from tb_rh where salario> 2000;
select * from tb_rh where salario < 2000;
select * from tb_rh;
update tb_rh set salario = 3000 where id = 2;