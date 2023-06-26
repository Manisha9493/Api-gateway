package com.mycompany.fastpassui;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerWebClientBuilderBeanPostProcessor;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
@Configuration
public class LoadBalancerAlgorithmConfig {
    @Bean
    ReactorLoadBalancer<ServiceInstance> randomLB(Environment env, LoadBalancerClientFactory factory)
    {
        String name=env.getProperty(factory.PROPERTY_NAME);
        return new RandomLoadBalancer(factory.getLazyProvider(name,ServiceInstanceListSupplier.class), name);

    }
    
    
}
