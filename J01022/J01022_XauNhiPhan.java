package J01022;

import java.util.*;

public class J01022_XauNhiPhan {
    public static final int mod=(int)1e9+7;
    public static long[] fi=new long[100];
    public static void fib(){
        fi[1]=1L;
        fi[2]=1L;
        for(int i=3;i<93;i++){
            fi[i]=fi[i-2]+fi[i-1];
        }
    }
    public static char tim(int n, long k){
        if(n==1) return '0';
        if(n==2) return '1';
        if(k>fi[n-2]){
            return tim(n-1,k-fi[n-2]);
        }
        else{
            return tim(n-2,k);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fib();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            System.out.println(tim(n,k));
        }
    }
}
