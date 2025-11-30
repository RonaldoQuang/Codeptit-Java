package J01013;

import java.util.*;

public class J01013_TongUocSo_1 {
    public static final int mod=(int)1e9+7;
    public static int[] prime=new int[2000001];
    public static void sang(){
        for(int i=2;i<=2*1e6;i++){
            prime[i]=i;
        }
        for(int i=2;i<=Math.sqrt(2*1e6);i++){
            if(prime[i]==i){
                for(int j=i*i;j<=2*1e6;j+=i){
                    if(prime[j]==j){
                        prime[j]=i;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sang();
        long sum=0;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            while(n!=1){
                sum+=(long)prime[n];
                n/=prime[n];
            }
        }
        System.out.println(sum);
    }
}
