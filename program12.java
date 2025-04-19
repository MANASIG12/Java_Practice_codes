class BMW {

        static int empcount = 50000;
        int Models = 15;

        static void empDetails(){

                System.out.println("BMW emp Details = "+empcount);
        }

        void ModelDetails(){

                System.out.println("BMW Model Details = "+Models);
        }
}
class Toyota {

        static int empcount = 60000;
        int Models = 20;

        static void empDetails(){

                System.out.println("TATA emp Details = "+empcount);
        }

        void ModelDetails(){

                System.out.println("TATA Model Details = "+Models);
        }
}
class CarBrands {

        public static void main(String[]args) {
	
        BMW obj1 = new BMW();
	obj1.empDetails();
	obj1.Models = 20;
	obj1.ModelDetails();
	
	BMW obj2 = new BMW();
	obj2.empDetails();
	obj2.Models = 25;
	obj2.ModelDetails();
	
	Toyota obj3 = new Toyota();
	obj3.empDetails();
	obj3.Models = 30;
	obj3.ModelDetails();
	
        Toyota obj4 = new Toyota();
        obj4.empDetails();
        obj4.Models = 35;
        obj4.ModelDetails();
        } 
}


