

// public class advancePattern {   //butter fly pattern

//     public static void main(String[] args){
//         int n =5;
//         // upper half
//         for(int i=1; i<=n; i++){
//             // inner loop for part first
//             {
//                 for(int j=1 ; j<=i; j++){
//                     System.out.print("*");
//                 }
//             }
//                 int spaces = 2*(n-i);
//                 for(int j=1; j<=spaces; j++){
//                     System.out.print(" ");
//             }

//                 // inner loop for part 2
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//             }
//             System.out.println();
//         }

//         // lower half

        
//         for(int i=n; i>=1; i--){
//             // inner loop for part first
//             {
//                 for(int j=1 ; j<=i; j++){
//                     System.out.print("*");
//                 }
//             }
//                 int spaces = 2*(n-i);
//                 for(int j=1; j<=spaces; j++){
//                     System.out.print(" ");
//             }

//                 // inner loop for part 2
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//             }
//             System.out.println();
//         }


//     }
    
// }




// public class advancePattern {   //solid Rhombus
//     public static void main(String[] args){
//         int n =5;
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=n-i; j++){
//                 // print the spaces
//                 System.out.print(" ");

//             }
//             for (int j=1; j<=5; j++){
//                 // print the stars
//                 System.out.print(" * ");
//             }
//              System.out.println();
//         }
      
           
//         }


//     }
    

// public class advancePattern {   //pyramid
//     public static void main(String[] args){
//         int n =5;
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=n-i; j++){
//                 // print the spaces
//                 System.out.print(" ");

//             }
//             for (int j=1; j<=i; j++){
//                 // print the stars
//                 System.out.print(j+"  " ); //(1),(1,2),(1,2,3),(1,2,3,4),(1,2,3,4,5)
                
//                 // System.out.print(i+"  " ); //(1),(2,2),(3,3,3),(4,4,4,4),(5,5,5,5,5)
//             }
//              System.out.println();
//         }
      
           
//         }


//     }
    

// public class advancePattern{
//     public static void main(String[] args){
//         int n=5;
//         // palindromic pattern
//         for(int i= 1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 // spaces
//                 System.out.print(" ");
//             }
//             for(int j=i ; j>=1; j--){
//                 System.out.print(j);
//             }
//             for(int j=1; j<=i; j++){  //if j=2 so there wont be '1' line
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

// }



// public class advancePattern{
//     public static void main(String[] args){
//         int n=4;
//         // diamond pattern
//         for(int i= 1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 // spaces
//                 System.out.print(" ");
//             }
//             for(int j=1 ; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=2; j<=i; j++){  //if j=2 so there wont be '1' line
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i= n; i>=1; i--){
//             for(int j=1; j<=n-i; j++){
//                 // spaces
//                 System.out.print(" ");
//             }
//             for(int j=1 ; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=2; j<=i; j++){  //if j=2 so there wont be '1' line
//                 System.out.print("*");
//             }
//             System.out.println();

//     }

// }
// }


// public class advancePattern{
//     public static void main(String[] args){
//         int n=5;
//         int m=5;
//         for (int i=1 ; i<=n; i++){
//             // inner loop for spaces (hollow rhombus)
//            for(int j=1; j<=2*(n-i); j++){
//             System.out.print(" ");
//            }
//         //    inner loop for stars
//         for(int j=1; j<=m; j++){
//             if(i==1 || j==1 || i==n || j==m){
//                 System.out.print("*");
//             }else{

            
//             System.out.print(" ");
//             }
//         }

//             System.out.println();
//         }
//     }
// }


// public class advancePattern{
//     public static void main(String[] args) {
//         int n=5;
//         // outer loop for half pyramid
//         for(int i=1; i<=n; i++){
//             // inner loop for spaces
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }


        
//     }
// }


public class advancePattern{
    public static void main(String[] args) {
        int n=5;
        // outer loop for inverted half pyramid from 180 degree
        for(int i=1; i<=n; i++){
            // inner loop for further spaces 
            for(int j=1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        // part 2
        for(int i=n; i>=1; i--){
            // inner loop for further spaces 
            for(int j=1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        


        
    }
}
