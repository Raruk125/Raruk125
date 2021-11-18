package com.example.demo.interceptor;
import javax.servlet.http.HttpSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleInterceptor {
	@Autowired
	private HttpSession session;
	
	//↓どのタイミングでAOPを発動するか書いてある。　　　　　　　　　　　　　↓すべてのクラス.*すべてのメソット.*      @annotationで@RequestMappingのみ対象としている。
	@Before("execution(* com.example.demo.controller.*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	private void outputMessage(JoinPoint joinPoint) {
		String userName = (String) session.getAttribute("userName");
		System.out.println("AOPで出力してるよ。ユーザ名は：" + userName);
	}
}