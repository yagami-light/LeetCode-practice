# Write your MySQL query statement below
select name as customers from Customers where id not in(select cust.id from Customers cust,Orders ord where cust.id=ord.customerId )