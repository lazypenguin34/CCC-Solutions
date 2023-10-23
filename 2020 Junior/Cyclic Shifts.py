with open("Cyclic Shifts.txt", "r") as f:
    data = f.read().split("\n")

cyclicShifts = []
text = []
text.extend(data[1])

for l in data[1]:
    cyclicShifts.append("".join(text))
    text.append(text[0])
    text.pop(0)

if any(ele in data[0] for ele in cyclicShifts) == True:
    print("yes")
else:
    print("no")