// 🧩 Question 1: Longest Substring Without Repeating Characters

// Problem:
// Given a string s, find the length of the longest substring without repeating characters.

// Example:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

import java.util.Scanner;
public class substring {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
            System.out.print("enter string: ");
            String str= sc.nextLine();
            str= str.toLowerCase();
            int maxlen=0;
            for(int i=0;i<str.length();i++){
                String temp= "";
                for(int j=i;j<str.length();j++){
                    if(temp.indexOf(str.charAt(j))== -1){
                        temp += str.charAt(j);
                    }
                    else{
                        break;
                    }

                }
                if(temp.length()>maxlen){
                    maxlen= temp.length();
                }

            }
            System.out.println(maxlen);

       
            sc.close();


    }
    
}

// 🧠 Pehle samjho:

// indexOf() ek String method hai jo kisi character ya substring ka position (index) batata hai agar vo string me present ho.

// Agar nahi milta, to ye return karta hai -1.
// (That’s Java’s way of saying → “not found”)

// Example:

// str = "abcabc"
// temp = "abc"
// Now str.charAt(3) = 'a'

// When we do:

// temp.indexOf('a')


// 👉 Java checks: is 'a' inside "abc"?
// Yes — 'a' is the first letter.
// So it returns 0 (its position).

// That means 'a' already exists — it’s repeated.
// So our condition

// if (temp.indexOf(str.charAt(j)) == -1)


// fails, because it’s not -1 (it’s 0).
// Hence we stop adding further characters (break).


// example 

// enter string: bciddhppqrstuuuu
// 6

//  Look carefully

// After h we have:

// h p p q r s t u u u u


// Start new substring from first p after h → "p"

// Next char is second p → it repeats → stop here

// So substring = "p" (length 1)

// Step 2: Start from next p (second p) → "p q r s t u"

// Are there repeats here? ✅

// "p q r s t u" → all letters unique before next u

// Length = 6 → this is the longest substring without repeating characters

// ✅ Key Idea:

// Only continuous letters count

// Whenever a repeat happens → stop and start from next index

// So even though p appeared earlier, this new substring starting from second p is different, and letters inside it are unique.