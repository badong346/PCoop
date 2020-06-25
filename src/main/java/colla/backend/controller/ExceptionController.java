package colla.backend.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler
	public String exceptionHandler(Exception e) {
		e.printStackTrace();
		System.out.println("Exception Handler : ������ �߻��߽��ϴ�");
		return "error";
	}
	
	@ExceptionHandler
	public String exceptionHandler(NumberFormatException e) {
		e.printStackTrace();
		System.out.println("NFException Handler : ������ �߻��߽��ϴ�");
		return "error";
	}
	
	@ExceptionHandler
	public String exceptionHandler(NullPointerException e) {
		e.printStackTrace();
		System.out.println("NULLException Handler : ������ �߻��߽��ϴ�");
		return "error";
	}
	
}
