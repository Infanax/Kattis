import java.util.*;
class patuljci
{
	public static void main(String ars[])
	{
		Scanner s = new Scanner(System.in);
		int[] dwarves = new int[9];
		int[] ans = new int[7];
		int sum =0;
		for(int i =0; i<9; i++)
		{
			dwarves[i]=s.nextInt();
			sum = sum+dwarves[i];
		}
		int req = sum-100;
		int in1 = 0;
		int in2 = 0;
		for(int i=0; i<8; i++)
		{
			for(int j = i+1; j<9; j++)
			{
				if(dwarves[i] + dwarves[j] == req){in1 = i; in2 = j;}
	
			}
		}

		for(int i =0 ; i<9; i++)
		{
			if(i!=in1 && i!=in2) System.out.println(dwarves[i]); 
		}

	}
}
