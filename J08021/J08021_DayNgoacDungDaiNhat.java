package J08021;

import java.util.*;

public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int maxLen = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    st.push(i);
                }
                else {
                    st.pop();
                    if(!st.isEmpty()){
                        maxLen = Math.max(maxLen, i - st.peek());
                    }
                    else {
                        st.push(i);
                    }
                }
            }
            System.out.println(maxLen);
        }
    }
}

