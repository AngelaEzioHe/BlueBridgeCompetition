/**
 * @Author: EzioHe
 * @Date: 2023/3/26 14:35
 */
/*
    本题为填空题，只需要算出结果后，在代码中使用输出语句将所填结果输出即可。
    2,3,5,7,11,13,...,是素数数列。
    类似：7,37,67,97,127,157这样完全由素数组成的等差数列，叫等差素数数列
    上边的数列公差为30，长度为6
    2004年，格林与华人陶哲轩合作证明了：存在任意长度的素数等差数列。 这是数论领域一项惊人的成果！
    长度为10的等差数列，其公差最小值是多少？
 */

public class SequenceOfArithmeticPrimes {
    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            for (int j = 1; j < 1000; j++) {
                int k;
                for (k = 0; k <= 9; k++) {
                    if (!isPrime(i+k*j)){
                        break;
                    }
                }
                if(k==10){
                    System.out.println(j);
                    return;
                }
            }
        }
    }
    public static boolean isPrime(int num){
        for (int i = num-1; i >1 ; i--) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
