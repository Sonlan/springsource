package song.controller;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Song on 2016/9/29.
 */
@Controller
@RequestMapping(value = "/test")
public class test implements EnvironmentAware{
    private Environment environment = null;
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("msg","test");
        return "index.jsp";
    }
}
