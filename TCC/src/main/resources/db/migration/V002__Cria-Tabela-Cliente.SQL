Create table CLIENTE(
	CLIENTE_ID Integer not null  auto_increment,
    USUARIO_ID INTEGER not null,
    NOME_EMPRESA varchar(255) not null,	
	STATUS VARCHAR(1) not null,
        
    primary key (CLIENTE_ID),	
	CONSTRAINT fk_usuario_c FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (USUARIO_ID)
);