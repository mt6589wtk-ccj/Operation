import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入字串
        String input = scanner.nextLine(); // 接收輸入的字串

        // 判斷是否為回文，忽略空白並忽略大小寫
        boolean isPalindrome = true;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            // 只比較非空白字符，並將字符轉為小寫進行比較
            if (Character.isWhitespace(input.charAt(i))) {
                continue;  // 跳過空白字符
            }
            if (Character.isWhitespace(input.charAt(length - 1 - i))) {
                continue;  // 跳過空白字符
            }

            // 比較字符是否相等（忽略大小寫）
            if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(length - 1 - i))) {
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
