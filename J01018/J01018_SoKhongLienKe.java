package J01018;

import java.util.*;

public class J01018_SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int ok=1, sum=0;
            for(int i=0;i<s.length()-1;i++){
                int c=s.charAt(i)-'0', a=s.charAt(i+1)-'0';
                if(Math.abs(a-c)!=2){
                    ok=0;
                    break;
                }
                sum+=c;
                if(i==s.length()-2) sum+=a;
            }
            if(ok==1&&sum%10==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
