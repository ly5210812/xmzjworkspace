/**
 * Copyright (C), 2015-2020, 西安金科教育
 * FileName: HelloController
 * Author:   Ly颖
 * Date:     2020/8/24 20:52
 * Description: HelloController
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * <p>
 * 〈一句话功能简述〉<br>
 * 〈HelloController〉
 *
 * @author Ly颖
 * @create 2020/8/24
 * @since 1.0.0
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈HelloController〉
 *
 * @author Ly颖
 * @create 2020/8/24
 * @since 1.0.0
 */
package com.jk.controller;

import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
      @Autowired
      HelloService helloService;
    //http restful  编程风格 @GetMapping
    //@RequestParam  传递参数   基本数据类型  或 字符串
    //@RequestMapping  对象
    //@RequestMapping (value="hi/",method=RequestMethod.GET) 与 @GetMapping(value = "/hi") 性质一致
    @GetMapping(value = "/hi") //查询
    //@PostMapping   新增
    //@DeleteMapping  删除
    //@PutMapping   修改
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
