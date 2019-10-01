package LearningFlow;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count != 42) {
            System.out.println(count);
            count++;
        }
        count = 1;
        while (true) {
            if(count==6) {
                break;
            }
            System.out.println("Value is " + count);
            count++;
        }
    }
}
