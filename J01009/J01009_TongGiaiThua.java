package J01009;

import java.util.*;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum=0, tich=1;
        for(long i=1;i<=n;i++){
            tich*=i;
            sum+=tich;
        }
        System.out.println(sum);
    }
}
