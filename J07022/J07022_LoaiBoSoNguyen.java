package J07022;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("DATA.in"));
        ArrayList<String> v=new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(check(s)==false){
                v.add(s);
            }
        }
        Collections.sort(v);
        for(int i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
    }
    public static boolean check(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
