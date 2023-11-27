create table CUSTOMERS(
    id int generated always as identity unique,
    name varchar(50) not null,
    surname varchar(50) not null,
    age int not null,
    phone_number VARCHAR(12) not null,
    city_of_living VARCHAR(255) not null,
    CONSTRAINT pkd_customers primary key(id, name , surname)
);


