package com.example.listener;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

/**
 * https://www.cnblogs.com/lwcode6/p/12072202.html
 * 
 * @author maxzhang
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ListenerTest {

    @Autowired
    private WebApplicationContext webapplicationcontext;

    @Test
    public void testListener(){
        EmailEvent emailEvent = new EmailEvent("object", "123@qq.com", "###listener");
        webapplicationcontext.publishEvent(emailEvent);
    }

}