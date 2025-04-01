import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = 0;
        int day = 0;

        // 確保月份輸入正確
        while (true) {
            System.out.println("請輸入月份 (1-12)：");
            month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                break; // 跳出月份循環
            } else {
                System.out.println("輸入的月份不在範圍內，請重新輸入！");
            }
        }

        // 確保日期輸入正確
        while (true) {
            System.out.println("請輸入日期 (1-31)：");
            day = scanner.nextInt();
            if (isValidDay(month, day)) {
                break; // 跳出日期循環
            } else {
                System.out.println("輸入的日期不在該月份的有效範圍內，請重新輸入！");
            }
        }

        String zodiac = "";

        // 判斷星座
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiac = "水瓶座";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiac = "雙魚座";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiac = "牡羊座";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiac = "金牛座";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiac = "雙子座";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiac = "巨蟹座";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiac = "獅子座";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiac = "處女座";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiac = "天秤座";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiac = "天蠍座";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiac = "射手座";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiac = "摩羯座";
        }

        // 輸出結果
        System.out.println("對應的星座是：" + zodiac);
    }

    // 判斷日期是否有效
    public static boolean isValidDay(int month, int day) {
        int maxDay = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29; // 假設當年為閏年
                break;
        }
        return day >= 1 && day <= maxDay;
    }
}