with open("Art.txt", "r") as f:
    paintDrops = f.read().split("\n")

paintDrops.pop(0) #removes the first item in the list cause you don't need it

#creates the two empty lists for the x and y coordinates respectively
xCoords = []
yCoords = []

for i in paintDrops:
    x, y = i.split(',')
    xCoords.append(int(x))
    yCoords.append(int(y))

bottomCorner = (min(xCoords) - 1, min(yCoords) - 1)
topCorner = (max(xCoords) + 1, max(yCoords) + 1)

print(bottomCorner)
print(topCorner)