package J03010;

import java.util.*;

public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        Map<String,Integer> mp=new HashMap<>();
        sc.nextLine();
        while(t-->0){
            String s1=sc.nextLine();
            String[] a=s1.trim().split("\\s+");
            String s="";
            s+=a[a.length-1].toLowerCase();
            for(int i=0;i<a.length-1;i++){
                s+=Character.toLowerCase(a[i].charAt(0));
            }
            mp.put(s,mp.getOrDefault(s,0)+1);
            if(mp.getOrDefault(s,0)==1){
                System.out.println(s+"@ptit.edu.vn");
            }
            else if(mp.getOrDefault(s,0)>1){
                int cnt=mp.getOrDefault(s,0);
                System.out.println(s+cnt+"@ptit.edu.vn");
            }
        }
    }
}
