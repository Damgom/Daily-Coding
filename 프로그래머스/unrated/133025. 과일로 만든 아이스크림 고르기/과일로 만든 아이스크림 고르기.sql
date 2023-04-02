-- 코드를 입력하세요
SELECT first_half.flavor from first_half
join icecream_info
on first_half.flavor = icecream_info.flavor
where total_order > 3000 and ingredient_type like "fruit_based"
order by total_order desc;