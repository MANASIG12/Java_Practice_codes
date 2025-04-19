class Demo{

        //entry point function
        public static void main(String [] args){

        //local variables
          short a = 10;
          short b = 20;

        //object creation to call instance methods

          Demo obj1 = new Demo();

        //calling instance 4 methods on object

          int shortAdd = obj1.shortAdd(a,b);
          System.out.println("short + short = Integer "+"(Addition is) = " +shortAdd);

          int shortSub = obj1.shortSub(a,b);
          System.out.println("short - short = Integer "+"(Subtraction is) = " +shortSub);

          int shortMul = obj1.shortMul(a,b);
          System.out.println("short * short = Integer "+"(Multiplicaton is) = " +shortMul);

          int shortDiv = obj1.shortDiv(a,b);
          System.out.println("short / short = Integer "+"(Division is) = " +shortDiv);

          int shortMod = obj1.shortMod(a,b);
          System.out.println("short % short = Integer "+"(Modular is) = " +shortMod);

        }
        //shortAdd() function to add 2 bytes
          int shortAdd(short a, short b){
                  int result = a + b;
                  return(result);
          }

        //shortSub() funtion to sub 2 bytes
          int shortSub(short a, short b){
                  int result = a - b;
		  return(result);
	  }		  
	//shortMul() function to mul 2 bytes
	  int shortMul(short a, short b){
		  int result = a * b;
		  return(result);
	  }
	//shortDiv() function to div 2 bytes
	  int shortDiv(short a, short b){
		  int result = a / b;
		  return(result);
	  }
        //shortMod() function to mod 2 bytes
          int shortMod(short a, short b){
		  int result = a % b;
		  return(result);
	  }
}
