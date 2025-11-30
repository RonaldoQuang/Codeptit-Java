package J03018;

import java.math.BigInteger;
import java.util.*;

public class J03018_TimSoDu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            BigInteger n=sc.nextBigInteger();
            int mod=1;
            BigInteger a=BigInteger.valueOf(2).add(BigInteger.valueOf(2)), b=BigInteger.ZERO;
            if(n.mod(a).equals(b)) mod+=3;
            else mod+=9;
            System.out.println(mod%5);
        }
    }
}