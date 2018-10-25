package com.zay.inout.service.impl;

import com.zay.inout.dao.TestDao;
import com.zay.inout.pojo.users;
import com.zay.inout.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao dao;

    @Override
    public List<users> getUsers() {
        return dao.getUsers();
    }
}
