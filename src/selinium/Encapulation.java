package selinium;



class Person {
    private String name;
    private int age;
  
    public String getName() { return name; }
  
    public void setName(String name) { this.name = name; }
  
    public int getAge() { return age; }
  
    public void setAge(int age) { this.age = age; }
}

public class Encapulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
        person.setName("razaq");
        person.setAge(24);
  
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
	}

}
