package J03011;

import java.util.*;

public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            sc.nextLine();
            String b=sc.nextLine();
            long sum=0;
            for(int i=0;i<b.length();i++){
                char c= b.charAt(i);
                sum=sum*10+c-'0';
                sum%=a;
            }
            System.out.println(ucln(a,sum));
        }
    }
    public static long ucln(long a, long b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
}
