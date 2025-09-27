# Write your MySQL query statement below
SELECT 
    pro.product_name,
    sal.year,
    sal.price
From Sales sal
INNER JOIN Product pro
    ON sal.product_id = pro.product_id

-- SELECT year, price, product_name
-- FROM Sales
-- JOIN Product on Sales.product_id = Product.product_id