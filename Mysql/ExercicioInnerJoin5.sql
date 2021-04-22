create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
brinde boolean not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, brinde, ativo) values ("Materiais de Decoração", true, true);
insert tb_categoria (descricao, brinde, ativo) values ("Materiais hidráulicos", false, true);
insert tb_categoria (descricao, brinde, ativo) values ("Materiais elétricos", false, true);
insert tb_categoria (descricao, brinde, ativo) values ("Materiais para Construção", false, true);
insert tb_categoria (descricao, brinde, ativo) values ("Tintas", true, true);

select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
nome varchar(255) not null,
marca varchar(255) not null,
restriçaoDeQuantidade boolean not null,
quantidadeProduto int not null,
preco decimal not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Tijolo", "Tijolo Refratário", false, 10, 6.50,4);
insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Tubo Soldável", "Tigre", false, 10, 34.90,2);
insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Caixa d'água", "Fortlev", true, 10, 270.0,2);
insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Interruptor", "Alumbra", false, 10, 15.0,3);
insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Fita Isolante", "Scotch", false, 10, 20.0,3);
insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Piso Cerâmicos", "Formigres", false, 10, 20.90,4);
insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Tinta Acrilica Branca", "Suvinil", false, 10, 120.0,5);
insert tb_produto (nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, categoria_id) values ("Papel De Parede Adesivo", "Grudado", false, 10, 80.0,1);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 AND 60;

select * from tb_produto where nome Like "C%";

select * from tb_produto where nome Like "%C%";

select nome, marca, restriçaoDeQuantidade, quantidadeProduto, preco, tb_categoria.descricao as descricao_da_categoria,tb_categoria.brinde as brindes_do_produto, tb_categoria.ativo as estado_da_categoria
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;

  select * from tb_categoria where tb_categoria.descricao like "Materiais elétricos"; 

  select * from tb_categoria where tb_categoria.descricao like "Materiais de Decoração"; 


