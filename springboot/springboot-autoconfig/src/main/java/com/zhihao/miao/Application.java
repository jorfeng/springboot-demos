package com.zhihao.miao;

import com.zhihao.miao.beans.EncodingConvert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(Application.class,args);
        //System.out.println(context.getBeansOfType(EncodingConvert.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }
}
