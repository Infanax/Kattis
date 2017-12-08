import java.util.*;
class CD2
{
	public static void main(String args[])
	{
		Kattio s = new Kattio(System.in, System.out);
		while(true)
		{
		int jck = s.getInt();
		int jll = s.getInt();
		if(jck==0 && jll==0) break;
		int[] jack = new int[jck];
		int sx =0;
		int count = 0;
		for(int i =0; i<jck; i++)
		{
			jack[i]= s.getInt();
		}
		for(int i=0; i<jll; i++)
		{
			int x = s.getInt();
			if(x>jack[jck-1])break;	
			for(int j =sx; j<jck; j++)
			{
				if(x==jack[j]) {count++; sx=j; break;}
				else if(x<jack[j]){break;}
			}
		}
		s.println(count);
		s.flush();
		}
	}
}
