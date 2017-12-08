import java.util.*;
public class santa
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        long x = s.nextInt();
        double[] ans = {1,0.5,0.666666667,0.625,0.63333333333,0.631944444, 0.6321428571,0.6321180556,0.6321208113,0.6321205357,0.6321205608,0.6321205587};
        double answer = 0;
        if(x<=11) answer = ans[(int)(x)-1];
        else answer = ans[11];
        System.out.printf("%.9f", answer);
    }
}
