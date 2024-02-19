import java.util.*;  // it is crucial for input

public class input {
    public static void main(String[] args) {
        // for input in java\

        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int sum  = a + b;
        // nextLine();
        // nextInt();
        // nextFloat();
        // System.out.println(name);

        System.out.println("the value of a is :");
        System.out.println(a);
        System.out.println("the value of b is :");
        System.out.println(b);
        System.out.println("the sum of a and b is :");
        System.out.println(sum);
    }
    
}
