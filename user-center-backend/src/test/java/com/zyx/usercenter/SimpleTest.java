package com.zyx.usercenter;

import com.zyx.usercenter.mapper.UserMapper;
import com.zyx.usercenter.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @ClassName com.zyx.usercenter.SimpleTest
 * @Author yxzheng
 * @Date 2022/4/24 16:42
 */
@SpringBootTest
// 使用org.junit.jupiter.api.Test就可以不用添加RunWith;org.junit.Test则必须添加
//@RunWith(SpringRunner.class)
public class SimpleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }


}
