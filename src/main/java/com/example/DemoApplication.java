package com.example;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

//@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
        // SpringApplication.run(DemoConfiguration.class, args);
        SpringApplication bootstrap = new SpringApplication(DemoApplication.class);

        bootstrap.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> aClass, PrintStream printStream) {
                // 比如打印一个我们喜欢的ASCII Arts字符画
            	System.out.println("      --");
            	System.out.println("   --    --");
            	System.out.println("      --");
            }
        });
        bootstrap.setBannerMode(Banner.Mode.CONSOLE);
        // 其他定制设置...
        bootstrap.run(args);
    }
}
