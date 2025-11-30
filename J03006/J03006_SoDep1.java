package J03006;

import java.util.*;

public class J03006_SoDep1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int ok=1;
            for(int i=0;i<s.length()/2;i++){
                char c=s.charAt(i), c2=s.charAt(s.length()-1-i);
                int a=c-'0';
                if(c!=c2||a%2==1){
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
