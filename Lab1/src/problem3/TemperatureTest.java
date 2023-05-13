package problem3;

public class TemperatureTest {
	public static void main(String[] args) {
		Temperature Almaty = new Temperature('F');
		System.out.println(Almaty);
		
		Temperature Astana = new Temperature();
		System.out.println(Astana);
		
		Temperature NYC = new Temperature(45);
		System.out.println(NYC);
		
		Temperature Tokio = new Temperature('F', 32);
		System.out.println(Tokio.toString() + '\n');
		
		Almaty.setValue(33);
		System.out.println(Almaty);
		
		Astana.setScale('F');
		System.out.println(Astana);
		
		NYC.setValueScale(65, 'F');
		System.out.println(NYC);
		
		System.out.println(Tokio.degreesC());
	}
}
