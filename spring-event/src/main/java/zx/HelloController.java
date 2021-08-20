package zx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

	// http://localhost:8081/h
    @RequestMapping("/h")
    public String hello() {
        return "index123";
    }

	@RequestMapping("/hh")
	public Object getUser() {
		User user = new User();
		user.setId("123");
		return user;
	}
}
