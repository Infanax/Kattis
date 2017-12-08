import java.util.*;
public class Pet
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int[] scores = new int[5];
        int rec = 0;
        int recind = 0;
        for(int i =0; i<5; i++)
        {
            int sum = 0;
            for(int j=0; j<4; j++)
            {
                sum = sum + s.nextInt();
            }
            if(sum>rec)
            {
                rec = sum;
                recind = i;
            }
            scores[i]=sum;
        }
        System.out.print(recind+1);
        System.out.print(" ");
        System.out.print(rec);

    }
}
