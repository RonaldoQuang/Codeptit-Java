package J03007;

import java.util.*;

public class J03007_SoDep2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int ok=1, sum=0;
            for(int i=0;i<s.length()/2;i++){
                char c=s.charAt(i), c1=s.charAt(0), c2=s.charAt(s.length()-1-i);
                int a=c-'0';
                if(c!=c2||c1!='8'){
                    ok=0;
                    break;
                }
                sum+=a;
            }
            if(ok==1&&sum%10==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
