# Write your MySQL query statement below


select dp.name as Department,emp1.name as Employee,emp1.salary from Employee emp1,
(select dp.id,max(emp.salary) as maxSalary from Employee emp, Department dp where emp.departmentId=dp.id group by dp.id) as emp2,
Department dp where dp.id=emp2.id and emp1.salary=emp2.maxSalary AND emp1.departmentId=dp.id