package Encapsulation;

public class EncapsulationClass4 {

	public static void main(String[] args) {
		

		EncapsulationClass3 obj = new EncapsulationClass3();
		obj.setAge(27);
		obj.setName("praveen");
		
		System.out.println("may name is " +obj.getName());
		System.out.println("may age is "+ obj.getAge());
	}

}
