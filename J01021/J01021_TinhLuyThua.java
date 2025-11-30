package J01021;

import java.util.*;

public class J01021_TinhLuyThua {
    public static final int mod=(int)1e9+7;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            long a=sc.nextLong(), b=sc.nextLong();
            if(a==0&&b==0) break;
            else{
                System.out.println(luy_thua(a,b));
            }
        }
    }
    public static long luy_thua(long a, long b){
        if(b==0) return 1;
        if(b==1) return a%mod;
        long x=luy_thua(a,b/2);
        if(b%2==0) return (x*x)%mod;
        else return ((x*x)%mod*a)%mod;
    }
}
