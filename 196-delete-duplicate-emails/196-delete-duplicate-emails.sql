# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below


Delete from Person p1 where p1.id not in (select * from (select MIN(p2.id) from Person p2 group by p2.email) as res) 
