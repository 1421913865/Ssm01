package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findall")
    public String findAll(Model model){
        System.out.println("表现层显示所有用户controller");
        List<User> list=userService.findall();
        model.addAttribute("list",list);
        return "success";
    }
    @RequestMapping("/save")
    public String save(User user){
        System.out.println("保存");
        System.out.println(user);
        userService.save(user);
        return "success";
    }
}
