class Demo{

	//entry point function 
	public static void main(String [] args){

	//local variables
	  byte a = 5;
	  byte b = 4;

	//object creation to call instance methods
		
	  Demo obj1 = new Demo();

	//calling instance 4 methods on object
	
	  int byteAdd = obj1.byteAdd(a,b);
	  System.out.println("Byte + Byte = Integer "+"(Addition is) = " +byteAdd);

	  int byteSub = obj1.byteSub(a,b);
	  System.out.println("Byte - Byte = Integer "+"(Subtraction is) = " +byteSub);

	  int byteMul = obj1.byteMul(a,b);
	  System.out.println("Byte * Byte = Integer "+"(Multiplicaton is) = " +byteMul);

	  int byteDiv = obj1.byteDiv(a,b);
	  System.out.println("Byte / Byte = Integer "+"(Division is) = " +byteDiv);

	  int byteMod = obj1.byteMod(a,b);
	  System.out.println("Byte % Byte = Integer "+"(Modular is) = " +byteMod);

	}
	//byteAdd() function to add 2 bytes
	  int byteAdd(byte a, byte b){
		  int result = a + b;
		  return(result);
	  }

	//byteSub() funtion to sub 2 bytes
	  int byteSub(byte a, byte b){
		  int result = a - b;
		  return(result);
	  }

	//byteMul() function to mul 2 bytes
	  int byteMul(byte a, byte b){
		  int result = a * b;
		  return(result);
	  }

	//byteDiv() function to mul 2 bytes
	  int byteDiv(byte a, byte b){
		  int result = a / b;
		  return(result);
          }

	//byteMod() function to Mod 2 bytes
	  int byteMod(byte a, byte b){
		  int result = a % b;
		  return(result);
	  }
}
