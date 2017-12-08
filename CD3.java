import java.util.*;
class CD3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
		int jck = s.nextInt();
		int jll = s.nextInt();
		if(jck==0 && jll==0) break;
		int[] jack = new int[jck];
		int sx =0;
		int count = 0;
		for(int i =0; i<jck; i++)
		{
			jack[i]= s.nextInt();
		}
		for(int i=0; i<jll; i++)
		{
			int x = s.nextInt();
			for(int j =sx; j<jck; j++)
			{
				if(x==jack[j]) {count++; sx=j; break;}
				else if(x<jack[j]){break;}
			}
		}
		System.out.println(count);
		
		}
	}
}
