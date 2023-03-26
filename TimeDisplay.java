import java.util.Scanner;

/**
 * @Author: EzioHe
 * @Date: 2023/3/26 18:04
 */
public class TimeDisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long allSecond = num / 1000;
        int Second = (int) allSecond % 60;
        long allMinute = allSecond / 60;
        int Minute = (int) allMinute % 60;
        long allHour = allMinute / 60;
        int Hour = (int) allHour % 60;
        if(Hour<10){
            System.out.printf("0%d",Hour);
        }else {
            System.out.printf("%d",Hour);
        }
        System.out.printf(":");
        if(Minute<10){
            System.out.printf("0%d",Minute);
        }else {
            System.out.printf("%d",Minute);
        }
        System.out.printf(":");
        if(Second<10){
            System.out.printf("0%d",Second);
        }else {
            System.out.printf("%d",Second);
        }
    }
}
