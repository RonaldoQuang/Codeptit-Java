package J02024;

import java.util.*;

public class J02024_DayConCoTongLe {
    public static void kq(ArrayList<Integer> v){
        for(int i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
    }
    public static void Try(ArrayList<Integer> v, int[] a, int i, int sum){
        if(sum%2==1){
            kq(v);
        }
        for(int j=0;j<i;j++){
            sum+=a[j];
            v.add(a[j]);
            Try(v,a,j,sum);
            sum-=a[j];
            v.remove(v.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            ArrayList<Integer> v=new ArrayList<>();
            for(int i=0;i<n;i++){
                int sum=a[i];
                v.add(a[i]);
                Try(v,a,i,sum);
                v.remove(v.size()-1);
            }
        }
    }
}
