import java.util.Scanner;
import java.util.Arrays;
public class anagram {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter first string:");

        String str1= sc.nextLine();

        System.out.print("enter sec string:");

        String str2= sc.nextLine();

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            sc.close();
            return;
        }

        int [] countarray= new int[26];
// Ye 26 boxes represent karenge letters 'a' to 'z'.
// arr.length and str.length()
        
        for(int i=0;i<str1.length();i++){

            char ch= str1.charAt(i);

            int index= ch-'a';

            countarray[index]++;
        }

        for(int i=0;i<str2.length();i++){
            char ch= str2.charAt(i);
            int index= ch-'a';
            countarray[index]--;
        }

        boolean anagram= true;

        for(int i=0; i< countarray.length;i++){
            if(countarray[i]!=0){
                anagram=false;
                System.out.println("not anagrams");
                break;
            }

        }
        if(anagram){
            System.out.println("strings are anagrams");

        }
        else{
            System.out.println("strings are not anagrams");
        
        }
        

        sc.close();
    }
}


// dry run for str1 similar for str2 

// for(int i=0;i<str1.length();i++){

//             char ch= str1.charAt(i);

//             int index= ch-'a';

//             countarray[index]++;
//         }

// i	ch	ch - 'a' (index)	countarray[index] before	countarray[index] after
// 0	'l'	108 - 97 = 11	         0	                                1
// 1	'i'	105 - 97 = 8	         0	                                1
// 2	's'	115 - 97 = 18	         0	                                1

// mtlb in str1 , at index 11 count become 1 then at index 11 in str2 ,count become 0 means l and l in both string