package J03024;

import java.util.*;

public class J03024_SoUuThe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int chan=0, le=0, ok=1;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(!Character.isDigit(c)||s.charAt(0)=='0'){
                    ok=0;
                    break;
                }
                else{
                    int a=c-'0';
                    if(a%2==0) ++chan;
                    else ++le;
                }
            }
            if(ok==0) System.out.println("INVALID");
            else {
                if((s.length()%2==0&&chan>le)||(s.length()%2==1&&le>chan)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}
