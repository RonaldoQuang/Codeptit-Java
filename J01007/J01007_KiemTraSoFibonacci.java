package J01007;

import java.util.*;

public class J01007_KiemTraSoFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(fib(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean fib(long n){
        if(n==0||n==1) return true;
        else{
            long a=1, b=1, c=a+b;
            while(c<n){
                a=b;
                b=c;
                c=a+b;
            }
            if(c==n) return true;
            else return false;
        }
    }
}
