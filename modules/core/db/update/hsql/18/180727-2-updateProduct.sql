alter table QUICKSTART_PRODUCT alter column PRICE rename to PRICE__U29025 ^
alter table QUICKSTART_PRODUCT alter column PRICE__U29025 set null ;
alter table QUICKSTART_PRODUCT add column PRICE decimal(19, 2) ^
update QUICKSTART_PRODUCT set PRICE = 0 where PRICE is null ;
alter table QUICKSTART_PRODUCT alter column PRICE set not null ;
