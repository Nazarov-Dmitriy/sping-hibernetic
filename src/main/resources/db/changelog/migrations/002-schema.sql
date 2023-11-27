create table ORDERS(
    id int generated always as identity primary key,
    date date not null,
    customer_id int not null references CUSTOMERS(id),
    product_name varchar(50) not null,
    amount int not null
);


