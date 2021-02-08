#!/usr/bin/env python3

#   Challenge: Many people keep time using a 24 hour clock (11 is 11am and 23 is 11pm, 0 is midnight).
#   If it is currently 13 and you set your alarm to go off in 50 hours, it will be 15 (3pm).
#   Write a Python program to solve the general version of the above problem.
#   Ask the user for the time now (in hours), and then ask for the number of hours to wait for the alarm.
#   Your program should output what the time will be on the clock when the alarm goes off.

h = input("whats the time now: ")
w = input("when do you want the alarm to go off: ")
n = int(w)//24
alarm = int(h)+n
print(alarm)


#    It is possible to name the days 0 thru 6 where day 0 is Sunday and day 6 is Saturday.
#    If you go on a wonderful holiday leaving on day number 3 (a Wednesday)
#    and you return home after 10 nights you would return home on a Saturday (day 6).
#    Write a general version of the program which asks for the starting day number, and the length of your stay, and it will tell you the number of day of the week you will return on.

sd = input("enter starting day")
ls = input("length of stay")
howManySixsInls = int(ls)//6
ex=int(ls)-int(sd)
ar = ex-1
print(ar)

#Challenge: Take the sentence: All work and no play makes Jack a dull boy. Store each word in a separate variable, then print out the sentence on one line using print.

al = "All"
w = " work"
an = " and"
n = " no"
p = " play"
m = " makes"
j = " Jack"
a = " a"
d = " dull"
b = " boy"

print(al+w+an+n+p+m+j+a+d+b)
