import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入字串
        System.out.print("請輸入字串: ");
        String input = scanner.nextLine(); // 接收輸入的字串

        // 去除字串中可能的空白，並將字串轉為小寫（忽略大小寫）
        String processedString = input.replaceAll("\\s+", "").toLowerCase();

        // 判斷是否為回文
        boolean isPalindrome = true;
        int length = processedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (processedString.charAt(i) != processedString.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 輸出結果並換行
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}