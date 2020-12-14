package demo.msa.hello;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/12/7 5:32 下午
 */
public class Test4 {
    public static void main(String[] args) {
        s2();
    }

    public static void s2() {
        String a = "123456";
        String b = "134562439";
        String maxSubStr = "";
        int max_len = 0;
        for(int i=0; i<a.length(); i++){
            for(int j=0; j<b.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    for(int m=i, n=j; m<a.length()&&n<b.length(); m++,n++){
                        if(a.charAt(m) != b.charAt(n)){
                            break;
                        }
                        if(max_len < m-i+1){
                            max_len = m-i+1;
                            maxSubStr = a.substring(i, m+1);
                        }
                    }
                }
            }
        }
        System.out.println(maxSubStr);
    }
}
