input = [750, 1, 5] #Initalizes the input

p = input[0] #1st integer is p, the initial population
n = input[1] #2nd integer is n, the number of people who have just been infected on a specific day
r = input[2] #3rd integer is r, the number of people that each infected person infects the next day

timeline = [] #initializes an empty list for the timeline of infections

timeline.append(n) #sets the value of day 0 to the initial number of people infected, which is n

while sum(timeline) <= p: #while the number of infected people is less than the population, continue to find out how many people just got infected
    n = n * r
    timeline.append(n)
    
if sum(timeline) > p: #once the number of people infected is greater than the population, print out the day at which that happened
    print(len(timeline) - 1)