# Write your MySQL query statement below



select Department,name as Employee,Salary from (select dpt.name as Department,emp.name,emp.salary,DENSE_RANK() OVER(PARTITION BY dpt.id ORDER BY emp.salary desc) as rankvalue  from Employee emp, Department dpt  where emp.departmentId=dpt.id ) as res where res.rankvalue <=3
#group by dpt.id having rank <4