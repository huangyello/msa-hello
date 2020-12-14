package demo.msa.hello.entity;

import lombok.Data;

import java.util.Date;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/12/1 1:50 下午
 */
@Data
public class Student {

    private String name;

    private Integer age;

    private Date birthDay;

    public Student(String name, Integer age, Date birthDay) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }
}
