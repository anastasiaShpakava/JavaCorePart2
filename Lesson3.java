import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //int result = getMin(a,b);
        System.out.println("Minimum umber is " + getMin(a, b));
        System.out.println(getEvenNumber(a));
        System.out.println("Power of number is " + getPower(a));
        System.out.println("Cube of number is " + getCube(a));
        double result = getDifference(a, b, c);
        System.out.println("Difference is " + result);
    }
    public static int getMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean getEvenNumber(int a) {
        return (a % 2 == 0);
    }

  
  public static int getPower(int a) {
        return a * a;
    }


    public static int getCube(int a) {
        return a * a * a;
    }

    public static int getDifference(int a, int b, int c) {
        return (a - b - c);
    }
}

//////////////////

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.Arrays;

public class Additional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray [i]);
        }

            //public static int getMyArray ( int[] myArray){
        //    for (int i = 0; i < myArray.length; i++) {
              //  System.out.println(myArray[i]);
         ///   }
          //  for (int i = myArray.length - 1; i >= 0; i--) {
          //      System.out.println(myArray[i]);
            }
        }


////////////

import java.util.Scanner;

public class lastlast {
    public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       //int result = getMin(a,b);
        System.out.println("Minimum umber is " + getMin(a,b));
        System.out.println(getEvenNumber(a));
        System.out.println("Power of number is " + getPower(a));
        System.out.println("Cube of number is " + getCube(a));
        ///System.out.println("Difference is " + result1);

    }

    public static int getMin(int a, int b) {
        int c = a < b ? a : b;
       // if (a < b) {
          //  return a;
       // }
       // else
       // {
         //   return b;
       // }
    }

   public static boolean getEvenNumber(int a) {

        return (a % 2 == 0);
   }

  public static int getPower(int a) {
        return a * a;
   }

   public static int getCube(int a) {

        return a * a * a;
   }

  // public static int getDifference(int a, int b, int c) {
     //   double result2;

  // return (a - b - c);
   ///}
}
