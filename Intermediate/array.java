// public class array {
//     public static void main(String[] args){
//         int[] rollNo = new int[15];  her 15 means (indices or number of index)
//         rollNo[0] = 2001;
//         rollNo[1] = 2002;
//         rollNo[2] = 2003;
//         rollNo[3] = 2004;
//         rollNo[4] = 2005;
//         rollNo[5] = 2006;
//         rollNo[6] = 2007;
//         rollNo[7] = 2008;
//         rollNo[8] = 2009;
//         rollNo[9] = 2010;
//                                     // 1


//         // System.out.println(rollNo[0]);
//         // System.out.println(rollNo[1]);
//         // System.out.println(rollNo[2]);    we can do like that,
//         // System.out.println(rollNo[3]);
//         // System.out.println(rollNo[4]);
//         // System.out.println(rollNo[5]);
//         // System.out.println(rollNo[6]);
//         // System.out.println(rollNo[7]);
//         // System.out.println(rollNo[8]);
//         // System.out.println(rollNo[9]);
//                                             // 2


//         for(int i=0 ; i<=9; i++)   //we can do through loop(zero means starting from index zero)
//         System.out.println("rollNo : "+rollNo[i]);
//     }
    
// }
 
// one more way to declare array , but that is so simple 

// public class array {
//     public static void main(String[] args){

//         int  rollNo[] ={1,2,3,4,5,6,7,8,9,10}; //for intiger

//         for(int i=0 ; i<10; i++){

//             System.out.println(rollNo[i]);
//         }
// }
// }


                    // through function

// public class array{
//     public static void arrayFunction( ){
        
//         int rollNo[]= {1,2,3,4,5,6,7,8,9,10};

//         for(int i=0; i<10; i++){
//             System.out.print("rollNo:");
//             System.out.println(rollNo[i]);

//         }

//         return;
// }

//     public static void main(String[] args){

//     arrayFunction();
// }

// }


                // through input 

// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int rollNo[]=  new int  [size];


//         // input

//         for(int i =0; i<size; i++){
//             rollNo[i]= sc.nextInt();
//         }

//         System.out.println("here the program will be printed from 0 to size(input)");


//         // output

//         for(int i=0 ; i<size; i++){

//             System.out.print("rollNo :  ");
//             System.out.println(rollNo[i]);
//         }
//     }
// } 


// array for string

// public class array{

// public static void main(String[] args){
//  String[] strname = new String[4];  //must be capitalized

//  strname[0] = "maaz";
//  strname[1] = "is";
//  strname[2] = "my";
//  strname[3] = "name";

//  System.out.println(strname[0]);
//  System.out.println(strname[1]);
//  System.out.println(strname[2]);
//  System.out.println(strname[3]);

// }
// }


// for finding x value through input

import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int rollNo[]=  new int  [size];


        // input

        for(int i =0; i<size; i++){
            rollNo[i]= sc.nextInt();
        }

        int x = sc.nextInt();


        System.out.println("here the program will be printed from 0 to size(input)");


        // output

        for(int i=0 ; i<size; i++){

            if(rollNo[i]==x){
                System.out.println("index found for x at  :"+ i);
            }

            System.out.print("rollNo :  ");
            System.out.println(rollNo[i]);
        }
    }
} 

