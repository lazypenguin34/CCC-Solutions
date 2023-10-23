with open("C:\\Users\\Rainb\\Documents\\Coding\\CCC Practice Problems\\2020 Junior Contest\\dog treats data.txt", "r") as f: #reads data
    dogTreats = f.read().split("\n") #stores data as a list

dogTreats = [3, 2, 1]
smallTreats = dogTreats[0]
mediumTreats = dogTreats[1]
largeTreats = dogTreats[2]

if 1 * smallTreats + 2 * mediumTreats + 3 * largeTreats >= 10:
    print("happy")
else:
    print("sad")

