package com.imooc.luckymoney.controller;

import com.imooc.luckymoney.properties.LimitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 韦师兄
 * 2019-04-01 20:13
 */

//@RestController
@Controller
@RequestMapping("/hello")
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${description}")
//    private String description;

    @Autowired
    private LimitProperties limitProperties;

    @GetMapping({"/say/{id}", "/hi"})
    @ResponseBody
//    @PathVariable("id") Integer id
//    @RequestParam("id1") Integer id1
    public String say(@PathVariable(value = "id",required = false) Integer id,
                      @RequestParam(value = "id1", required = false, defaultValue = "0") Integer id1) {
//        return "minMoney:"+ minMoney+",说明："+description;
        return "说明：" + limitProperties.getDescription() + id + id1;
//        return "index";
    }

    @GetMapping("/hello2")
    public String say2() {
        return "index";
    }

}
