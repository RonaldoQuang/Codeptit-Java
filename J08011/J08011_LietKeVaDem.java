package J08011;

import java.util.*;

public class J08011_LietKeVaDem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> mp=new LinkedHashMap<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(check(s)==true) mp.put(s,mp.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String,Integer>> a=new ArrayList<>(mp.entrySet());
        Collections.sort(a,(x,y)->y.getValue().compareTo(x.getValue()));
        for(Map.Entry<String,Integer> x:a){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
    public static boolean check(String s){
        int ok=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                ok=0;
                break;
            }
        }
        if(ok==1) return true;
        else return false;
    }
}
