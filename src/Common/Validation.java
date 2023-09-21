package Common;

import java.util.Scanner;

public class Validation {
    static Scanner sc = new Scanner(System.in);
    public static int getInt(String prompt){
    int i = 0;
    boolean isValid = false;
    while (isValid == false){
        System.out.print(prompt);
        if (sc.hasNextInt()){
            i = sc.nextInt();
            isValid = true;
    } 
    else{
        System.out.println("Error! Invalid integer value. Try again.");
    }
        sc.nextLine();
    }
        return i;
   }
   public static int getInt(String prompt,int min, int max){
       int i = 0;
       boolean isValid = false;
       while (isValid == false){
           i= getInt(prompt);
           if (i<min)
               System.out.println("Error! Number must be greater than " + min + ".");
           else if(i> max){
               System.out.println("Error! Number must be less than " + max + ".");
           }
           else 
               isValid = true;
       }
          return i;
    }
     public static int[] getArray(int size){
       int [] a = new int[size];
       for (int i=0;i<size;i++){
           a[i] = getInt("Enter number " + (i+1) + " : " );
       }
       return a;
   }
}
