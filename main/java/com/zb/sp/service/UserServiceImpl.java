package com.zb.sp.service;

import com.zb.sp.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;


    @Override
    public List<Map> list(Map map) {
        return userMapper.list(map);
    }


}
