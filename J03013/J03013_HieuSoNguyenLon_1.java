package J03013;

import java.math.BigInteger;
import java.util.*;

public class J03013_HieuSoNguyenLon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger c=a.subtract(b).abs();
            String s=c.toString();
            int len=Math.max(a.toString().length(),b.toString().length());
            while(s.length()<len){
                s="0"+s;
            }
            System.out.println(s);
        }
    }
}
