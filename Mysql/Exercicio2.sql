-- Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos 
-- produtos deste ecommerce. 

-- Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos produtos para se trabalhar com o serviço deste ecommerce.

-- Popule esta tabela com até 8 dados;

-- Faça um select que retorne os produtos com o valor maior do que 500.

-- Faça um select que retorne os produtos com o valor menor do que 500.

-- Ao término atualize um dado desta tabela através de uma query de atualização.

-- Criar um banco de dados
create database db_loja;

-- Acessa o banco de dados
use db_loja;

-- Criar tabela
create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
descricao varchar (255) not null,
tamanho varchar(1) not null,
marca varchar(255) not null, 
preco decimal(5),
primary key(id)
);

-- Inserir uma informaçao na tabela
insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Camiseta", "Manga Longa","P", "Nike", 89.90);
insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Moletom", "Canguru","G", "Vans", 250.90);
insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Calça", "Moletom","M", "Adidas", 99.90);
insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Regata", "Feminina","P", "Nike", 59.90);
insert into tb_produtos(nome,descricao,tamanho,marca,preco) values ("Camiseta", "Manga Curta","F", "Blunt", 69.90);
insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Bermuda", "Tactel","M", "NikeSB", 79.90);
insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Boné", "Estampado","G", "Vans", 109.90);
insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Touca", "Pompom","M", "BrutalKill", 67.78);

-- Buscar alguma informação
select * from tb_produtos;

insert into tb_produtos (nome,descricao,tamanho,marca,preco) values ("Skate", "Stree Skate","3", "Vans", 660.0);

select * from tb_produtos where preco> 500;
select * from tb_produtos where preco < 500;

-- Atualização de dados
update tb_produtos set preco = 49.90 where id = 6;
