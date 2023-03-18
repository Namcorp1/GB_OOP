file = open('seminar_3/russian.txt','r')
rec = open('seminar_3/rus.txt','w')
for line in file:
    if len(line) == 6:
        rec.write(line)
rec.close()