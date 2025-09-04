//  check if string is palindrome 

import java.util.Scanner;

public class STRPALINDROME {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a string :");
        String str= sc.nextLine();

        // str= str.toLowerCase();

        String reversed="";

        for (int i= str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }

        if(str.equalsIgnoreCase(reversed)){
            System.out.println("palindrome");
        }
        else{
             System.out.println(" not palindrome");
        }






        sc.close();
    }
}
