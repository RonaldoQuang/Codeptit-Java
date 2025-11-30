package J06007;

import java.util.*;

class DanhSach{
    private String gv;
    private float gio;
    public DanhSach(String gv, float gio){
        this.gv=gv;
        this.gio=gio;
    }
    public void kq(){
        System.out.printf("%s%.2f\n",gv,gio);
    }
}

public class J06007_BangTinhGioChuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<DanhSach> a=new ArrayList<>();
        Map<String,String> mp=new LinkedHashMap<>();
        Map<String,Float> mp1=new HashMap<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
        }
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String w=sc.nextLine();
            String[] s=w.split("\\s+");
            String ma=s[0];
            StringBuilder ten=new StringBuilder();
            for(int i=1;i<s.length;i++) ten.append(s[i]).append(" ");
            mp.put(ma,ten.toString());
            mp1.put(ma,0f);
        }
        int m=sc.nextInt();
        while(m-->0){
            String ma=sc.next();
            String ma1=sc.next();
            float gio=sc.nextFloat();
            mp1.put(ma,mp1.get(ma)+gio);
        }
        for(Map.Entry<String,String> x: mp.entrySet()){
            a.add(new DanhSach(x.getValue(),mp1.get(x.getKey())));
        }
        for(DanhSach x:a) x.kq();
    }
}
