public class AddressTester{


public static void main(String[] values)
{

System.out.println("JVM Invoked main ");
        //left			right
         short door=Address.doorNo;

			System.out.println("door "+ door);
			
			
			String st=Address.street;
        System.out.println("st "+ st);
		
		System.out.println("pin code "+ Address.pinCode);
		System.out.println("City"+ Address.city);
		
		Address.doorNo=43;
		System.out.println("updated door no"+ Address.doorNo);
		Address.doorNo=57;
		System.out.println("updated door no"+ Address.doorNo);
		
		
		String city=Address.city;
		System.out.println("local City"+ city);
		city="Mysore";
		System.out.println("local City"+ city);
		System.out.println("Address City"+ Address.city);
		Address.city="Hubli";
		System.out.println("Address City"+ Address.city);
     
System.out.println("EXIT :: MAIN");

}

}