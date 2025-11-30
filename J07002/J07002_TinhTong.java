package J07002;

import java.util.*;
import java.io.File;

public class J07002_TinhTong {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()){
            String s=sc.next();
            if(check(s)) sum+=Integer.parseInt(s);
        }
        System.out.print(sum);
    }
    public static boolean check(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
