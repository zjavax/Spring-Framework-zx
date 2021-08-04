package zx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/index2")
    public String hello() {
        return "index";
    }
}
