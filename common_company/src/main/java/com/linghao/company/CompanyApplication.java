package com.linghao.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author zoulinghao
 * @create 2021-09-15-19:49
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
@SpringBootApplication(scanBasePackages = "com.linghao.company")
//打开jpa注解的扫描
@EntityScan(value =  "com.linghao.domain.company")
public class CompanyApplication {
    /**
     * 启动方法
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(CompanyApplication.class,args);
    }
}
