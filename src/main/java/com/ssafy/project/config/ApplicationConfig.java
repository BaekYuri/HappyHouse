package com.ssafy.project.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ssafy.project.model.dao.HouseDao;


@Configuration
@ComponentScan(basePackages = {"com.ssafy.project.model"})
@MapperScan(basePackageClasses = HouseDao.class)
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class ApplicationConfig {

}
