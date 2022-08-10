# Write your MySQL query statement below


SELECT cust.name as Customers from Customers cust left outer join Orders ord on cust.id = ord.customerId where  ord.id is null