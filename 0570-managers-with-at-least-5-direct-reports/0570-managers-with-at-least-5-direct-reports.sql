SELECT m.name
FROM Employee e
JOIN Employee m on e.managerId = m.id
GROUP BY m.id,m.name
HAVING COUNT(e.id)>=5 
