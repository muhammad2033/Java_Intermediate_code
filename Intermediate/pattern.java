//                             // practice

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         for (int i = 1; i<5; i++){
//         // nested loop of solid rectangle
//         // inner loop
//             for(int j=1; j<6; j++){
//                 System.out.print("*");
//         }
//             System.out.println();
//     }
//     }
    
// }



// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =5;
//         int m = 6;
//         for (int i = 1; i<n; i++){
//         // nested loop of hollow rectangle
//         // inner loop
//             for(int j= 1; j<m; j++){

//                 if( i == 1 || j == 1  || i == n || j == m){
                
//                     System.out.print("*");
//                 }
//                 else{

//                     System.out.print("  ");
                    
//                 }

        
//             }
//             System.out.println();

//     }
//     }
    
// }



//                             // practice half pyramid

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =4 ;
//         for (int i = 1; i<=n; i++){
//         // nested loop of solid rectangle
//         // inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//         }
//             System.out.println();
//     }
//     }
    
// // }
//                             // practice half pyramid in reverse order

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =0 ;
//         for (int i = 4; i>n; i--){
//         // nested loop of solid rectangle
//         // inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//         }
//             System.out.println();
//     }
//     }
    
// }

                            // practice half pyramid in reverse order (180 degree)

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =4 ;
//         for (int i = 1; i<=n; i++){
//         // nested loop of solid rectangle
//         // inner loop (print spaces)
//             for(int j=1 ; j<=n-i ; j++){

            
//             System.out.print(" ");
        
//         }

//         // inner loop(print stars)

//             for(int j=1; j<=i; j++){

//                 System.out.print("*");
//         }
//             System.out.println();
//     }
//     }
    
// }



//                             // practice half pyramid

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =5 ;
//         for (int i = 1; i<=n; i++){
//         // nested loop of solid rectangle
//         // inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//                 // System.out.print(i);
//         }
//             System.out.println();
//     }
//     }
// }

//                             // practice half pyramid in reverse order(number)

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =0 ;
//         for (int i = 5; i>n; i--){
//         // nested loop of solid rectangle
//         // inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//         }
//             System.out.println();
//     }
//     }
    
// }



//                             // practice half pyramid in  order(number will increment)

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =6;
//         int number =1 ;
//         for (int i = 1; i<n; i++){
//         // nested loop of solid rectangle
//         // inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print(number + "  ");
//                 number++;
//         }
//             System.out.println();
//     }
//     }
    
// }

                         // practice half pyramid in  order(number will zero and one form)

// public class pattern {
//     public static void main(String [] args) {
//         // outer loop
//         int n =6;

//         for (int i = 1; i<n; i++){
//         // nested loop of solid rectangle
//         // inner loop
//             for(int j=1; j<=i; j++){
//                int sum = i+j;
//                if (sum %2 ==0){
//                 System.out.print("1 ");
//             }
//             else{
//                 System.out.print("0 ");
//                 // System.out.println(sum);
//             }

//         }
//             System.out.println();
//     }
//     }
    
// }


                            // practice  pyramid in reverse order (180 degree) homework

public class pattern {
    public static void main(String [] args) {
        // outer loop
        int n =4 ;
        int m =4 ;
        for (int i = 1; i<=n; i++){
        // nested loop of solid rectangle
        // inner loop (print spaces)
            for(int j=1 ; j<=n-i ; j++){

            
            System.out.print("  ");
        
        }

        // inner loop(print stars)

            for(int j=1; j<=i; j++){
                // int sum = i +j;

                System.out.print( j +"   " ); //pyramid number
        }
            System.out.println();
    }
    }
    
}
