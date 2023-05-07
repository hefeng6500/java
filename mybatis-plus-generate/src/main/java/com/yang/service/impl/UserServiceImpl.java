package com.yang.service.impl;

import com.yang.domain.User;
import com.yang.dao.UserDao;
import com.yang.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hefeng6500
 * @since 2023-05-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
