drop table  if exists tb_user_discount;
drop table if exists tb_discount;


CREATE TABLE tb_discount (
    id serial  not null,
    discount_code varchar(8)  not null,
	CONSTRAINT PK_ID PRIMARY KEY (id)
);


create table tb_user_discount
(
	id serial  not null,
	house_id varchar(15) NOT NULL,
    	user_id varchar(10) not null,
   	 DISCOUNT_CODE_ID  INT not null,
	CONSTRAINT USER_PK_ID PRIMARY KEY (id),
	CONSTRAINT FK_ID FOREIGN KEY(DISCOUNT_CODE_ID)
        REFERENCES tb_discount(id)
);

insert into tb_discount (id,discount_code) values (1,'D0542A23');

