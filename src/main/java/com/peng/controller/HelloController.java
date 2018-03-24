package com.peng.controller;

import com.peng.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @Autowired
    private GirlProperties girlProperties;

    /**
     * url 不需要带项目名 localhost:8080/hello 即可
     * @return
     */
    @RequestMapping(value ={ "/hello", "/hi"},method = RequestMethod.GET)
    public String say() {
        return girlProperties.getCupSize();
    }

    /**
     * rest 格式的url 注解中的id 对应url中的id   参数的id为自己定义
     * @param id
     * @return
     */
    //@RequestMapping(value ="/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say1(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id) {
        return id.toString();
    }
}
