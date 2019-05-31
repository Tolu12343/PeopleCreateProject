
public class PeopleCreate {
 //method
	public String name; 
	public int age; 
	public String jobTitle;
	String concatedString;
	
	public PeopleCreate(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	} 
	
	public String formattoString() {
		String name_Result = this.name.toString();
		String age_result = Integer.toString(this.age);
		String jobtitle_result = this.jobTitle.toString();
	    concatedString = "";
		concatedString = concatedString + name_Result + age_result + jobtitle_result;
		return concatedString;
	} 
	public void search(String name) {
		if( this.name.equals(name)) {
			
			System.out.println(formattoString());
		}
		
	}
}
