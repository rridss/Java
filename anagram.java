// Question 2: Check Anagram

// 👉 Problem:
// You are given two strings. Check if they are anagrams of each other.

// Two strings are anagrams if they contain the same characters in any order.

// Example:

// Input: s1 = "listen", s2 = "silent"
// Output: true

// approach first - convert string into char array then sort them and then compare 

// import java.util.Scanner;
// import java.util.Arrays;
// public class anagram {
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);

//         System.out.print("enter first string: ");
//         String str1= sc.nextLine();

//         str1= str1.toLowerCase();

//         System.out.println("enter second string: ");
//         String str2= sc.nextLine();
//         str2= str2.toLowerCase();

//         char [] arr1= str1.toCharArray();
//         char [] arr2= str2.toCharArray();

//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         if(Arrays.equals(arr1,arr2)){
//             System.out.println("these are anagrams");
//         }
//         else{
//              System.out.println("these are not anagrams");
//         }

//         sc.close();
        
//     }
    
// }

// TC- O(N LOG N)

// second approach- 
// Step by Step: Counting Characters Method

// Make an array of size 26

// Think of this array as a row of 26 boxes, one for each letter from a to z.

// Each box will count how many times a letter appears.

// Check the letters of the first string

// Look at each letter in the first string.

// Put one token in the corresponding box for that letter.

// Example:

// Letter 'a' → box 0

// Letter 'b' → box 1

// Letter 'l' → box 11

// ✅ This means: "This letter appeared once in the first string."

// Check the letters of the second string

// Look at each letter in the second string.

// Remove one token from the corresponding box for that letter.

// ✅ The idea: if the letters appear the same number of times in both strings, all boxes will end up empty.

// Check all the boxes at the end

// If all boxes are empty (zero) → both strings have the same letters with the same count → they are anagrams.

// If any box is not zero → letters don’t match → they are not anagrams.

//  TC= O(N)

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