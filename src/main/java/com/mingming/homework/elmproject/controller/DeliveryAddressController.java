package com.mingming.homework.elmproject.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mingming.homework.elmproject.entity.DeliveryAddress;
import com.mingming.homework.elmproject.service.DeliveryAddressService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/elm/DeliveryAddressController")
public class DeliveryAddressController {
    @Resource
    private DeliveryAddressService deliveryAddressService;

    @PostMapping("/saveDeliveryAddress")
    public int saveAddress(DeliveryAddress address) {
        boolean save = deliveryAddressService.save(address);
        return save ? 1 : 0;
    }

    @PostMapping("/updateDeliveryAddress")
    public int updateDeliveryAddress(DeliveryAddress address) {
        boolean update = deliveryAddressService.saveOrUpdate(address);
        return update ? 1 : 0;
    }

    @PostMapping("/removeDeliveryAddress")
    public int removeDeliveryAddress(int daId) {
        boolean b = deliveryAddressService.removeById(daId);
        return b ? 1 : 0;
    }

    @PostMapping("/getDeliveryAddressById")
    public DeliveryAddress getDeliveryAddressById(int daId) {
        return deliveryAddressService.getById(daId);
    }

    @PostMapping("/listDeliveryAddressByUserId")
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        QueryWrapper<DeliveryAddress> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId", userId);
        return deliveryAddressService.list(queryWrapper);
    }
}
