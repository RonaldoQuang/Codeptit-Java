package J05066;

import java.util.*;

class nv implements Comparable<nv>{
    private String ten, cv, hieu, bac;
    public nv(String ten, String ma){
        this.ten=ten;
        this.cv=ma.substring(0,2);
        this.hieu=ma.substring(4,7);
        this.bac=ma.substring(2,4);
    }
    public String getTen(){
        return this.ten.toLowerCase();
    }
    public String getCv(){
        return this.cv;
    }
    public int getHieu(){
        return Integer.parseInt(this.hieu);
    }
    public void sua(){
        this.cv="NV";
    }
    @Override
    public int compareTo(nv a){
        if(!this.bac.equals(a.bac)) return a.bac.compareTo(this.bac);
        return this.hieu.compareTo(a.hieu);
    }
    public void kq(){
        System.out.printf("%s%s %s %s\n",ten,cv,hieu,bac);
    }
}

public class J05066_TimKiemNhanVienTheoTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<nv> a=new ArrayList<>();
        Map<String,Integer> dem=new HashMap<>();
        dem.put("GD",0);
        dem.put("TP",0);
        dem.put("PP",0);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String w=sc.nextLine();
            String[] s=w.split("\\s+");
            String ma=s[0];
            String ten="";
            for(int i=1;i<s.length;i++){
                ten+=s[i]+" ";
            }
            nv x=new nv(ten,ma);
            a.add(x);
        }
        xuLy(a,"GD",1);
        xuLy(a,"TP",3);
        xuLy(a,"PP",3);
        Collections.sort(a);
        int q=sc.nextInt(); sc.nextLine();
        while(q-->0){
            String mau=sc.nextLine().toLowerCase();
            for(nv x:a){
                if(x.getTen().contains(mau)) x.kq();
            }
            System.out.println();
        }
    }
    private static void xuLy(List<nv> ds, String cv, int limit){
        List<nv> list=new ArrayList<>();
        for(nv x:ds){
            if(x.getCv().equals(cv)) list.add(x);
        }
        list.sort(Comparator.comparingInt(nv::getHieu));
        for(int i=limit;i<list.size();i++) list.get(i).sua();
    }
}