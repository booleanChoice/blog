create table user(
  id bigint unsigned primary key,
  name varchar(20),
  password varchar(20),
	create_time date,
  modified_time date
);