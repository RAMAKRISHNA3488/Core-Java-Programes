package Arrays;

public class PassingArrayFunction {
    public static void main(String[] args) {
        int []num={1,2,3,4,5};
        printArray(num);
    }
    public static void printArray(int []arr){
        for(Integer elements:arr){
            System.out.println(elements);
        }
    }
}
