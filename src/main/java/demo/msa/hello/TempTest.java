package demo.msa.hello;

import org.apache.cxf.common.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/12/10 2:05 下午
 */
public class TempTest {
    public static void main(String[] args) {
        /*String regexStr = "[\u4E00-\u9FA5]";
        String str = "阴性阴性&lt;0.05";*/

        /*String str = "阴性阳性hello&lt;0.05";
        String regEx="[`~!@#$%^&*()+=|{}:;\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？a-zA-Z0-9 ]";
        Pattern c = Pattern.compile(regEx);
        Matcher mc=c.matcher(str);
        String result =  mc.replaceAll("").trim();
        System.out.println(result);*/

        Map<String, String> codeMap = new HashMap<>();
        codeMap.put("111", "阴性&lt;0.05");
        codeMap.put("222", "阳性&lt;0.05");
        codeMap.put("333", "中性");
        dealTestValues(codeMap);
        System.out.println(codeMap);
    }

    private static void dealTestValues(Map<String, String> codeMap){
        for (Map.Entry<String, String> entry : codeMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            String regEx="[`~!@#$%^&*()+=|{}:;\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？a-zA-Z0-9 ]";
            Pattern c = Pattern.compile(regEx);
            if(entry.getValue() != null && !entry.getValue().equals("")){
                Matcher mc = c.matcher(entry.getValue());
                String result = mc.replaceAll("").trim();
                entry.setValue(result);
            }
        }
    }
}
