package mian3_10;
/*题目：一共有n个台阶，可以走1步或者2步，问一共有几种走访
记住公式：fn = f(n-1) + f(n-2)  这个我也不是很理解，死记
 */

public class taijie {
    public static int f(int n){
        //迭代法
        if(n == 1 || n == 2){
            return n;
        }
        return f(n-1) + f(n-2);
    }

    public static int f2(int n){
        //遍历法
        if(n == 1 || n == 2){
            return n;
        }
        int one = 1; //指走第一级台阶需要步数
        int two = 2; //指走第二级台阶需要步数
        int sum = 0;
        for(int i=3; i<n; i++){
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }
}
