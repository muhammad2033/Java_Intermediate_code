//   import java.util.*;
// public class Switch{
//     public static void main(String[] args){
//         // switch break statement ,homework of calculator

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int button = sc.nextInt();
//         int sum = a+b;
//         int diff = a-b;
//         int mult = a*b;
//         int div = a/b;
//         int modu = a%b;
//         switch(button){
//         case 1 :
//         System.out.println("i need to have the sum of two variables");
//         System.out.println(sum);
//         break;
        
//         case 2:
//         System.out.println("i need to have the differ of two variables");
//         System.out.println(diff);
//         break;

//         case 3:
//         System.out.println("i need to have the multiplication of two variables");
//         System.out.println(mult);
//         break;

//         case 4:
            // if (b==0){
              // System.out.println("invalid number");
            // }
            // else{

//         System.out.println("i need to have the division of two variables");
//         System.out.println(div);
            // }
// 
//         break;
        
//         case 5:
//         if(b==0){
//           System.out.println("invalid number");
//         }
//         else{
//           System.out.println("i need to have the modulo of two variables");
//           System.out.println(modu);
//         }
//         break;

//         default:
//         System.out.println("no expression is given here:");
//       }

//     }
    
// }

          // homework
import java.util.*;
  public class Switch{
    public static void main(String[] args){
      // homework a menu of two number from input
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt ();
    int b = sc.nextInt ();
    int number = sc.nextInt();
    switch(number){
      case 1 :
      if(a==1){
        int marks = sc.nextInt();
        System.out.print("he has got ");
        System.out.print(marks);
        System.out.print(" marks out of hundred");
       }
      else{
        if(b==0){
          System.out.println("stop");
          break;
         
        }
      } 
      break;

      case 2:{
        int marks = sc.nextInt();
        if (marks>=90){
          System.out.println("the marks is outstanding:");
          System.out.println(marks);
        }
        else if(marks<=89 && marks>=60){
          System.out.println("the marks is good:");
          System.out.println(marks);

        }
        else if (marks<=59 && marks >=40){
          System.out.println("the marks is suitable to be given them enrollment:");
          System.out.println(marks);
        }
        else{
          System.out.println("the marks is very poor:");
        }
        break;
      }
    }
      
    }
  }