package com.example.demo;

import com.example.demo.entity.SysUsers;
import com.example.demo.repository.SysUsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RepositoryTest {

    @Autowired
    private SysUsersRepository sysUsersRepository;

    @Test
    public void save() {
        SysUsers users = new SysUsers();
        users.setAddr("USA");
        users.setAge(12);
        users.setName("lucy");

        //this.sysUsersRepository.save(users);
        System.out.println(sysUsersRepository.findByName("lucy").toString());
    }
}
