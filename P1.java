import java.util.Scanner;

public class P1 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int n = 490;
		int allTotal = 0;
		for(int i = 0; i < n; i++)
		{
			String address = input.next();
			double area = input.nextDouble();
			char zone = input.next().charAt(0);
			double total = 0;
			if(area >= 101)
			{
				double x = area - 100;
				total += x * 10;
				area -= x;
			}
			if(area >= 51)
			{
				double x = area - 50;
				total += x * 6;
				area -= x;
				
			}
			if(area >= 1)
			{
				double x = area;
				total += x * 3;
				area -= x;
				
			}
			if(zone == 'A')
				allTotal += (total*1.1);
			else if(zone == 'B')
				allTotal += (total*1.05);
		}
		System.out.printf("total : %d\n",allTotal);
	}
}
