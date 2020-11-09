package demo.msa.hello;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/7/30 5:31 下午
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(getAddDate(3));
    }

    public static Date getAddDate(int n){
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, n);
        Date addDate = c.getTime();
        return addDate;
    }

}
