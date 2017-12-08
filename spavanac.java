import java.util.*;
class spavanac
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		if(m>=45) System.out.println(h + " " +  (m-45));
		else if(m<45)
		{
			m = 60 - (45-m);
			if(h==0){ h = 23; System.out.println(h + " " + m);}
			else System.out.println((h-1) + " " + m);
			 
		}
	}
}
