package dolphin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jiangxiaoqiang on 2016/12/1.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/index", method = RequestMethod.GET) // @RequestMapping 注解可以用指定的URL路径访问本控制层
    public String index() {
        return "index";
    }
}
