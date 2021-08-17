Create table USUARIO(
	USUARIO_ID Integer not null  auto_increment,
    NOME varchar(60) not null,
    TELEFONE varchar(25) not null,	
	TIPO_DOCUMENTO VARCHAR(4) not null,
	DOCUMENTO VARCHAR(15) not null,	
    EMAIL varchar(255) not null,
	SEXO VARCHAR(1) not null,
	DATA_CADASTRO DATE not null,
	LOGIN VARCHAR(255) not null,
	SENHA VARCHAR(255) not null,
        
    primary key (USUARIO_ID)
);