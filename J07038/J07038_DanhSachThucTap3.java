package J07038;

import java.util.*;
import java.io.*;

class part{
    private String ma, ten, lop;
    public part(String ma, String ten, String lop){
        this.ma=ma;
        this.ten=chuanhoa(ten);
        this.lop=lop;
    }
    public String chuanhoa(String w){
        String[] a=w.trim().split("\\s+");
        String s="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1,a[i].length()).toLowerCase();
        }
        for(int i=0;i<a.length;i++){
            if(i<a.length-1) s+=a[i]+" ";
            else s+=a[i];
        }
        return s;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return this.ten;
    }
    public String getLop() {
        return lop;
    }
}

class sv implements Comparable<sv>{
    private part x;
    private String td;
    public sv(part x, String td){
        this.x=x;
        this.td=td;
    }
    public String getTd() {
        return td;
    }

    @Override
    public int compareTo(sv a){
        return this.x.getMa().compareTo(a.x.getMa());
    }
    public void kq(){
        System.out.printf("%s %s %s\n",x.getMa(),x.getTen(),x.getLop());
    }
}

public class J07038_DanhSachThucTap3 {
    public static void main(String[] args) throws Exception{
        Map<String, part> mp=new HashMap<>();
        Map<String,Integer> mp1=new HashMap<>();
        Map<String,String> mp2=new HashMap<>();
        List<sv> a=new ArrayList<>();
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            mp.put(ma,new part(ma,ten,lop));
        }
        Scanner sc1=new Scanner(new File("DN.in"));
        int n=sc1.nextInt();
        while(n-->0){
            sc1.nextLine();
            String ma=sc1.nextLine();
            String ten=sc1.nextLine();
            int sl=sc1.nextInt();
            mp1.put(ma,sl);
            mp2.put(ma,ten);
        }
        Scanner sc2=new Scanner(new File("THUCTAP.in"));
        int m=sc2.nextInt();
        while(m-->0){
            String ma= sc2.next();
            String madn=sc2.next();
            a.add(new sv(mp.get(ma),madn));
        }
        Collections.sort(a);
        int k=sc2.nextInt();
        while(k-->0){
            String mau=sc2.next();
            int cnt=0;
            System.out.println("DANH SACH THUC TAP TAI "+mp2.get(mau)+":");
            for(sv x:a){
                if(x.getTd().equals(mau)){
                    x.kq();
                    ++cnt;
                }
                if(cnt==mp1.get(mau)) break;
            }
        }
    }
}
