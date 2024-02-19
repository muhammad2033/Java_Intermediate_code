// import java.util.*;

// public class function {
//     public static void myname( String name, int number, float decimal){
//         System.out.print("name ->");
//         System.out.println(name);
//         System.out.print("number ->");


//         System.out.println(number);
//         System.out.print("deciaml ->");

//         System.out.println(decimal);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         String name = sc. nextLine();
//         int number = sc.nextInt();
//         float decimal = sc.nextFloat();
        
        
//         myname(name, number, decimal);  // function call for the java

//     }
    
// }

                    // adding two numbers

// import java.util.*;

// public class function {
//     public static int sumNumbers(  int number1, int number2 ){
//     int sum = number1 + number2;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
       
//         int number1 = sc.nextInt();
//         int number2 = sc.nextInt();
//         int sum = sumNumbers(number1, number2);
//         System.out.println("the sum of the numbers are: "+ sum);
        
        
        

//     }
    
// }


       
            // multiply two number and retirn the multiply      way1             


// public class function {
//     public static int multiplyNumbers(  int number1, int number2 ){
//     int multiply = number1 * number2;
//         return multiply;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
       
//         int number1 = sc.nextInt();
//         int number2 = sc.nextInt();
//         int multiply = multiplyNumbers(number1, number2);
//         System.out.println("the multiplication of the numbers are: "+ multiply);
        
        
        

//     }
    
// }

// multiplication of two numbers way2

// import java.util.*;

// public class function{
//     public static int multiplyNumbers(int a, int  b ){
//         return a*b;
//     }
//     public static void main(String[] args){

//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println(" the multiplication of the two numbers are: " + multiplyNumbers(a, b));

    
//     }
// }


                        // factorial
                        import java.util.*;

public class function{
    public static void factorial(int n){
        if(n < 0){
            System.out.println("invalid number:");
            return;
            
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){

        
        factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
        
    }
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(" the factorial  of the  number is: " );
    factorial(n);

    
    }
}

