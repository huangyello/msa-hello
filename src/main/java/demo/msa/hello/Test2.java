package demo.msa.hello;


import demo.msa.hello.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/7/30 5:31 下午
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        ring(100, 7);
    }


    public static void ring(int n, int m){
        LinkedList<Integer> q = new LinkedList<Integer>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        int k = 2;
        int element = 0;
        int i = 1;
        for(; i<k; i++){
            element = q.poll();
            q.add(element);
        }
        i = 1;
        while (q.size() > 0){
            element = q.poll();
            if(i < m){
                q.add(element);
                i++;
            }else {
                i = 1;
                System.out.println(element);
            }
        }
    }

}
