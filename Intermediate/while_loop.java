// public class while_loop{
//     public static void main (String[] args){
//         // while loop (0 to 10)
//         int i=0;  //initialization will be here

//         while(i<11){  //condition
        
//             System.out.println(i);
        
//             i++; //updation will be here 
//         }

//     }

    
// }

// import java.util.*;

// public class while_loop{
//     public static void main (String[] args){
//         // while loop (0 to 10) through input
//         Scanner sc = new Scanner (System.in);
//         int i = sc.nextInt();
//         System.out.println("here the repeated value means that starting from that value\n");
//         //initialization will be from user side mean input

//         while(i<11){  //condition
        
//             System.out.println(i);
        
//             i++; //updation will be here 
//         }

//     }

    
// }

                        // homework


import java.util.*;

public class while_loop{
    public static void main (String[] args){
        // while loop (0 to 10) through input, even number,odd number and even, odd in reverse order 
        Scanner sc = new Scanner (System.in);

        int i = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("here the repeated value means that starting from that value\n");
        //initialization will be from user side mean input

        while(i>n){  //condition
            System.out.println(i);

            
            i = i -2; //updation will be here 
        }

    }

    
}
