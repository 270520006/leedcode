package 第7题_整数反转;

//题目描述
//        7. 整数反转
//        给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//        如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
//        假设环境不允许存储 64 位整数（有符号或无符号）
public class MySolution {
    public int reverse(int x) {
    int reverseNum =0;
    while(x!=0){
        int pop=x%10;
        if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && pop > 7))
            return 0;
        if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && pop < -8))
            return 0;


        reverseNum=reverseNum*10+x%10;
        x=x/10;
    }
    return reverseNum;
    }


    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        int reverse = mySolution.reverse(123);
        System.out.println(reverse);
    }
}
