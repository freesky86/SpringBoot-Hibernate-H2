package com.example.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener implements ApplicationListener<EmailEvent> {

    @Override
    public void onApplicationEvent(EmailEvent emailEvent) {
        System.out.println("邮件地址：" + emailEvent.getEmail());
        System.out.println("邮件内容：" + emailEvent.getContent());
    }

}
