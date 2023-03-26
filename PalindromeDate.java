import java.util.Date;
import java.util.Scanner;

/**
 * @Author: EzioHe
 * @Date: 2023/3/25 15:03
 */
public class PalindromeDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        //把字符串日期 s 转化为数字 num
        long num = Integer.parseInt(s);
        //System.out.println(temp);
        int f1 = 0; //表示没有找到回文日期
        int f2 = 0; //表示没有找到ABABBABA型日期
        for (long i = num; i < 89991231; i++) {
            if (f1 == 1 && f2 == 1) { //已得到最后结果
                break;
            }
            //把日期 i 转化为字符串 S
            String S = String.valueOf(i);
            if (isTrueDate(S) == false) { //不是回文日期，跳过该循环
                continue;
            }
            if (f1 == 0) { //程序能走到这一步，说明 S 是回文日期
                System.out.println(S);
                f1 = 1;
            }
            if (isABABBABA(S) == true) { //是ABABBABA型的回文日期
                System.out.println(S);
                f2 = 1;
            }
        }
    }

    //run[0]表示的是闰年每个月的天数，run[1]表示的是非闰年每个月的天数
    static int[][] run = {{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};

    public static boolean isTrueDate(String s) { //判断是否为回文日期
        int date = Integer.parseInt(s);
        int[] Date = new int[8];
        Date[7] = date % 10;
        Date[6] = (date % 100) / 10;
        Date[5] = (date % 1000) / 100;
        Date[4] = (date % 10000) / 1000;
        Date[3] = (date % 100000) / 10000;
        Date[2] = (date % 1000000) / 100000;
        Date[1] = (date % 10000000) / 1000000;
        Date[0] = date / 10000000;
        for (int i = 0; i < Date.length; i++) {
            if (Date[i] != Date[Date.length - i - 1]) {
                return false;
            }
        }
        //判断日期是否合法
        int year = Date[0] * 1000 + Date[1] * 100 + Date[2] * 10 + Date[3];
        int month = Date[4] * 10 + Date[5];
        int day = Date[6] * 10 + Date[7];
        if (month > 12) {
            return false;
        }
        int f = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 0 : 1; //是闰年，f=0;不是闰年。f=1
        if (day > run[f][month]) {
            return false;
        }
        return true;
    }

    public static boolean isABABBABA(String s) { //在isTrueDate(String s)的基础上判断是否为ABABBABA型回文数
        int date = Integer.parseInt(s);
        int[] Date = new int[8];
        Date[7] = date % 10;
        Date[6] = (date % 100) / 10;
        Date[5] = (date % 1000) / 100;
        Date[4] = (date % 10000) / 1000;
        Date[3] = (date % 100000) / 10000;
        Date[2] = (date % 1000000) / 100000;
        Date[1] = (date % 10000000) / 1000000;
        Date[0] = date / 10000000;
        if(Date[0]==Date[2]&&Date[2]==Date[4]&&Date[4]==Date[6]&&
                Date[1]==Date[3]&&Date[3]==Date[5]&&Date[5]==Date[7]&&
                Date[0]!=Date[1]){
            return true;
        }else {
            return false;
        }
    }
}
