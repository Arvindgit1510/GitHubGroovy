package code.microsystem

def x=0;

def result="";
switch(x){
	case 0:
	  result="Number is Zero";
	  break;
	  case {x>0}:
	  result="Number is greater than zero";
	  break;
	  case {x<0}:
	  result="Number is Smaller than Zero";
	  break;
	  default:
	  result="Invalid Number"
	  
}

println(result);