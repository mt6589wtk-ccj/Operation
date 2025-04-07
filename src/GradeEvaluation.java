import java.util.Scanner;

public class GradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入分數
        System.out.print("請輸入分數（0到100）: ");
        int score = scanner.nextInt(); // 接收輸入的分數

        // 條件判斷與輸出結果
        if (score >= 90) {
            System.out.println("excellent");
            System.out.println("pass");
        } else if (score >= 60) {
            System.out.println("pass");
        } else if (score >= 50) {
            System.out.println("almost pass");
        } else {
            System.out.println("fail");
        }

        scanner.close();
    }
}