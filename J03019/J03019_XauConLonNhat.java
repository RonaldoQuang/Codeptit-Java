package J03019;

import java.util.*;

public class J03019_XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder w=new StringBuilder();
        char max=0;
        for(int i=s.length()-1;i>=0;i--) {
            char c=s.charAt(i);
            if (c>=max) {
                w.append(c);
                max=c;
            }
        }
        for(int i=w.length()-1;i>=0;i--){
            System.out.print(w.charAt(i));
        }
    }
}
