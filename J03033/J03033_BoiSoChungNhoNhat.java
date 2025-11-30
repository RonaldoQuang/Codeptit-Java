package J03033;

import java.math.BigInteger;
import java.util.*;

public class J03033_BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a=new BigInteger(sc.next());
            BigInteger b=new BigInteger(sc.next());
            System.out.println(a.multiply(b).divide(ucln(a,b)));
        }
    }
    public static BigInteger ucln(BigInteger a, BigInteger b){
        if(b.equals(BigInteger.ZERO)) return a;
        return ucln(b,a.mod(b));
    }
}
