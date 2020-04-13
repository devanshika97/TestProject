package strings;

public class StringIntroduction {

	public static void main(String[] args) {
		String name = "anuj";
		String name0="    anuj    ";
		String name1= "anuj";
		String name2="Anuj Kumar Sharma";
		String anotherName = new String("Anuj");
		String empty="";
		String cars="Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborgini";
		System.out.println(cars.indexOf('M'));
		System.out.println(cars.toLowerCase());
		System.out.println(cars.toUpperCase());
		String allCars[]=cars.split(",");
		for(String car:allCars) {
			System.out.println(car);
			
		}
		System.out.println(name0+"  "+name0.trim());
		System.out.println(name0.trim());
		
		
		System.out.println(name==anotherName);//false
		System.out.println(name==name1);//true
		System.out.println(name.equals(name1));//true
		System.out.println(empty.isEmpty());//true
		System.out.println(name.isEmpty());//false
		System.out.println(name.concat("sharma"));//anujsharma
		
		name = name+"Kumar";
		System.out.println(name);

		System.out.println(name.replace('a', 'A'));

		System.out.println(name2.length());//17
		System.out.println(name2.substring(5));//Kumar Sharma

		System.out.println(name2.substring(5,12));//Kumar S
		
		System.out.println(name2.contains("Anuj"));//True
		System.out.println(name2.contains("Aman"));//False


		
		System.out.println(name.charAt(0));//a
		System.out.println(name.charAt(1));//n
		System.out.println(name.charAt(2));//u
		System.out.println(name.charAt(3));//j
		//System.out.println(name.charAt(4));//error
	
		
		
	}

}
