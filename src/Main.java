import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入第一次密碼（四位整數）：");
        int password1 = input.nextInt();

        System.out.print("請輸入第二次密碼（四位整數）：");
        int password2 = input.nextInt();

        if (password1 == password2) {
            System.out.println("密碼正確！");
        } else {
            System.out.println("兩次輸入不同，請再輸入第三次密碼。");

            System.out.print("請輸入第三次密碼（四位整數）：");
            int password3 = input.nextInt();

            if (password1 == password3) {
                System.out.println("密碼正確！");
            } else {
                System.out.println("第三次輸入錯誤，請再輸入第四次密碼。");

                System.out.print("請輸入第四次密碼（四位整數）：");
                int password4 = input.nextInt();

                if (password1 == password4) {
                    System.out.println("密碼正確！");
                } else {
                    System.out.println("錯誤次數過多，操作失敗！");
                }
            }
        }

        input.close();
    }
}

