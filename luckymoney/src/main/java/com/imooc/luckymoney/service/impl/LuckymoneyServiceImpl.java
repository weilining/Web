package com.imooc.luckymoney.service.impl;

import com.imooc.luckymoney.dataobject.Luckymoney;
import com.imooc.luckymoney.repository.LuckymoneyRepository;
import com.imooc.luckymoney.service.LuckymoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by 韦师兄
 * 2019-04-02 08:31
 */
@Service
public class LuckymoneyServiceImpl implements LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    /**
     * 事务 指数据库事务
     * 扣库存 > 创建订单
     */
    @Transactional
    @Override
    public void createTwo() {

        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setProducer("师兄");
        luckymoney.setMoney(new BigDecimal(520));
        repository.save(luckymoney);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("师兄");
        luckymoney2.setMoney(new BigDecimal(1314));
        repository.save(luckymoney2);


    }
}
