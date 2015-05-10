#!/usr/bin/python
branches = 100 
sum = 0
oldsum = 0
for i in range(1,branches+1):
    sum = sum + i
    print('      } else if (count < '+str(sum)+'0000000l) {')
    print('        if(VERBOSE && count=='+ str(oldsum) + '0000000l) System.out.println("> Taking branch: " + ' + str(i)+'+ " <");')  
    print('        count = count + '+str(i)+';')
    oldsum = sum

