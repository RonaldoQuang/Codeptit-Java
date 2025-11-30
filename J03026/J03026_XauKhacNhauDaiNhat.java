package J03026;

import java.util.*;

public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String A=sc.next();
            String B=sc.next();
            if(A.equals(B)){
                System.out.println(-1);
            }
            else{
                System.out.println(Math.max(A.length(),B.length()));
            }
        }
    }
}
