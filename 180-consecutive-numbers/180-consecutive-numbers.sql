# Write your MySQL query statement below


SELECT DISTINCT a1.num as ConsecutiveNums FROM Logs a1,Logs a2,Logs a3 where a1.id+1=a2.id AND a1.num=a2.num AND a1.id+2=a3.id AND a1.num=a3.num