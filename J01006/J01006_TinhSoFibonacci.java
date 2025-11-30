package J01006;

import java.util.*;

public class J01006_TinhSoFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(fib(n));
        }
    }
    public static long fib(int n){
        if(n==1||n==2) return 1;
        else{
            int cnt=3;
            long a=1, b=1, c=a+b;
            while(cnt<n){
                a=b;
                b=c;
                c=a+b;
                ++cnt;
            }
            return c;
        }
    }
}
