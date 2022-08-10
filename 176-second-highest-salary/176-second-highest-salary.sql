# Write your MySQL query statement below


select(select distinct salary as SecondHighestSalary from Employee order by salary desc LIMIT 1,1) as SecondHighestSalary