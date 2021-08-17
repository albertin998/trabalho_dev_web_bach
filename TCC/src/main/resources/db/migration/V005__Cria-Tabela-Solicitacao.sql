Create table SOLICITACAO(
	SOLICITACAO_ID Integer not null  auto_increment,
    CLIENTE_ID INTEGER not null,
    DATA_CADASTRO DATE not null,	
	DATA_ENTREGA DATE not null,
	TEMPO_GASTO TIME not null,
        
    primary key (SOLICITACAO_ID),	
	CONSTRAINT fk_cliente_s FOREIGN KEY (CLIENTE_ID) REFERENCES CLIENTE (CLIENTE_ID)
);