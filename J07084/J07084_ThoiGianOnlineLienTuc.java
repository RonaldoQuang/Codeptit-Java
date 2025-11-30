package J07084;

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class kh implements Comparable<kh>{
    private String ten;
    private long tg;
    public kh(String ten, String d1, String d2){
        this.ten=ten;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime t1 = LocalDateTime.parse(d1, formatter);
        LocalDateTime t2 = LocalDateTime.parse(d2, formatter);
        Duration d = Duration.between(t1, t2);
        this.tg=d.toMinutes();
    }
    @Override
    public int compareTo(kh a){
        if(this.tg!=a.tg) return Long.compare(a.tg,this.tg);
        return this.ten.compareTo(a.ten);
    }
    public void kq(){
        System.out.printf("%s %d\n",ten,tg);
    }
}

public class J07084_ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("ONLINE.in"));
        List<kh> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String ten=sc.nextLine();
            String bd=sc.nextLine();
            String kt=sc.nextLine();
            a.add(new kh(ten,bd,kt));
        }
        Collections.sort(a);
        for(kh x:a) x.kq();
    }
}


