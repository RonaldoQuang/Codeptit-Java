package J07003;

import java.math.BigInteger;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s=sc.nextLine();
        BigInteger a=new BigInteger(s.substring(0,s.length()/2));
        BigInteger b=new BigInteger(s.substring(s.length()/2,s.length()));
        BigInteger sum=a.add(b);
        while(sum.compareTo(BigInteger.TEN)>0||sum.compareTo(BigInteger.TEN)==0){
            System.out.println(sum);
            s=sum.toString();
            a=new BigInteger(s.substring(0,s.length()/2));
            b=new BigInteger(s.substring(s.length()/2,s.length()));
            sum=a.add(b);
        }
        System.out.print(sum);
    }
}
