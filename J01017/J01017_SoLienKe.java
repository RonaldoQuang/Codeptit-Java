package J01017;

import java.util.*;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int ok=1;
            for(int i=0;i<s.length()-1;i++){
                int c=s.charAt(i)-'0', a=s.charAt(i+1)-'0';
                if(Math.abs(a-c)!=1){
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
