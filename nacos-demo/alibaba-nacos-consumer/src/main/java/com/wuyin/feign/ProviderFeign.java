package com.wuyin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author  动力节点
 */
@FeignClient(value = "alibaba-nacos-provider")
public interface ProviderFeign {

    /**
     * 远程调用打招呼的接口
     *
     * @param name
     * @return
     */
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);

}