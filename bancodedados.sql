create database proj_dos_guri_2;

create table usuarios(
	id int primary key auto_increment,
    nome varchar(60),
    cpf varchar(15) unique,
    email varchar(50) unique,
    senha text
);

create table ongs(
	id int primary key auto_increment,
    nome varchar(50),
    cidade varchar(30),
    contato varchar(15),
    link varchar(60)
);

insert into ongs(nome, cidade, contato, link) values
( "ONG VolunPets 1", "São Paulo", "(11) 1234-5678",  "www.volumpet1.com"),
( "ONG VolunPets 2", "Rio de Janeiro", "(21) 9876-5432",  "www.volumpet2.com"),
( "ONG VolunPets 3", "Belo Horizonte", "(31) 3456-7890",  "www.volumpet3.com"),
( "ONG VolunPets 4", "Curitiba", "(41) 2345-6789",  "www.volumpet4.com"),
( "ONG VolunPets 5", "Porto Alegre", "(51) 9999-9999",  "www.volumpet5.com");
