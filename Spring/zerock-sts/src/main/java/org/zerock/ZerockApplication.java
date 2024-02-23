package org.zerock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZerockApplication {

	public static void main(String[] args) {
		System.out.println("메인실행");
		SpringApplication.run(ZerockApplication.class, args);
		System.out.println("메인실행 끝");
	}
}
