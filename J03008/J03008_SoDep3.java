package J03008;

import java.util.*;

public class J03008_SoDep3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int ok=1, sum=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i), c2=s.charAt(s.length()-1-i);
                int a=c-'0';
                if(c!=c2||(a!=2&&a!=3&&a!=5&&a!=7)){
                    ok=0;
                    break;
                }
                sum+=a;
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
