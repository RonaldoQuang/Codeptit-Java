package J03025;

import java.util.*;

public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int cnt=0;
            for(int i=0;i<s.length()/2;i++){
                char a=s.charAt(i);
                char b=s.charAt(s.length()-1-i);
                if(a!=b) ++cnt;
            }
            if(s.length()%2==1){
                if(cnt<=1) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                if(cnt==1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
