create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
nomeAluno varchar(255) not null,
sexo varchar(255) not null,
matricula bigint not null,
primary key (id)
);

insert tb_categoria (nomeAluno, sexo, matricula) values ("Rafaela", "Feminino", "12345");
insert tb_categoria (nomeAluno, sexo, matricula) values ("Vitoria", "Feminino", "54321");
insert tb_categoria (nomeAluno, sexo, matricula) values ("Timothee", "Masculino", "67890");
insert tb_categoria (nomeAluno, sexo, matricula) values ("Ryan", "Masculino", "63759");
insert tb_categoria (nomeAluno, sexo, matricula) values ("Anya", "Feminino", "98543");

select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
nomeCurso varchar(255) not null,
area varchar(255) not null,
tempoDuracao decimal not null,
horasExtras int not null,
preco decimal not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("Design Para Iniciantes", "Design Grafico", 48, 5, 120.0,1);
insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("JavaScript Para Iniciantes", "Programação", 65, 10, 155.0,1);
insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("Inglês Avançado", "Linguas Estrangeiras", 230, 5, 56.0,2);
insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("Francês Básico", "Linguas Estrangeiras", 132, 23, 89.0,2);
insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("Design Para Iniciantes", "Design Grafico", 48, 5, 120.0,1);
insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("Nutrição", "Saúde Geral", 6, 3, 55.0,4);
insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("Mysql Para Iniciantes", "Programação", 10, 1, 55.0,5);
insert tb_produto (nomeCurso, area, tempoDuracao, horasExtras, preco, categoria_id) values ("Inteligência Emocional", "Desenvolvimento de carreira", 2, 0, 15.0,3);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 AND 60;

select * from tb_produto where nomeCurso Like "J%";

select * from tb_produto where nomeCurso Like "%J%";

select nomeCurso, area, tempoDuracao, horasExtras, preco, tb_categoria.nomeAluno as nome_dos_alunos,tb_categoria.sexo as genero_dos_alunos, tb_categoria.matricula as matricula_dos_alunos
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;

  select * from tb_produto where tb_produto.area like "Programação";
