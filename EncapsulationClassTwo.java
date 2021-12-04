package Encapsulation;

public class EncapsulationClassTwo {
	public static void main(String[] args) {
		
		EncapsulationClassOne obj =new EncapsulationClassOne();
		
		 // Setting values of the variables
		obj.setAge(27);
		obj.setName("kishore");
		
		System.out.println("my name is "+obj.getName());
		System.out.println("my age is "+ obj.getAge());
	}

}
