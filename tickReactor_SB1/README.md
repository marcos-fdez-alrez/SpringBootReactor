## Spring Boot 1.5.9 Reactive Example using Reactor Bus and Mongo DB

* How to test?
    
    Execute in this order:
    1. Launch TickReactorApplication as Spring Boot App or Package it and launch it from command line. 
    2. Launch TickApplicationTests  

* What is inside?

    * TickReactorApplication contains `localhost:8080` reactive endpoints:
        * `/launchStock/{param}` - publish {param} number of Stocks as Event to the Event Bus which are processes by a Consumer which persist them into a Mongo DB.

* Used in this project:

    * [Spring Boot](https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/htmlsingle/)
    * [Spring 4](https://docs.spring.io/spring/docs/4.3.13.RELEASE/spring-framework-reference/htmlsingle/)
    * [Project Reactor 2](https://projectreactor.io/)
    * [Mongo DB](https://www.mongodb.com/)

* To do:

    * Rewrite using new Spring Boot in whose reactor-core there is no reactor.fn.Consumer
    * Implement Reactive Repository against MongoDB
    
* Issues:

	 * If you get an "java.io.IOException: Could not start process: <EOF>" during startup, This problem happens only if your environment is configured to run on 32bit java. Try running with 64bit java and the issue should disappear.Short explanation is that during mongod initialization, based on the java platform, the embedded-mongo will decide which mongod build to use. For the 32bit monogod build, the default "wiredTiger" storage engine is not available and the process could not start. [Starting Issue](https://github.com/flapdoodle-oss/de.flapdoodle.embed.mongo/issues/167) 
