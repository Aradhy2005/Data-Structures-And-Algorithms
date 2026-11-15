SELECT id,movie,description,rating
FROM Cinema
Where id % 2 != 0
AND description != 'boring'
Order BY rating DESC
