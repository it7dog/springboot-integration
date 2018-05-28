package com.learn.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangw
 * @date: 2018/5/27 21:32
 * @description:
 */
@RestController
public class HelloController {
  @RequestMapping("/")
  public String index(){
    return "redirect:/user/list";
  }
}
