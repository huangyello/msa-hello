package demo.msa.hello;


import demo.msa.hello.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/7/30 5:31 下午
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("有", 1, new Date());
        Thread.sleep(2000);
        Student s2 = new Student("无", 2, null);
        list.add(s1);
        list.add(s2);
        System.out.println(list);

        list = list.stream().sorted(Comparator.comparing(Student::getName, (a1, a2) ->{
            if(a1 == null && a2 == null){
                return 0;
            }else if(a1 == null){
                return 1;
            }else if(a2 == null){
                return -1;
            }
            if(a1.contains("有") && a2.contains("有")){
                return 0;
            }else if(a1.contains("有")){
                return -1;
            }else if(a2.contains("有")){
                return 1;
            }
            return 0;
        }
        )).collect(Collectors.toList());

        System.out.println(list);

        //list.sort(Comparator.comparing(Student::getBirthDay));
        //list.sort(Comparator.nullsLast(Comparator.comparing(Student::getBirthDay)));
        //list.sort(Comparator.comparing(Student::getBirthDay, Comparator.nullsLast(Comparator.naturalOrder())));
        //Student student = list.stream().min(
         //       Comparator.comparing(Student::getBirthDay, Comparator.nullsLast(Comparator.naturalOrder()))).get();
        //System.out.println(student);
        //System.out.println(student);
    }



}
