month, day, year, time = input().split()
day = int(day[:-1])
year = int(year)
hour, minute = map(int, time.split(':'))
month_name_list = ["January" , "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"]
month_day_list = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
if year%400 == 0 or (year%4 == 0 and year%100 != 0):
    month_day_list[1] += 1
total_time = sum(month_day_list) * 24 * 60

last_month_index = month_name_list.index(month)
current_time = (sum(month_day_list[:last_month_index]) + day-1)*24*60 + hour*60 + minute
print(current_time/total_time * 100)
