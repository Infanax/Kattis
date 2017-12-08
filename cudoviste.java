import java.util.*;
class cudoviste
{
	public static int checker(char[] map, int tol)
	{
		if(Arrays.asList(map).contains('#')){return 0;}
		else
		{
		  int nx =0;
		  for(int i = 0; i<4; i++)
		  {
		     if(map[i]=='X')nx++;
		  }
		  if(nx==tol) return 1;
		}
	   return 0;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int r =s.nextInt();
		int c =s.nextInt();
			
		char[][] map = new char[r][c];
		for(int i=0; i<r; i++)
		{
			String sn = s.next();
			for(int j=0; j<c; j++)
			{
				map[i][j] = sn.charAt(j);
			}
		}
	     int ans1, ans2, ans3, ans4, ans5;
	     ans1 = ans2 = ans3 = ans4 = ans5 = 0;
	     char[] ans = new char[4];

	     	for (int i = 0; i<r-1; i++)
		{
			for(int j=0; j<c-1; j++)
			{
			    ans[0] = map[i][j];
			    ans[1] = map[i][j+1];
			    ans[2] = map[i+1][j];
			    ans[3] = map[i+1][j+1];
			    ans1 += checker(ans, 0);
			    ans2 += checker(ans, 1);
			    ans3 += checker(ans, 2);
			    ans4 += checker(ans, 3);
			    ans5 += checker(ans, 4);
			}
		
		}
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		System.out.println(ans5);
		
	}
}
