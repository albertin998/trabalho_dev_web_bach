Create table CARGO(
	CARGO_ID Integer not null  auto_increment,
    DESCRICAO VARCHAR(255) not null,
        
    primary key (CARGO_ID)
);

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
    CARGO_ID Integer,
    NOME_EMPRESA VARCHAR(255),
    STATUS VARCHAR(1),
    IS_FUNCIONARIO BOOLEAN,
    IS_CLIENTE BOOLEAN,

    primary key (USUARIO_ID),
    CONSTRAINT fk_cargo_c FOREIGN KEY (CARGO_ID) REFERENCES CARGO (CARGO_ID)
);  

Create table SOLICITACAO(
	SOLICITACAO_ID Integer not null  auto_increment,
    USUARIO_ID INTEGER not null,
    DATA_CADASTRO DATE not null,	
	DATA_ENTREGA DATE not null,
	DESCRICAO VARCHAR(255),
	TEMPO_GASTO TIME,
        
    primary key (SOLICITACAO_ID),	
	CONSTRAINT fk_usuario_s FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (USUARIO_ID)
);

Create table ETAPA(
	ETAPA_ID Integer not null  auto_increment,
    DESCRICAO VARCHAR(255) not null,
        
    primary key (ETAPA_ID)
);


Create table TAREFA(
	TAREFA_ID Integer not null  auto_increment,
    USUARIO_ID INTEGER not null,
    DATA_CADASTRO DATE not null,	
	DATA_ENTREGA DATE not null,
	TEMPO_GASTO TIME,
	TEXTO BLOB,
	ETAPA_ID INTEGER NOT NULL,
	SOLICITACAO_ID INTEGER NOT NULL,
        
    primary key (TAREFA_ID),	
	CONSTRAINT fk_usuario_t FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (USUARIO_ID),
	CONSTRAINT fk_solicitacao_t FOREIGN KEY (SOLICITACAO_ID) REFERENCES SOLICITACAO (SOLICITACAO_ID),
    CONSTRAINT fk_etapa_t FOREIGN KEY (ETAPA_ID) REFERENCES ETAPA (ETAPA_ID)	
);
