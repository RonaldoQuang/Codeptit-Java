package J05072;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class call implements Comparable<call>{
    String ma, ten;
    long phut, tien;
    public call(String ma, String ten, long phut, long gia){
        this.ma=ma;
        this.ten=ten;
        this.phut=phut;
        this.tien=gia*phut;
    }
    @Override
    public int compareTo(call a){
        return Long.compare(a.tien,this.tien);
    }
    public void kq(){
        System.out.printf("%s %s %d %d\n",ma,ten,phut,tien);
    }
}

public class J05072_TinhCuocDienThoaiCoDinh2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,String> mp=new HashMap<>();
        Map<Integer,Long> mp1=new HashMap<>();
        List<call> A=new ArrayList<>();
        while(n-->0){
            int ma=sc.nextInt();
            sc.nextLine();
            String ten=sc.nextLine();
            long gia=sc.nextLong();
            mp.put(ma,ten);
            mp1.put(ma,gia);
        }
        int m=sc.nextInt();
        while(m-->0){
            String ma=sc.next();
            String bd=sc.next();
            String kt=sc.next();
            String[] a=bd.split(":");
            String[] b=kt.split(":");
            LocalTime start=LocalTime.of(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
            LocalTime end=LocalTime.of(Integer.parseInt(b[0]),Integer.parseInt(b[1]));
            Duration d=Duration.between(start,end);
            long mi=d.toMinutes();
            int so=Integer.parseInt(ma.substring(0,3));
            if(ma.charAt(0)!='0'){
                long x=(long) Math.ceil(mi/3.0);
                A.add(new call(ma,"Noi mang",x,800));
            }
            else{
                A.add(new call(ma,mp.get(so),mi,mp1.get(so)));
            }
        }
        Collections.sort(A);
        for(call x:A) x.kq();
    }
}
