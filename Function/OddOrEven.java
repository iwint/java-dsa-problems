import java.util.Scanner;

public class OddOrEven {
    static Boolean isEven(int num){
        if(num % 2 == 0){
        return true;
        }else{
        return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isEven(num));
    }
}
