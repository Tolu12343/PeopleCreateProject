import java.util.*;
public class PeopleCreateMain {
 public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);
	PeopleCreate p1 = new PeopleCreate("Tolu", 27, "developer");
	PeopleCreate p2 = new PeopleCreate("Tola", 27, "developer");
	PeopleCreate p3 = new PeopleCreate("Sam", 24, "Sales Advisor");
	PeopleCreate p4 = new PeopleCreate("John", 19, "Lecturer");
	
	ArrayList<PeopleCreate> person = new ArrayList<>();
	person.add(p1);
	person.add(p2);
	person.add(p3);
	person.add(p4);
	
	for(PeopleCreate element: person) {
		System.out.println(element. formattoString());
	}
	
	
		System.out.println("Enter a name");
		String personName = user_input.next();
        for(PeopleCreate element: person) {
        	element.search(personName);
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/* Scanner userInput = new Scanner(System.in);
	 
	 List<String> namelist = new ArrayList<String>();
	 ArrayList<String> agelist = new ArrayList<String>();
	 ArrayList<String> jobTitleList = new ArrayList<String>();
	 Object[] personDetails = new Object[] {};
	 ArrayList<Object> personList = new ArrayList<Object>(Arrays.asList(personDetails));
	 int personAge;
	 String personName;
	 String personJobTitle;
	 
	 
	 List<String> jobTitlelist = new ArrayList<String>();
	 System.out.println("Follow the process to create a person");
	 while(true) {
		System.out.println("Enter the person\' name");
		personName = userInput.next();
		System.out.println("Enter the person\' age");
	    personAge = userInput.nextInt();
		System.out.println("Enter the person\' age");
		personJobTitle = userInput.next();
		namelist.add(personName);
		agelist.add(Integer.toString(personAge));
		jobTitlelist.add(personJobTitle);
		System.out.println("Do you want to continue? y or n");
		 char continueCheck = userInput.next().charAt(0);
		 if(continueCheck == 'n') {
			 break;
		 }
	 }
	 
	 for(int counter = 0; counter<namelist.size(); counter++) {
		 
		 PeopleCreate person = new PeopleCreate(namelist.get(counter), Integer.valueOf(agelist.get(counter)), jobTitlelist.get(counter));
		 personList.add(person);
		 
	 }
	 
	 for(int count = 0; count<personList.size();count++) {
		 for(int arrayCount = 0; arrayCount < namelist.size(); arrayCount++) {
			 ArrayList<>personList.get(count)
			 
			 .get(arrayCount);			 
		 }
	 }
 */	
	}
}
