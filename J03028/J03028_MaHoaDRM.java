package J03028;

import java.util.*;

public class J03028_MaHoaDRM {
    static Map<Character,Integer> mp=new HashMap<>();
    static Map<Integer,Character> mp1=new HashMap<>();
    public static String rotate(String a){
        int sum=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            sum+=mp.get(c);
        }
        sum%=26;
        String w="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            int x=mp.get(c)+sum;
            if(x<=25){
                w+=""+mp1.get(x);
            }
            else{
                w+=""+mp1.get(x%26);
            }
        }
        return w;
    }
    public static String merge(String a, String b){
        String w="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i), d=b.charAt(i);
            int x=mp.get(c)+mp.get(d);
            if(x<=25){
                w+=""+mp1.get(x);
            }
            else{
                w+=""+mp1.get(x%26);
            }
        }
        return w;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<26;i++){
            mp.put((char) (65+i),i);
            mp1.put(i,(char) (65+i));
        }
        int t= sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String a=s.substring(0,s.length()/2);
            String b=s.substring(s.length()/2,s.length());
            a=rotate(a);
            b=rotate(b);
            System.out.println(merge(a,b));
        }
    }
}
