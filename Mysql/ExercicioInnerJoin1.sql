create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
login varchar(255) not null,
servidor bigint not null,
comunidade varchar(255) not null,
primary key (id)
);

insert tb_classe (login, servidor, comunidade) values ("User e Senha","1","Goblet Fire");
insert tb_classe (login, servidor, comunidade) values ("Facebook","2","Dragonforce");
insert tb_classe (login, servidor, comunidade) values ("Conta Google","3","Team Infamous");
insert tb_classe (login, servidor, comunidade) values ("Twitter","4","Mayhem");
insert tb_classe (login, servidor, comunidade) values ("Youtube","5","Kingsland");

select * from tb_classe;

create table tb_personagem (
id bigint auto_increment,
nome varchar (255) not null,
classe varchar (255) not null,
poder varchar (255) not null,
ataque bigint not null,
defesa bigint not null,
classe_id bigint,
primary key (id),
FOREIGN KEY (classe_id) REFERENCES tb_classe (id)
);

insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Oruxeor", "Mago","Cura","9","12",1);
insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Girardus", "Guerreiro","Marcial","2000","1000",2);
insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Skullblood", "Paladino","Espada Sagrada","2578","1200",3);
insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Alyndra", "Elfo","Persuasão","834","1004",1);
insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Vorsath", "Dragão","Sopro de Fogo","5024","3200",2);
insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Astares", "Centauro","Terremoto","723","650",4);
insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Flint", "Lobisomem","Velocidade","102","95",5);
insert tb_personagem (nome, classe, poder, ataque, defesa, classe_id) values ("Nokomis", "Vampiro","Hipnose","267","126",5);

select * from tb_personagem;

select * from tb_personagem where ataque > 2000;

select * from tb_personagem where defesa between 1000 AND 2000;

select * from tb_personagem where nome Like "%C%";

select tb_classe.login, tb_classe.servidor,tb_classe.comunidade
 from tb_personagem inner join tb_classe on  tb_classe.id = tb_personagem.classe_id;
 
select nome, classe, poder, ataque, defesa, tb_classe.id as forma_de_login ,tb_classe.servidor as servidor_escolhido, tb_classe.comunidade as clas_do_jogador
 from tb_personagem inner join tb_classe on  tb_classe.id = tb_personagem.classe_id;

 select * from tb_personagem where tb_personagem.classe like "Mago"; postagem
 
 