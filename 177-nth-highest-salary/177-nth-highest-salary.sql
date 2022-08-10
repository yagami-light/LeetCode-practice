CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      # Select N= N-1;
      

      select salary as SecondHighestSalary from (select salary, DENSE_RANK() OVER (ORDER by salary desc) as row_rank from Employee ) as tab where row_rank=N limit 0,1
      # select salary as SecondHighestSalary from (select salary, DENSE_RANK() OVER (ORDER by salary desc) as row_rank from Employee ) as tab where row_rank=N limit 0,1

      
  );
END