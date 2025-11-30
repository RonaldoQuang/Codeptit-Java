package J07008;

import java.util.*;
import java.io.File;

public class J07008_DayConTangDan {
    public static void kq(ArrayList<String> ve, ArrayList<Integer> v){
        String s="";
        for(int i=0;i<v.size();i++){
            s+=String.valueOf(v.get(i))+" ";
        }
        ve.add(s);
    }
    public static void Try(ArrayList<String> ve,ArrayList<Integer> v, int[] a, int i, int n){
        for(int j=i+1;j<n;j++){
            if(a[j]>a[i]){
                v.add(a[j]);
                kq(ve,v);
                Try(ve,v,a,j,n);
                v.remove(v.size()-1);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        ArrayList<Integer> v=new ArrayList<>();
        ArrayList<String> ve=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            v.add(a[i]);
            Try(ve,v,a,i,n);
            v.remove(v.size()-1);
        }
        ve.sort(Comparator.naturalOrder());
        for(int i=0;i<ve.size();i++){
            System.out.println(ve.get(i));
        }
    }
}
