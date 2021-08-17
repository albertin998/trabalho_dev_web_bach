Create table TAREFA(
	TAREFA_ID Integer not null  auto_increment,
    FUNCIONARIO_ID INTEGER not null,
    DATA_CADASTRO DATE not null,	
	DATA_ENTREGA DATE not null,
	TEMPO_GASTO TIME not null,
	TEXTO BLOB,
	ETAPA_ID INTEGER NOT NULL,
	SOLICITACAO_ID INTEGER NOT NULL,
        
    primary key (TAREFA_ID),	
	CONSTRAINT fk_funcionario_t FOREIGN KEY (FUNCIONARIO_ID) REFERENCES FUNCIONARIO (FUNCIONARIO_ID),
	CONSTRAINT fk_solicitacao_t FOREIGN KEY (SOLICITACAO_ID) REFERENCES SOLICITACAO (SOLICITACAO_ID),
    CONSTRAINT fk_etapa_t FOREIGN KEY (ETAPA_ID) REFERENCES ETAPA (ETAPA_ID)	
);