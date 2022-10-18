package com.kovizone.mybatispp.demo1;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kovizone.mybatispp.core.conditions.query.QueryWrapper;
import com.kovizone.mybatispp.core.mapper.BaseMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Data
@TableName("person")
class Person {
    @TableId("id")
    private Integer id;
    private String name;
}

/**
 * PersonMapper
 *
 * @author KV
 * @since 2022/10/18
 */
@Mapper
interface PersonMapper extends BaseMapper<Person> {
}

/**
 * Demo1
 *
 * @author KV
 * @since 2022/10/18
 */
@RequiredArgsConstructor
@SpringBootApplication
public class Demo1 implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo1.class, args);
    }

    private final PersonMapper personMapper;

    @Override
    public void run(String... args) throws Exception {
        // 注意是com.kovizone.mybatispp.core.conditions.query.QueryWrapper
        QueryWrapper<Person> queryWrapper = new QueryWrapper<>();
        // Lambda字段和String字段混用
        queryWrapper.eq(Person::getId, 1);
        queryWrapper.eq("name", "张三");
        // SQL: SELECT id,name FROM person WHERE (id = ? AND name = ?)
        personMapper.selectList(queryWrapper);
    }
}
