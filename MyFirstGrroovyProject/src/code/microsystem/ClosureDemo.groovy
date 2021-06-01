package code.microsystem

def str="Hello ";

def myclosure= {name ->println ("${str} ${name}")}

myclosure.call("Arvind");

def myList=["Apple","Grapse",[1,2,3,4,"Orange"],"Mango"];
println myList[2][4]
println myList.get(1)

println myList[0..3]
