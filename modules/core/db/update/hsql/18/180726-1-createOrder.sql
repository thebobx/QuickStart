create table QUICKSTART_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ timestamp,
    AMOUNT decimal(19, 2),
    CUSTOMER_ID varchar(36),
    --
    primary key (ID)
);
