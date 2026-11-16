SELECT e.name,b.bonus FROM Employee as e
LEFT JOIN Bonus as b
on e.empId = b.empId
Where b.bonus<1000 OR b.bonus is null
