package com.zyx.usercenter.service;

import com.zyx.usercenter.model.domain.User;
import com.zyx.usercenter.model.domain.request.UserRegisterRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @ClassName com.zyx.usercenter.service.UserServiceTest
 * @Author yxzheng
 * @Date 2022/4/25 19:50
 */
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("zyx");
        user.setUserAccount("123");
        user.setAvatarUrl("cccccc");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("123456");
        user.setEmail("13@qq.com");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.list(null);
//        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    void userRegister() {
        UserRegisterRequest userRegisterRequest = new UserRegisterRequest();
        String userAccount = "yupi";
        String userPassword = "";
        String checkPassword = "12345678";
        String planetCode = "12345678";
        userRegisterRequest.setUserAccount(userAccount);
        userRegisterRequest.setUserPassword(userPassword);
        userRegisterRequest.setCheckPassword(checkPassword);
        userRegisterRequest.setPlanetCode(planetCode);
        long result = userService.userRegister(userRegisterRequest);
        Assertions.assertEquals(-1, result);
    }
}
