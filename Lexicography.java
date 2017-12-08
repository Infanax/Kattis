import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Lexicography{

     public static void main(String args[]) {
              Scanner s = new Scanner(System.in);
              while(s.hasNext())
              {
                String x = s.nextLine();
                if(x.equals("0 #")) break;
                String[] parts = x.split(" ");
                String a = parts[0];
                char tempArray[] = a.toCharArray();
                Arrays.sort(tempArray);
                a = new String(tempArray);
                long b = Integer.parseInt(parts[1]);
                System.out.println(findAnagram(a, b));
              }
                    }

      public static String findAnagram(String word, long index) {
               ArrayList<String> permutations_list = new ArrayList<String>();
                    permutations("",word.toCharArray(), permutations_list);
                         return permutations_list.get(index - 1);
                          } 

       public static void permutations(String prefix, char[] word, ArrayList<String> permutations_list) {

               boolean duplicate = false;

                   if (word.length==2 && word[0]!=word[1]) {
                               String permutation1 = prefix + String.valueOf(word[0]) + String.valueOf(word[1]);
                                       permutations_list.add(permutation1);
                                               String permutation2 = prefix + String.valueOf(word[1]) + String.valueOf(word[0]);
                                                       permutations_list.add(permutation2);
                                                               return;
                                                                   }
                       else if (word.length==2 && word[0]==word[1]) {
                                   String permutation = prefix + String.valueOf(word[0]) + String.valueOf(word[1]);
                                           permutations_list.add(permutation);
                                                   return;
                                                       }

                           for (int i=0; i < word.length; i++) {
                                       if (!duplicate) {
                                                       permutations(prefix + word[0], new String(word).substring(1,word.length).toCharArray(), permutations_list);
                                                               }
                                               if (i < word.length - 1) {
                                                               char temp = word[0];
                                                                           word[0] = word[i+1];
                                                                                       word[i+1] = temp;
                                                                                               }
                                                       if (i < word.length - 1 && word[0]==word[i+1]) duplicate = true;
                                                               else duplicate = false;
                                                                   }


                            }




}
