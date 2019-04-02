package com.imooc.luckymoney.repository;

import com.imooc.luckymoney.dataobject.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 韦师兄
 * 2019-04-02 00:30
 */
public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {
}
