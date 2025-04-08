import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入兩個數字
        int num1 = scanner.nextInt(); // 使用 int 型別
        int num2 = scanner.nextInt(); // 使用 int 型別

        // 計算並打印結果
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 總和
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // 乘積
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // 差

        if (num2 != 0) {
            int quotient = num1 / num2; // 商
            int remainder = num1 % num2; // 餘數
            System.out.println(num1 + " / " + num2 + " = " + quotient + " ... " + remainder); // 商和餘數
        }
        scanner.close();
    }
}