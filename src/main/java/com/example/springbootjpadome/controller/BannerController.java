package com.example.springbootjpadome.controller;

import com.example.springbootjpadome.model.Banner;
import com.example.springbootjpadome.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 风 on 2020/9/16.
 */
@RequestMapping("/hello")
@RestController // 等同于@ResponseBody + @Controller
@Validated
public class BannerController {
       @Autowired
       private BannerService bannerService;
//    @PostMapping
//    @DeleteMapping
//    @PutMapping
    @GetMapping("/{id}")
    public Banner getById(@PathVariable  Long id){
            return bannerService.getById(id);
    }
    @GetMapping("")
    public List<Banner> getByList(){
        return bannerService.getBannerList();
    }


}
