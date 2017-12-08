import java.util.*;
public class batterup
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double denom = 0;
        double sum = 0;
        for(int i =0; i<n; i++)
        {
            int x = s.nextInt();
            if(x<0)
            {

            }
            else
            {
                denom++;
                sum = sum + x;

            }
        }
        System.out.println(sum/denom);
    }
}
