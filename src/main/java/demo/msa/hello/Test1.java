package demo.msa.hello;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/8/19 6:01 下午
 */
public class Test1 {
    public static void main(String[] args) {

        // 存储0-9的列表
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("原列表：");
        System.out.println(list);

        // 筛选列表中的偶数
        list = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("列表中的偶数：");
        System.out.println(list);
    }
}
