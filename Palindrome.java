import java.util.Scanner;

public class Solution 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = n;
		int rev = 0;
		while(num > 0)
		{
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		if(n == rev)
			System.out.println("Palin");
		else
			System.out.println("Not Palin");
	}
}
