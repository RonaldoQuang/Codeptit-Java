package J05075;

import java.util.*;

class part{
    private String ma, ten, lop;
    public part(String ma, String ten, String lop){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
    }
    public String getMa(){
        return this.ma;
    }
    public String getTen(){
        return this.ten;
    }
    public String getLop(){
        return this.lop;
    }
}

class sv{
    private part x;
    private int diem;
    public sv(part x, int diem){
        this.x=x;
        this.diem=diem;
    }
    public String getLop(){
        return this.x.getLop();
    }
    public void kq(){
        if(diem==0) System.out.printf("%s %s %s %d KDDK\n",x.getMa(),x.getTen(),x.getLop(),diem);
        else System.out.printf("%s %s %s %d\n",x.getMa(),x.getTen(),x.getLop(),diem);
    }
}

public class J05075_DiemDanh2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> b=new ArrayList<>();
        Map<String, part> mp=new HashMap<>();
        Map<String, sv> mp1=new HashMap<>();
        for(int i=0;i<n;i++){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.next();
            b.add(ma);
            mp.put(ma,new part(ma,ten,lop));
        }
        for(int i=0;i<n;i++){
            String ma=sc.next();
            String s=sc.next();
            int diem=10;
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(c=='v') diem-=2;
                else if(c=='m') diem-=1;
            }
            if(diem<=0) mp1.put(ma,new sv(mp.get(ma),0));
            else mp1.put(ma,new sv(mp.get(ma),diem));
        }
        String s=sc.next();
        for(String x:b){
            if(mp1.get(x).getLop().equals(s)) mp1.get(x).kq();
        }
    }
}

