#Implement an algorithm to determine if a string has all unique characters. What
#if you cannot use additional data structures?
def main():
    dataInput= input("Enter the String ");
    #checkUnique(dataInput);
    checkUniqueMap(dataInput)

def checkUnique(checkString):
    # declaring and feeling the array
    arrylist=[False for i in range(256)];
    for i in range(len(checkString)):
        # ord is function to get the Ascii char
        if (arrylist[ord(checkString[i])]):
            unquiestatus= False
            break
        else :
            arrylist[ord(checkString[i])]= True
            print (checkString[i])
            unquiestatus= True;
    if (unquiestatus) :
        print ("string has unique char")
    else :

        print ("string has not unique char")

def checkUniqueMap (checkString):
     newList=list(checkString)
     mynewList=[]
     for i in newList:
         if i not in mynewList:
             mynewList.append(i)
             unquieStatus= True
         else:
             unquieStatus= False
             break
     if (unquieStatus):
        print ("string has unique char in 2nd func")
     else:
        print ("string has not unique char in 2nd func")
       
main();
