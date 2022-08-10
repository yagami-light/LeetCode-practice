# Write your MySQL query statement below


select cust.name as Customers from Customers cust where NOT exists (select 1 from Orders ord where ord.customerId=cust.id)