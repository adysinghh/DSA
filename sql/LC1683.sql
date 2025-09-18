-- LC1683: Find Tweets With Content Longer Than 15 Characters

SELECT tweet_id
FROM Tweets
WHERE length(content) > 15; -- CHARACTER_LENGTH increses time complexity, significantly.