-- Monthly Transactions I

SELECT
    DATE_FORMAT(trans_date, '%Y-%m') AS month,
    country,  -- Groups results per country
    COUNT(id) AS trans_count,
    SUM(state = 'approved') AS approved_count, -- Number of approved transactions
    SUM(amount) AS trans_total_amount,   -- Sum of all transaction amounts
    SUM(IF (state = 'approved', amount, 0)) approved_total_amount
FROM Transactions
GROUP BY month, country;