class OlympicMaha{

	//instance variable
	int medalcount = 1;
	
	//instance method
	void practice(){

		System.out.println("Hardwork");
		System.out.println("Medal = "+medalcount);
	}
	//static method
	static void ImpDecision(){

		System.out.println("CM Imp Dec");
	}
	//entry point -> static method
	public static void main(String[]args){

		OlympicMaha aug2024 = new OlympicMaha();

		aug2024.practice();
		aug2024.ImpDecision();

		OlympicMaha aug2028 = new OlympicMaha();

		aug2028.medalcount = 10;
		aug2028.practice();

	}
}
	
