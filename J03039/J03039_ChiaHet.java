package J03039;

import java.math.BigInteger;
import java.util.*;

public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a=new BigInteger(sc.next());
            BigInteger b=new BigInteger(sc.next());
            if(a.mod(b).equals(BigInteger.ZERO)||b.mod(a).equals(BigInteger.ZERO)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
