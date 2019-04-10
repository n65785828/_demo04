package top.niyihua.demo04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.niyihua.demo04.dao.UserDao;
import top.niyihua.demo04.entity.User;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;
    @RequestMapping("/save")
    public String saveUser(){
        User user = new User();
        user.setNickname("Liming");
        user.setUsername("userLiming");
        user.setPassword("passwordLiming");
        User save = userDao.save(user);
        System.out.println(save);
        return "index";
    }
}
