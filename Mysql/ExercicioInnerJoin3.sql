create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
brinde boolean not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, brinde, ativo) values ("Remedios", false, true);
insert tb_categoria (descricao, brinde, ativo) values ("Produtos de Higiene Pessoal", true, true);
insert tb_categoria (descricao, brinde, ativo) values ("Cosméticos", true, true);
insert tb_categoria (descricao, brinde, ativo) values ("Plantas Medicinais", false, true);
insert tb_categoria (descricao, brinde, ativo) values ("Alimentos", false, true);

select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
nome varchar(255) not null,
marca varchar(255) not null,
vendaComPrescricao boolean not null,
quantidadeProduto int not null,
preco decimal not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("Sabonete", "Dove", false, 10, 8.30,2);
insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("Perfume", "Floratta", false, 10, 104.0,3);
insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("Pasta de Dente", "Colgate", false, 10, 15.0,2);
insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("AntiDepressivo", "Sertralina", true, 10, 40.0,1);
insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("Barra De Cereal", "Nutry", false, 10, 1.0,5);
insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("Analgésico", "Dorflex", false, 10, 10.0,1);
insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("Remedios Naturais", "Chá de Gervão ", false, 10, 13.0,4);
insert tb_produto (nome, marca, vendaComPrescricao, quantidadeProduto, preco, categoria_id) values ("Hidratante", "Nivea", false, 10, 25.0,3);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 AND 60;

select * from tb_produto where nome Like "%B%";

select * from tb_produto where nome Like "B%";

select nome, marca, vendaComPrescricao, quantidadeProduto, preco, tb_categoria.descricao as descricao_da_categoria,tb_categoria.brinde as brindes_do_produto, tb_categoria.ativo as estado_da_categoria
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;
 
  select * from tb_produto where tb_produto.marca like "Dove"; 
