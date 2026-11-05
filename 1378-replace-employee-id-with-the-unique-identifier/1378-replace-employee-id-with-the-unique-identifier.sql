SELECT uni.unique_id,e.name FROM EmployeeUNI as uni
RIGHT JOIN Employees as e
on uni.id = e.id

