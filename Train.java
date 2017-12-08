import java.util.*;
public class Train
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cap = s.nextInt();
        int stat = s.nextInt();
        int pepin = 0;
        int pepout = 0;
        int current = 0;
        for(int i =0; i<stat; i++)
        {
            int left = s.nextInt();
            int enter = s.nextInt();
            int wait = s.nextInt();
            pepin = pepin + enter;
            pepout+=left;
            current = pepin-pepout;
            if(left <0 || enter<0 || wait<0 || current>cap || current<0){System.out.println("impossible"); break;}
            else if((wait!= (wait+current-cap)) && wait!=0){System.out.println("impossible");break;}
            else if(i==0 && left>0){System.out.println("impossible"); break;}
            else if(i==stat-1 && ((pepin!=pepout) ||  (enter>0 || wait>0))){System.out.println("impossible");break;}
            else if(i==stat-1)System.out.println("possible");

        }
    }
}
