package encapsulation;

public class EncapsulationIntroduction {
	public static void main(String args[]) {
		Student student = new Student();
		//student.name="Devanshika";
		 student.setAge(23);
		 System.out.println(student.getAge());//0
		 student.setAge(18);
		 System.out.println(student.getAge());//18
		 
		
	}

}
