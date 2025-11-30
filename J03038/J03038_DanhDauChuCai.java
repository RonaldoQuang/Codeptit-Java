package J03038;

import java.util.*;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> se=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            se.add(c);
        }
        System.out.println(se.size());
    }
}
