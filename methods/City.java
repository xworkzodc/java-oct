public class City{



public static void main(String[] c)
{
	long phone=9834227704L;
	System.out.println("invoked main method from JVM");
	
	printPopulation();
	
	printDegreePercentage(67.9f);	
	printDegreePercentage(56.34f);
	printName("Om");
	printName("Madhu");
	//float degreePercentage=89.96f;
	
	//System.out.println("degreePercentage "+degreePercentage);
	
	//degreePercentage=78.96f;
	
	//System.out.println("degreePercentage "+degreePercentage);
	
	//degreePercentage=57.9f;
	
	//System.out.println("degreePercentage "+degreePercentage);
	
}

      public static void printPopulation()
	  {
	  System.out.println("invoked printPopulation");	

	  }
	  
	  
	  public static void printDegreePercentage(float degreePercentageParam)
		{
			  System.out.println("degreePercentage "+degreePercentageParam);
			  
		  }
		  
      public static void printName(String name){
		  System.out.println("name "+name);
	  }


}