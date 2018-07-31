# springcloud-demo
	
	使用Spring Cloud(Finchley.RELEASE)的一系列技术，实现一个简单的demo。

### eureka-server
	
	使用Spring Cloud Eureka。实现服务的注册、发现。

### hello-service

	使用Spring MVC。提供Restful API。
	
	API：http://localhost:8001/hello/say
	
### ribbon-service

	使用Spring Cloud Ribbon。实现服务的调用。
	使用Spring Cloud Hystrix。实现服务的熔断功能，服务降级。
	
	API：http://localhost:8002/ribbon-hello/say
	
### feign-service

	使用Spring Cloud Feign。实现服务的声明式调用，开启Hystrix，实现服务降级。
	
	API：http://localhost:8003/feign-hello/say
	
### zuul-service

	使用Spring Cloud Zuul。实现路由转发和过滤器功能。
	默认的路由转发规则：/serviceName/**
	
	API：http://localhost:7000