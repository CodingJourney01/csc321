//anthony meza
//

import java.util.Scanner;

public class ameza4
{
	public static void main(String[] args)
	{
		int x;

		System.out.println("Choose a lunch menun option below");
	        System.out.println("1.Chicken Alfredo");
	        System.out.println("2.Beef Stroganoff");
		System.out.println("3.Fish and Chips");
		System.out.println("4.Pizza");

		
		Scanner option = new Scanner(System.in);
		x = option.nextInt();
		
		if (x == 1) System.out.println("You  chose  option  1.Chicken Alfredo");
		else if (x == 2) System.out.println("You chose option 2.Beef Stroganoff");
		else if (x == 3) System.out.println("You chose 3.Fish and Chips");
		else if (x == 4) System.out.println("You chose 4.Pizza");

		

	}
}		               
