import java.util.*;
public class 1autori
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  String a = s.nextLine();
	  char[] q = a.toCharArray();
	  System.out.println(q[0]);
	  for(int i =1; i<q.length; i++)
	  {
		if(q[i]=='-')System.out.println(q[i+1]);

	  }
	  

	}
}
