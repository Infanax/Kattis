import java.util.*;
class TwoStones
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		String a = (x%2==0) ? "Bob":"Alice";
		System.out.println(a);
	}
}
