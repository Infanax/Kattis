import java.util.*;
class CD
{
    public static void main(String args[])
    {   while(true)
        {
        Kattio s = new Kattio(System.in, System.out);
        
        int n = s.getInt();
        int m = s.getInt();
        if(n==0 & m==0)break;
        HashSet<Integer> jack = new HashSet<Integer>();
        int count = 0;
        for(int i =0; i<n; i++)
        {
            jack.add(s.getInt());
        }
        for(int i= 0; i<m; i++)
        {
            if(jack.contains(s.getInt()))count++;
        }
        s.println(count);
        s.flush();
        }
    }
}


