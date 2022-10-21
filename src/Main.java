public class Main {
    public static void swapNumbers (int a, int b) {
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
        a = a + b; // var1 = 2 + 4 var1 = 6
        b = a - b; // var2 = 6 - 4 var2 = 2
        a = a - b; // var1 = 6 - 2 var1 = 4
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
    }
    public static void main(String[] args) {
         int a = 2;
         int b = 4;
        swapNumbers(a, b);
    }
}