WITH UserStats AS (
    SELECT 
        user_id,
        tokens,
        COUNT(*) OVER(PARTITION BY user_id) AS prompt_count,
        AVG(tokens) OVER(PARTITION BY user_id) AS avg_tokens_raw
    FROM prompts
)
SELECT 
    user_id,
    prompt_count,
    ROUND(avg_tokens_raw, 2) AS avg_tokens
FROM UserStats
WHERE prompt_count >= 3 AND tokens > avg_tokens_raw
GROUP BY user_id, prompt_count, avg_tokens_raw
ORDER BY avg_tokens DESC, user_id ASC;