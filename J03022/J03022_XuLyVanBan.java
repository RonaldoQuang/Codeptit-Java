package J03022;

import java.util.*;

public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> v=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        while(sc.hasNext()){
            String s= sc.next();
            v.add(s.toLowerCase());
            char c=s.charAt(s.length()-1);
            if(c=='.'||c=='?'||c=='!') mp.put(v.size()-1,1);
        }
        for(int i=0;i<v.size();i++){
            String w=v.get(i);
            if(i==0||mp.getOrDefault(i-1,0)==1){
                w=Character.toUpperCase(w.charAt(0))+w.substring(1,w.length());
            }
            if(mp.getOrDefault(i,0)==1) System.out.println(w.substring(0,w.length()-1));
            else System.out.print(w+" ");
        }
    }
}