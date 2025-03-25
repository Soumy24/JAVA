package unique;

//WAP to program to swap 2 numbers Input a= 10; b = 20; Output a=20; b= 10;

public class SwapNumbers {
    public static void main(String[] args) {
        // Initializing the values of a and b
        int a = 10;
        int b = 20;

        // Displaying numbers before swap
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping the values of a and b using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Displaying numbers after swap
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}