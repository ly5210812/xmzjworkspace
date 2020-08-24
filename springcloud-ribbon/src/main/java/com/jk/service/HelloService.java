/**
 * Copyright (C), 2015-2020, 西安金科教育
 * FileName: HelloService
 * Author:   Ly颖
 * Date:     2020/8/24 20:56
 * Description: HelloService
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * <p>
 * 〈一句话功能简述〉<br>
 * 〈HelloService〉
 *
 * @author Ly颖
 * @create 2020/8/24
 * @since 1.0.0
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈HelloService〉
 *
 * @author Ly颖
 * @create 2020/8/24
 * @since 1.0.0
 */
package com.jk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-provider/hi?name="+name,String.class);
    }
}
