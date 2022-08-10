# Write your MySQL query statement below


select distinct p1.email as Email from Person p1 where  exists  (select 1 from Person p2 where p1.id!=p2.id AND p1.email=p2.email)