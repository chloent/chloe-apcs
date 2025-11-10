public class Person 
{ 
	private String name; 
	private int numOfPets;
	public Person(String name,int numOfPets) 
	{ 
		this.name = name; 
		this.numOfPets=numOfPets;
	} 
	
	public String getName()
	{
		return name; 
	} 
	public int getNumOfPets()
	{ 
		return numOfPets;
	}
	public String getGreetings()
	{ 
		return("Hello my name is"+name+"I have"+numOfPets+"pets.");
	}
}
