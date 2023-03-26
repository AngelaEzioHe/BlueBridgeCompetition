import java.util.Scanner;

/**
 * @Author: EzioHe
 * @Date: 2023/3/26 16:50
 */
/*
    如果我们按从上到下、从左到右的顺序把所有数排成一列，可以得到如下数列：
    1,1,1,1,2,1,1,3,3,1,1,4,6,4,1,...
    给定一个正整数 N，请你输出数列中第一次出现 N 是在第几个数？
 */

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int [][]num=new int[100][100];
        //num[x][y] -> x是行，y是列
//        num[1][3]=5;
//        for(int i=0;i<num.length;i++){
//            for(int j=0;j<num[i].length;j++){
//                System.out.print(num[i][j]);
//            }
//            System.out.println();
//        }
        num[0][0]=num[1][0]=num[1][1]=1;
        for(int i=2;i<num.length;i++){
            num[i][0]=1;
            for(int j=1;j<i+1;j++){
                num[i][j]=num[i-1][j-1]+num[i-1][j];
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf("%d\t",num[i][j]);
            }
            System.out.println();
        }
        int tmp=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<i+1;j++){
                tmp++;
                if(num[i][j]==N){
                    break;
                }
            }
        }
        System.out.println(tmp);
    }
}
