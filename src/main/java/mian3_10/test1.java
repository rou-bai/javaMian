package mian3_10;

public class test1 {
    public static void main(String[] args){
        int i = 1;
        i = i ++;  //i 覆盖 i++值，所以i=1
        int j = i++;  //j =i =1; i=2
        int k = i + ++i * i++;  //k = i + 3 * 3 = 2 + 3 *3 = 11  i=4

        //最终结果：i=4;j=1;k=11
    }
}
