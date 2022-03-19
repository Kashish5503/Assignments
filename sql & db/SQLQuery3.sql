select * from ORDERS;
Select ODATE, count(ONUM) from ORDERS group by ODATE order by count(ONUM);
select ODATE, AMT, SNUM, CNUM from ORDERS where AMT = (select max(AMT)  from ORDERS);
select ODATE, AMT, SNUM, CNUM from ORDERS where AMT = (select min(AMT)  from ORDERS);
select count(*) from ORDERS where ODATE = '03-10-94';
select *  from ORDERS where AMT > ( select avg(AMT)  from ORDERS where ODATE = '03-10-94');
