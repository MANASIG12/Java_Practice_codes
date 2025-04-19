class Volleyball{

	static String capt ="manasi";
	int toss = 0;

	static void Players(){
		System.out.println("Players name");
		System.out.println(capt);
		Volleyball obj1 = new Volleyball();
		System.out.println(obj1.toss);
        }
	void Result(){
		System.out.println("Serve or Defence");
                System.out.println(capt);
		System.out.println(toss);
        }
	public static void main(String[]args){
		Players();
		Volleyball obj2 = new Volleyball();
		obj2.Result();
		System.out.println(capt);
		System.out.println(obj2.toss);
        }
}

            
                
