import java.util.Scanner;

public class P2 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int n = 2;
		int red = 0;
		int green = 0;
		int orange = 0;
		for(int i = 0; i < n; i++)
		{
			
			char type = input.next().charAt(0);
			
			int people = input.nextInt();
			int score = 0;
			if(type == 'A')
				score += people;
			else if(type == 'B')
				score += 2*people;
			else if(type == 'C')
				score += 3*people;
			if(score >= 300 && score <= 399)
				orange++;
			else if(score >= 200)
				green++;
			else if(score >= 100)
				red++;
			System.out.println(score);
		}
		System.out.printf("red = %d , green = %d , orange = %d\n",red,green,orange);
	}
}
