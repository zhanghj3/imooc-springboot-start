package com.imooc.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 将资源文件中的属性配置映射到实体类
 * 1.写properties文件
 * 2.引入springboot-configuration 的包
 * 3.在其他Controller中用@Autowired 注入
 * 打包之后resource目录就是对应的classpath
 */
@Configuration
@PropertySource(value="classpath:resource.properties")
@ConfigurationProperties(prefix = "com.imooc.opensource")
public class Resource {
    private String name;
    private String website;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
