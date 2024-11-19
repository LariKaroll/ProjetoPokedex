create schema if not exists Pokedex default character set utf8;
use Pokedex;


create table if not exists tipo(
    id int not null auto_increment,
    tiponome varchar(60),
    primary key (id)
)engine = InnoDB;

create table if not exists regiao(
    id int not null auto_increment,
    regiaonome varchar(60),
    primary key (id)
)engine = InnoDB;

create table if not exists movimento(
    id int not null auto_increment,
    nome varchar(25) not null,
    dano int not null,
    descricao varchar(255),
    id_tipo int not null,
    primary key (id),
    foreign key (id_tipo) references tipo(id)
)engine = InnoDB;

/* select m.id, nome, dano, descricao, tiponome from movimento m inner join tipo on m.id_tipo = tipo.id order by m.id; */


create table if not exists habilidade(
    id int not null auto_increment,
    habilidadenome varchar(25) not null,
    descricao varchar(255),
    primary key (id)
)engine = InnoDB;

create table if not exists pokemon (  
    id int auto_increment,
    geracao int not null,
    nome varchar(25) not null,
    id_regiao int default null,
    id_habilidade int default null,
    id_tipo int default null,
    primary key (id),
    foreign key (id_habilidade) references habilidade(id),
    foreign key (id_regiao) references regiao(id),
    foreign key (id_tipo) references tipo(id)
)engine =InnoDB;

create table if not exists pokemon_relatorio(
    id int not null,
    nome varchar(50) not null,
    geracao int not null,
    nomeregiao int not null,
    nomehabilidade int default null,
    nometipo int not null,
    modificado_em datetime default null,
    acao varchar(50) not null,
    primary key (id)
)engine = InnoDB;

select * from pokemon_relatorio;

create table if not exists tipagem(
    id_pokemon int not null,
    id_tipo int not null,
    id_slot int not null,
    primary key (id_pokemon, id_slot),
    foreign key (id_tipo) references tipo(id)
    
)engine = InnoDB;

set DELIMITER $$

create procedure pokemon_total(inout contagempokemon int)
	begin
		select count(*) into contagempokemon from pokemon;
    end$$


create trigger relatorio_update_pokemon
before update on pokemon
	for each row 
		begin 
			insert into pokemon_relatorio
            set id = old.id,
            nome = old.nome,
            geracao = old.geracao,
            nomeregiao = old.id_regiao,
			nomehabilidade = old.id_habilidade,
			nometipo = old.id_tipo,
            modificado_em = now(),
            acao = 'update';
		end $$

create trigger relatorio_delete_pokemon
before delete on pokemon
	for each row 
		begin 
			insert into pokemon_relatorio
            set 
            nome = old.nome,
            geracao = old.geracao,
            nomeregiao = old.id_regiao,
			nomehabilidade = old.id_habilidade,
			nometipo = old.id_tipo,
            modificado_em = now(),
            acao = 'delete';
		end $$
        
/*create trigger relatorio_insert_pokemon after insert 
on pokemon
	for each row 
		begin 
			insert into pokemon_relatorio
            set id = new.id,
            nome = new.nome,
            geracao = new.geracao,
            nomeregiao = new.id_regiao,
			nomehabilidade = new.id_habilidade,
			nometipo = new.id_tipo,
            modificado_em = now(),
            acao = 'insert';
		end $$*/

	create function verifica_tipo(pokeid int)
	returns varchar(50)
    begin
		if (select count(t.id_pokemon) from tipagem t where t.id_pokemon = pokeid) = 2 then
			return "O Pokemon é Dual Type (Possui dois tipos)";
		else
			return "O Pokemon é Mono Type (Possui apenas um tipo)";
		end if;
	end$$
    
set DELIMITER ;

insert into tipo values (null,'Normal')
, (null,'Fire')
, (null,'Water')
, (null,'Grass')
, (null,'Electric')
, (null,'Ice')
, (null,'Fighting')
, (null,'Poison')
, (null,'Ground')
, (null,'Flying')
, (null,'Psychic')
, (null,'Bug')
, (null,'Rock')
, (null,'Ghost')
, (null,'Dragon')
, (null,'Dark')
, (null,'Steel')
, (null,'Fairy');

insert into regiao values (null,'Kanto')
, (null,'Jotho')
, (null,'Hoenn')
, (null,'Sinnoh')
, (null,'Unova')
, (null,'Kalos')
, (null,'Alola')
, (null,'Galar')
, (null,'Paldea'); 

insert into movimento values (null,'Water Shuriken',15,'Geralmente vai primeiro. Acerta 2-5 vezes em um turno.',3)
,(null,'Leaf Blade',90,'Alta taxa de acerto crítico.',4)
,(null,'Fire Blast',110,'10% de chance de queimar o alvo.',2);

insert into habilidade values (null,'Contrary','Se este Pokémon tiver um estágio de estatísticas aumentado, ele é rebaixado em vez disso, e vice-versa.')
,(null,'Solar Power','Se Sunny Day estiver ativo, este Pokémon Sp. Atk é 1.5x; perde 1/8 de HP máximo por volta.')
,(null,'Protean','Este tipo de Pokémon muda para corresponder ao tipo do movimento que está prestes a usar.')
,(null,'Static','30% de chance de um Pokémon fazer contato com este Pokémon ficar paralisado.');

insert into pokemon values 
(null,1,'Charizard',1,2,2)
,(null,5,'Serperior',5,1,4)
,(null,6,'Greninja',6,3,3)
,(null,1,'Pikachu',1,4,5)
,(null,2,'Pichu',1,4,5)
,(null,1,'Raichu',1,4,5)
,(null,9,'Meowscarada',9,3,4);

insert into tipagem values (6,2,1)
,(6,10,2)
,(497,4,1)
,(658,3,1)
,(658,16,2)
,(25,5,1)
,(26,5,1)
,(172,5,1)
,(908,4,1)
,(908,16,2); 



/*Inicio*/

	/*chamando a function*/
		select * from pokemon; /*chame esse select e coloque no parametro o id do pokemon*/
		select verifica_tipo(6); /*vai verificar a tipagem dele se e dual type ou mono type*/

	/*chamando o verificar a trigger*/
		/*A minha trigger ela faz uma log caso alguem faça algo de errado tenho todo o registro de alteração*/
			
			select * from pokemon_relatorio;
            
	/*chamando procedimento*/
		call pokemon_total(@totalpokemon);
        select @totalpokemon as TotalPokemons;

/*Fim*/
/*Inner Join*/
/*select pokemon.id as NDEX, pokemon.geracao as Geração, pokemon.nome as Nome, habilidade.habilidadenome as Habilidade,regiao.regiaonome as Região, tipo.tiponome as Tipo from pokemon 
	inner join tipagem on tipagem.id_pokemon = pokemon.id 
    inner join habilidade on habilidade.id = pokemon.id_habilidade 
    inner join regiao on regiao.id = pokemon.id_regiao 
    inner join tipo on tipo.id = tipagem.id_tipo;

/*Selects*/
/*select * from tipagem;
select * from pokemon;
select * from habilidade;
select * from regiao;
select * from tipo;

select p.id, p.geracao, p.nome, h.habilidadenome , r.regiaonome, t.tiponome from pokemon p join habilidade h on h.id = p.id_habilidade join regiao r on r.id = p.id_regiao join tipo t on t.id = p.id_tipo;

select pr.id, pr.geracao ,pr.nome, h.habilidadenome , r.regiaonome, t.tiponome, pr.modificado_em, pr.acao from pokemon_relatorio pr join habilidade h on h.id = pr.nomehabilidade join regiao r on r.id = pr.nomeregiao join tipo t on t.id = pr.nometipo order by pr.modificado_em;*/
