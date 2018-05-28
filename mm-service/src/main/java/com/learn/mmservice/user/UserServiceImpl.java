package com.learn.mmservice.user;


import com.learn.mmentity.user.User;
import com.learn.mmrepo.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wangw
 * @date: 2018/5/27 21:44
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  UserRepository userRepository;

  @Override
  public List<User> list() {
    return userRepository.findAll();
  }
}
