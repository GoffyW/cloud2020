package com.guofei.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 *
 * @author GoffyGUO
 */
public interface MyLoadBalance {
    /**
     * 获取集群实例
     * @param serviceInstances
     * @return
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
