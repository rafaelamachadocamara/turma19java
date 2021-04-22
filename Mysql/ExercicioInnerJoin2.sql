create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
brinde boolean not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, brinde, ativo) values ("Vegetariana", true, true);
insert tb_categoria (descricao, brinde, ativo) values ("Vegana", true, true);
insert tb_categoria (descricao, brinde, ativo) values ("Carne",false,true);
insert tb_categoria (descricao, brinde, ativo) values ("Frango",false,true);
insert tb_categoria (descricao, brinde, ativo) values ("Doce",false,true);

select * from tb_categoria;

create table tb_pizza (
id bigint auto_increment,
nome varchar (255) not null,
sabor varchar(255) not null,
bordaRecheada boolean not null,
quantidadeProduto int not null,
preco decimal not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("À Moda da Casa", "Mussarela", false, 10, 36.00,1);
insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("Oba Oba", "Frango Desfiado", true, 10, 40.00,4);
insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("Se Liga", "Calabresa", false, 10, 50.00,3);
insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("Floresta", "Brocolis", false, 10, 19.00,2);
insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("Veneza", "Presunto Cozido", true, 10, 59.00,3);
insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("Palmito Especial", "Palmito", false, 10, 32.00,2);
insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("Canadense", "Lombo desfiado", true, 10, 60.00,3);
insert tb_pizza (nome, sabor, bordaRecheada, quantidadeProduto, preco, categoria_id) values ("Festa", "Brigadeiro", true, 10, 60.00,5);

select * from tb_pizza;

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 AND 60;

select * from tb_pizza where sabor Like "%C%";

select nome, sabor, bordaRecheada, quantidadeProduto, preco, tb_categoria.descricao as descricao_da_categoria,tb_categoria.brinde as brindes_do_produto, tb_categoria.ativo as estado_da_categoria
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id;
 
   select * from tb_categoria where tb_categoria.descricao like "Vegetariana"; 
