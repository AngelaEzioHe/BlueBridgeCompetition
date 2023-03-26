import java.util.Scanner;

/**
 * @Author: EzioHe
 * @Date: 2023/3/26 19:28
 */
/*
    如果一个分数的分子和分母的最大公约数是1，这个分数称为既约分数。
    例如：3/4,1/8,7/1,都是既约分数
    请问，有多少个既约分数，分子和分母都是1到2020之间的整数（包括1和2020）?
 */

public class ReduceFraction {
    public static void main(String[] args) {
        int num=0;
        for(int i=1;i<=2020;i++){
            for(int j=1;j<=2020;j++){
                if(isReduceFraction(i,j)){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
    public static boolean isReduceFraction(int x,int y){
        int min;
        if(x<y){
            min=x;
        }else {
            min=y;
        }
        int tmp=0;
        for(int i=1;i<=min;i++){
            if(x%i==0&&y%i==0){
                tmp++;
            }
        }
        if(tmp==1){
            return true;
        }else {
            return false;
        }
    }
}


//import java.util.Scanner;
//
//public class ReduceFraction {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        // 在此输入您的代码...
//        int count = 0;
//        for (int i = 1; i <= 2020; i++) {
//            for (int j = i + 1; j <= 2020; j++) {
//                if (gcd(i, j) == 1) {
//                    count++;
//                }
//            }
//        }
//        //小在分子 大在分母   1/1  特殊情况
//        System.out.println(count * 2 + 1);
//        scan.close();
//    }
//
//    // x大 y小
//    public static int gcd(int x, int y) {
//        if (y == 0) {
//            return x;
//        }
//        return gcd(y,x % y);
//
//    }
//}
