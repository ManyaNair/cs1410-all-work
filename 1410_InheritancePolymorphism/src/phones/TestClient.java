package phones;

public class TestClient
{
	public static void main(String[] args)
	{
		Phone phonetest1 = new RotaryPhone("Model 500", new Dimension(143, 208, 119), Voltage.V110);
		Phone phonetest2 = new PushButtonPhone("Cortelco 2500", new Dimension(178, 228, 127), Voltage.DUAL);
		Phone phonetest3 = new SmartPhone("Pixel3", new Dimension(145.6, 68.2, 7.9), 128);
		Phone phonetest4 = new SmartPhone("Iphone8", new Dimension(138.4, 67.3, 7.3), 64);
		
		System.out.println("Various Phones: ");
		System.out.println(phonetest1.toString());
		System.out.println(phonetest2.toString());
		System.out.println(phonetest3.toString());
		System.out.println(phonetest4.toString() + "\n");
		
		System.out.println("Array Elements: ");
		Phone [] phonesArray = {phonetest1,phonetest2,phonetest3,phonetest4};
		for (Phone p : phonesArray)
		{
			System.out.println(p.toString());
			Long number = 8019574111L;
			System.out.println(p.call(number));
			if(p instanceof SmartPhone)
			{
				System.out.println(((SmartPhone) p).browse());
				System.out.println(((SmartPhone) p).takePicture());
			}
			System.out.println();
		}
		
	}
}