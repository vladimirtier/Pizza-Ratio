import java.util.Scanner;

public class Pizza_size 
{
	public static void main (String[] args)
	{
		float pizza_area_1 = 0;
		float pizza_area_2 = 0;
		float Pi = (float) Math.PI;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie Durchmesser von Pizza 1 : ");
		int diameter_1 = scanner.nextInt();
		System.out.println("Geben Sie Preis : ");
		float price_1 = scanner.nextFloat();
		
		System.out.println("Geben Sie Durchmesser von Pizza 2 : ");
		int diameter_2 = scanner.nextInt();
		System.out.println("Geben Sie Preis : ");
		float price_2 = scanner.nextFloat();
	
		pizza_area_1 = Pi/4 * (diameter_1*diameter_1);
		pizza_area_2 = Pi/4 * (diameter_2*diameter_2);
		//System.out.println("Area : " +pizza_area_1); //Test
		
		float price_ratio_1 = price_1 / pizza_area_1;
		System.out.println("Preis Ratio 1 : " + price_ratio_1); //Test
		
		float price_ratio_2 = price_2 / pizza_area_2;
		System.out.println("Preis Ratio 2: " + price_ratio_2); //Test
		
		if (price_ratio_1 > price_ratio_2)
			{
				System.out.printf("Pizza mit Durchmesser %d cm hat bessere Preisverchaeltnis ", diameter_2);
			}
		else
			{
				System.out.printf("Pizza mit Durchmesser %d cm hat bessere Preisverchaeltnis oder die gleche ", diameter_1);
			}
		
		
		//System.out.println("Prisevrhältnis Pizza 28 ist : " + price_ratio_1); //Test
		
		
	}

}
