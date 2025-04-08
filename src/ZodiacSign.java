import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        // 使用 Scanner 讀取使用者輸入的月份和日期
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入月份和日期，月份與日期用空格隔開
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // 根據月份來選擇對應的星座範圍
        switch (month) {
            case 1:
                System.out.println(day <= 19 ? "Capricorn" : "Aquarius");
                break;
            case 2:
                System.out.println(day <= 18 ? "Aquarius" : "Pisces");
                break;
            case 3:
                System.out.println(day <= 20 ? "Pisces" : "Aries");
                break;
            case 4:
                System.out.println(day <= 19 ? "Aries" : "Taurus");
                break;
            case 5:
                System.out.println(day <= 20 ? "Taurus" : "Gemini");
                break;
            case 6:
                System.out.println(day <= 20 ? "Gemini" : "Cancer");
                break;
            case 7:
                System.out.println(day <= 22 ? "Cancer" : "Leo");
                break;
            case 8:
                System.out.println(day <= 22 ? "Leo" : "Virgo");
                break;
            case 9:
                System.out.println(day <= 22 ? "Virgo" : "Libra");
                break;
            case 10:
                System.out.println(day <= 22 ? "Libra" : "Scorpio");
                break;
            case 11:
                System.out.println(day <= 21 ? "Scorpio" : "Sagittarius");
                break;
            case 12:
                System.out.println(day <= 21 ? "Sagittarius" : "Capricorn");
                break;
            default:
                System.out.println("Invalid date");
        }
    }
}
