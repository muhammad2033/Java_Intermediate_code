                                // Q1


// import java.util.*;

// public class ExerciseFunction {
//     public static void function(int a, int b, int c){
//         int average = a+b+c/3;
//         System.out.print("the average of given three variables are:");
//         System.out.println(average);
//         return;

//     }    
//   public static void main(String[] args){

//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();

//     function(a, b, c);
// }  

// }

//                                 // Q2

      //  sum of first odd number from 1 to 9    
// import java.util.*;

// public class ExerciseFunction{
//   public static void sumOdd(int n ){
//     int sum = 0;
//     int i=1;
//     while(i<=n){
//       sum = sum+i;
      
//      System.out.print(" addition of sum and odd number is: ");
//      System.out.println(sum);

//       i = i+2;
//       System.out.print(" value is i after incrementation is ->");
//       System.out.println(i);
//     }
//    return;
//   }
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n = sc.nextInt();

//   sumOdd(n);
// }
// }


// two number for finding the greatest number  /


// import java.util.*;

// public class ExerciseFunction{
//   public static int twoNumber(int a, int b ){
//     int result;
//     result = a+b;      
//     if(result>90){
//       System.out.println("the given number is greatest:");
//       System.out.println(result);

//     }
//     else{
//       System.out.println("the given number is lowest:");
//       System.out.println(result);
//     }


//    return result;
//   }
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int a = sc.nextInt();
//   int b = sc.nextInt();

//   System.out.println(twoNumber(a, b));
//   }
// }


// finding age through if statement

// import java.util.*;

// public class ExerciseFunction{
//   public static int twoNumber(int age ){
         
//     if(age>18){
//       System.out.println("a person is eligible for vote:");
//       System.out.println(age);

//     }
//     else{
//       System.out.println("a person is not eligible for vote");
//       System.out.println(age);
//     }


//    return age;
//   }
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int age = sc.nextInt();

//   System.out.println(twoNumber(age));
//   }
// }

// circumstances of a circle


// import java.util.*;

// public class ExerciseFunction{
//   public static void twoNumber(double radius ){
//    double pi = 3.14;

//     double circumstances = 2 * pi * radius;
//     System.out.println(circumstances);
//    return ;
//   }
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   double radius = sc.nextInt();

//   twoNumber(radius);
//   }
// }

// infinite loop through while loop

// public class ExerciseFunction{
//   public static void main(String[] args){
//     int i=1;
//     do{
      
//       System.out.println("infinite loop:");
//       i++;
//     }
//     while(i>0);
//   }
// }


// values for power , function 


import java.util.*;

public class ExerciseFunction{
  public static void twoNumber(int x, int n ){
   int  result = x^n;
    System.out.println(result);
   return ;
  }
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int n = sc.nextInt();

  twoNumber(x,n);
  }
}
