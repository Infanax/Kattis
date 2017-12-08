import java.util.*;
public class cold
{
    public static void main(String args[])
    {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        for(int i =0; i<n; i++)
        {
            int x = s.nextInt();
            if(x<0) cnt++;
        }
        System.out.println(cnt);
    }

}
