package com.example.springbootjpadome.repository;

import com.example.springbootjpadome.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 风 on 2020/9/16.
 * 继承jpaRepository<T, ID>  T: 实体类Banner ID banner实体类的主键ID的类型 我的这里是Long
 */
public interface BannerRepository extends JpaRepository<Banner, Long> {

}
