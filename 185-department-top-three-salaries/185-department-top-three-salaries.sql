# Write your MySQL query statement below



select Department,Employee, Salary from (select dpt.name as Department,emp.name as Employee,emp.Salary,DENSE_RANK() OVER(PARTITION BY dpt.id ORDER BY emp.salary DESC) as "rankValue" from Employee emp,Department dpt where emp.departmentId=dpt.id) res where res.rankValue <4  