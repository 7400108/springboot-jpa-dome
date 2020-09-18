package com.example.springbootjpadome.service;

import com.example.springbootjpadome.model.Banner;
import com.example.springbootjpadome.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 风 on 2020/9/16.
 */
@Service
public class BannerService {
    @Autowired
    private BannerRepository bannerRepository;
    public Banner getById(Long id){
        return bannerRepository.findById(id).orElse(null);
    }
    public List<Banner> getBannerList(){
        return bannerRepository.findAll();
    }
}
