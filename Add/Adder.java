package Add;

import java.util.Scanner;

class AddFun {

  int addNum(int A, int B) {
    return A + B;
  }

}

public class Adder {

  public static void addThis() {
    Scanner getInput = new Scanner(System.in);
    int A = getInput.nextInt();
    int B = getInput.nextInt();
    AddFun addNum = new AddFun();
    int result = addNum.addNum(A, B);
    System.out.println(result);
    getInput.close();
  }

}
