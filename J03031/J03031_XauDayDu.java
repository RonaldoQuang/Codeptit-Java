package J03031;

import java.util.*;

public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int k=sc.nextInt();
            Set<Character> se=new TreeSet<>();
            for(int i=0;i<s.length();i++){
                se.add(s.charAt(i));
            }
            if(26-se.size()<=k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
