package J03020;

import java.util.*;

public class J03020_TimTuThuanNghichDaiNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Integer> mp=new LinkedHashMap<>();
        while(sc.hasNext()){
            String s= sc.next();
            String rev=new StringBuilder(s).reverse().toString();
            if(s.equals(rev)) mp.put(s,mp.getOrDefault(s,0)+1);
        }
        int max=-1;
        for(Map.Entry<String,Integer> x:mp.entrySet()){
            if(x.getKey().length()>max) max=x.getKey().length();
        }
        for(Map.Entry<String,Integer> x:mp.entrySet()){
            if(x.getKey().length()==max){
                System.out.println(x.getKey()+" "+x.getValue());
            }
        }
    }
}
