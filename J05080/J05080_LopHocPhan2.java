package J05080;

import java.util.*;

class lop implements Comparable<lop>{
    private String ma, ten, nhom, gv;
    public lop(String ma, String ten, String nhom, String gv){
        this.ma=ma;
        this.ten=ten;
        this.nhom=nhom;
        this.gv=gv;
    }
    public String getGv(){
        return this.gv;
    }
    @Override
    public int compareTo(lop a){
        if(!this.ma.equals(a.ma)) return this.ma.compareTo(a.ma);
        return Integer.parseInt(this.nhom)-Integer.parseInt(a.nhom);
    }
    public void kq(){
        System.out.printf("%s %s %s\n",ma,ten,nhom);
    }
}

public class J05080_LopHocPhan2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<lop> a=new ArrayList<>();
        while(t-->0){
            String ma= sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String nhom=sc.next();
            sc.nextLine();
            String gv=sc.nextLine();
            a.add(new lop(ma,ten,nhom,gv));
        }
        Collections.sort(a);
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String mau=sc.nextLine();
            System.out.println("Danh sach cho giang vien "+mau+":");
            for(lop x:a){
                if(x.getGv().equals(mau)) x.kq();
            }
        }
    }
}
