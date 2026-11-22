package DAY1Revision;

import java.util.Scanner;

public class task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    String result=num%2 ==0 ? "is an Even number": "is an odd number";
    System.out.println(num +" "+result);
  }

}
