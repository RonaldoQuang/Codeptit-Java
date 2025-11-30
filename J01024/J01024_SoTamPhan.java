package J01024;

import java.util.*;

public class J01024_SoTamPhan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int ok=1;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c!='0'&&c!='1'&&c!='2'){
                    ok=0;
                    break;
                }

            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
