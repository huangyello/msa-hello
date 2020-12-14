package demo.msa.hello;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/11/27 2:14 下午
 */
public class Test3 {
    public static void main(String[] args) {
        String errMsg = "{error:猪头你好}";
        Integer errIndex = errMsg.lastIndexOf("error:");
        Integer endIndex = errMsg.lastIndexOf("}");
        String errMsgSub = errMsg.substring(errIndex+6,endIndex);
        System.out.println(errMsgSub);
    }
}
