package Operators;

class BitwiseOperator {
    // main function
    public static void main(String[] args)
    {
        int d = 0b1010;  //this value is 10
        int e = 0b1100;  //this value is 12
        // Bitwise operators
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));
    }
}
