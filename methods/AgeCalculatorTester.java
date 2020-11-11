public class AgeCalculatorTester{


public static void main(String[] args)
{
	
	System.out.println("JVM invoked main");
	
	String ageInString=args[0];
	byte age=Byte.parseByte(ageInString) ;//type
	
	
	String ageType=AgeCalculator.ageDefinition(age);
	System.out.println("ageType :: "+ageType);
	
	
	String name="Bhagya";	
	System.out.println("name :: "+name);
	
	System.out.println("EXIT :: main");
	
}

}