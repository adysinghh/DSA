-- 1148. Article Views I

# Write your MySQL query statement below
SELECT DISTINCT author_id AS id -- since we need new table with column name id
FROM Views
WHERE author_id = viewer_id -- to check if author viewed his own article
ORDER BY author_id ASC; -- to sort in ascending order