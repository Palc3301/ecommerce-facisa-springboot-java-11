create table PESSOA(
    id int auto_increment primary key,
    nome varchar not null,
    email varchar not null unique
)