package J03027;

import java.util.*;

public class J03027_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                s.delete(i,i+2);
                i=0;
            }
            else i++;
        }
        if(s.length()==0) System.out.println("Empty String");
        else System.out.println(s);
    }
}
