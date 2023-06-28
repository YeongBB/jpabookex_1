package jpabook.jpabookex;

import jpabook.jpabookex.service.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class JpabookexApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpabookexApplication.class, args);
		MemberService memberService = context.getBean(MemberService.class);
		memberService.createMember();
	}

}
