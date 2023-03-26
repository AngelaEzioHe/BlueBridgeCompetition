/**
 * @Author: EzioHe
 * @Date: 2023/3/26 21:28
 */
/*
    给定数列1,1,1,3,5,9,17,...,从第4项开始，每项都是前3项的和。
    求第20190324项的最后4位数字。
 */

public class SequenceEvaluate {
    public static void main(String[] args) {
        int []sequence=new int[20190330];
        sequence[1]=sequence[2]=sequence[3]=1;
        for(int i=4;i<=20190324;i++){
            sequence[i]=(sequence[i-1]+sequence[i-2]+sequence[i-3])%10000;
        }
        System.out.println(sequence[20190324]);
    }
}
