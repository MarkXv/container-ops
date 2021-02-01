package com.ops;


import com.ops.config.MylogInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
@MapperScan("com.ops.**.mapper")
public class SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }

    @Autowired
    private List<SqlSessionFactory> sqlSessionFactories;

    @Bean
    public void intercepts(){
        for (SqlSessionFactory sqlSessionFactory : sqlSessionFactories){
            sqlSessionFactory.getConfiguration().addInterceptor(new MylogInterceptor());
        }
    }

}
