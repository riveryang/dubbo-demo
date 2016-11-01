package org.dubbo.demo.component;

import org.dubbo.demo.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
@RequestMapping("/hello")
public class HelloWorldComponentImpl {

	@Reference(version = "0.0.1", group = "default", check = false, timeout = 3000)
	private HelloWorldService helloWorldService;
	
	@RequestMapping("/say/{who}")
	@ResponseBody
	public String say(final @PathVariable("who") String who) {
		return helloWorldService.say(who);
	}
	
}
