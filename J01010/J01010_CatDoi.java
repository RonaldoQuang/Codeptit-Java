package J01010;

import java.util.*;

public class J01010_CatDoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine(), w="";
            int ok=1, ok1=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c!='0'&&c!='1'&&c!='8'&&c!='9'){
                    ok=0;
                    break;
                }
                else if(c=='1'){
                    ok1=1;
                    w+="1";
                }
                else w+="0";
            }
            if(ok==1&&ok1==1){
                System.out.println(Long.parseLong(w));
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
