package com.adiberrifai.springbootplayground;

import com.adiberrifai.springbootplayground.examplebeans.FakeDataSource;
import com.adiberrifai.springbootplayground.examplebeans.FakeJmsSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPlaygroundApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringBootPlaygroundApplication.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource);

        FakeJmsSource fakeJmsSource = (FakeJmsSource) ctx.getBean(FakeJmsSource.class);

        System.out.println(fakeJmsSource);

    }

}

