package com.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 *
 */
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class TurbineServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TurbineServerApplication.class,args);
    }
}
