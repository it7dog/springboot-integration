package com.learn.user;

import com.learn.mmentity.common.R;
import com.learn.mmservice.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangw
 * @date: 2018/5/27 21:30
 * @description:
 */
@RestController
@RequestMapping("/user/*")
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping("list")
  public R list() {
    try {
      return R.isOk().data(userService.list());
    } catch (Exception e) {
      return R.isFail(e);
    }

  }
}
