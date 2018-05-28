package com.learn.mmrepo.user;

import com.learn.mmentity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: wangw
 * @date: 2018/5/27 22:13
 * @description:
 */
public interface UserRepository extends JpaRepository<User, String> {
}
