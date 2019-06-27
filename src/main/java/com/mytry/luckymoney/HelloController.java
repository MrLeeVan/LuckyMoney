package com.mytry.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Leevan
 * @Date： 2019/6/26 22:34
 * RestController = Controller+ResponseBody
 */
@RestController
//前后端一体的话，使用模板渲染Controller注解
@RequestMapping({"/hello","/web"})
public class HelloController {
   @Autowired
   private LimitConfig limitConfig;
    @GetMapping("/say")
    public String say(){
        return  "说明"+limitConfig.getDescription();
      /*  return "index";        */
    }
}
