package com.wuyin.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author 武汉动力节点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component  // 添加到IOC中，一会在controller注入
@RefreshScope  // 刷新的域，当配置文件修改后可以动态刷新
public class Hero {

    @Value("${hero.name}")
    private String name;
    @Value("${hero.age}")
    private Integer age;
    @Value("${hero.sex}")
    private String sex;

}
