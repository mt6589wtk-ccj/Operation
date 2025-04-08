import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        // 創建Scanner對象來讀取用戶輸入
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入日期
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // 根據輸入的月份和日期判斷星座
        String zodiac = getZodiacSign(month, day);

        // 輸出結果
        System.out.println(zodiac);
    }

    // 方法：根據月份和日期返回星座
    public static String getZodiacSign(int month, int day) {
        switch (month) {
            case 1:  // January
                if (day >= 20) return "Aquarius";
                else return "Capricorn";
            case 2:  // February
                if (day >= 19) return "Pisces";
                else return "Aquarius";
            case 3:  // March
                if (day >= 21) return "Aries";
                else return "Pisces";
            case 4:  // April
                if (day >= 20) return "Taurus";
                else return "Aries";
            case 5:  // May
                if (day >= 21) return "Gemini";
                else return "Taurus";
            case 6:  // June
                if (day >= 21) return "Cancer";
                else return "Gemini";
            case 7:  // July
                if (day >= 23) return "Leo";
                else return "Cancer";
            case 8:  // August
                if (day >= 23) return "Virgo";
                else return "Leo";
            case 9:  // September
                if (day >= 23) return "Libra";
                else return "Virgo";
            case 10: // October
                if (day >= 23) return "Scorpio";
                else return "Libra";
            case 11: // November
                if (day >= 22) return "Sagittarius";
                else return "Scorpio";
            case 12: // December
                if (day >= 22) return "Capricorn";
                else return "Sagittarius";
            default:
                return "Invalid date";
        }
    }
}
