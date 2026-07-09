'''
    Input : 

    "RJ Malini: hello listeners, aaj ka episode shuru karte hain\n"
    "Guest: thanks for having me Malini\n"
    "RJ Malini: toh baat karte hain aaj ke topic pe\n"
    "Guest: bilkul, main ready hoon\n";


    Output : 

    Turn 0 — Speaker: "RJ Malini" | Text: "hello listeners, aaj ka episode shuru karte hain"
    Turn 1 — Speaker: "Guest"     | Text: "thanks for having me Malini"
    Turn 2 — Speaker: "RJ Malini" | Text: "toh baat karte hain aaj ke topic pe"
    Turn 3 — Speaker: "Guest"     | Text: "bilkul, main ready hoon"

'''

str = "RJ Malini: hello listeners, aaj ka episode shuru karte hain\n Guest: thanks for having me Malini\n RJ Malini: toh baat karte hain aaj ke topic pe\nGuest: bilkul, main ready hoon\n"

lines = str.strip().split("\n")

for i in range(len(lines)):
    parts = lines[i].split(":")
    print("Turn",i,"-Speaker: ",parts[0],"| Text: ",parts[1])
