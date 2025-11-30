package J05079;

import java.util.*;

class lop implements Comparable<lop>{
    private String ma, ten, nhom, gv;
    public lop(String ma, String ten, String nhom, String gv){
        this.ma=ma;
        this.ten=ten;
        this.nhom=nhom;
        this.gv=gv;
    }
    public String getMa(){
        return this.ma;
    }
    @Override
    public int compareTo(lop a){
        return Integer.parseInt(this.nhom)-Integer.parseInt(a.nhom);
    }
    public void kq(){
        System.out.printf("%s %s\n",nhom,gv);
    }
}

public class J05079_LopHocPhan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Map<String,String> mp=new HashMap<>();
        List<lop> a=new ArrayList<>();
        while(t-->0){
            String ma= sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String nhom=sc.next();
            sc.nextLine();
            String gv=sc.nextLine();
            mp.put(ma,ten);
            a.add(new lop(ma,ten,nhom,gv));
        }
        Collections.sort(a);
        int q=sc.nextInt();
        while(q-->0){
            String mau=sc.next();
            System.out.println("Danh sach nhom J05079.lop mon "+mp.get(mau)+":");
            for(lop x:a){
                if(x.getMa().equals(mau)) x.kq();
            }
        }
    }
}
