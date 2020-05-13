import java.util.Scanner;
import java.util.Stack;

public class Change {
    public static void convertBinary(int num){
        Stack<Integer> stack = new Stack<Integer>();

        while (num != 0){
            int x = 0;
            x = num % 2;
            stack.push(x);
            num/=2;
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        System.out.println("after change" + s);
        Change.convertBinary(s);
    }
}
