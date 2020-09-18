package com.example.springbootjpadome.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 风 on 2020/9/16.
 */
@Entity // 数据库映射实体类注解
@Data // lombok 注解生成get set方法
//@Table(name = "banner")  如果下面的类名不是以数据库表名驼峰式命名的 加上这个注解 下面随便命名
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String title;
    private String img;
}
