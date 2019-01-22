package com.adiberrifai.springbootplayground.config;

import com.adiberrifai.springbootplayground.examplebeans.FakeDataSource;
import com.adiberrifai.springbootplayground.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfiguration {

    @Value("${com.username}")
    String username;

    @Value("${com.password}")
    String password;

    @Value("${com.dburl}")
    String url;

    @Value("${com.jms.username}")
    String jmsUsername;

    @Value("${com.jms.password}")
    String jmsPassword;

    @Value("${com.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(jmsUrl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsSource fakeJmsSource() {
        FakeJmsSource fakeJmsSource = new FakeJmsSource();
        fakeJmsSource.setUsername(jmsUsername);
        fakeJmsSource.setPassword(jmsPassword);
        fakeJmsSource.setDbUrl(url);
        return fakeJmsSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
