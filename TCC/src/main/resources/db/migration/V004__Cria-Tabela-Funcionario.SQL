Create table FUNCIONARIO(
	FUNCIONARIO_ID Integer not null  auto_increment,
    USUARIO_ID INTEGER not null,
    CARGO_ID INTEGER not null,	
	STATUS VARCHAR(1) not null,
        
    primary key (FUNCIONARIO_ID),	
	CONSTRAINT fk_usuario_f FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (USUARIO_ID),
    CONSTRAINT fk_cargo_f FOREIGN KEY (CARGO_ID) REFERENCES CARGO (CARGO_ID)	
);