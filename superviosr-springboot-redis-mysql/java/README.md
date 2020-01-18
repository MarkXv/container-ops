#  OPS_Java file

## redis and mariadb


For Example ...

<code>
	mvn clean package spring-boot:run
</code>
<code>
	[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for org.example:ops:jar:1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.springframework.boot:spring-boot-starter-test is missing. @ line 124, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] --------------------------< org.example:ops >---------------------------
[INFO] Building ops 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from alimaven: http://maven.aliyun.com/nexus/content/groups/public/org/springframework/boot/spring-boot-starter-test/maven-metadata.xml
Downloaded from alimaven: http://maven.aliyun.com/nexus/content/groups/public/org/springframework/boot/spring-boot-starter-test/maven-metadata.xml (4.1 kB at 1.5 kB/s)
[INFO] 
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ ops ---
[INFO] Deleting /Users/xujm/workspace/code/ops/target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.511 s
[INFO] Finished at: 2020-01-17T13:45:19+08:00
[INFO] ------------------------------------------------------------------------
➜  ops mvn clean package spring-boot:run
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for org.example:ops:jar:1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.springframework.boot:spring-boot-starter-test is missing. @ line 139, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] --------------------------< org.example:ops >---------------------------
[INFO] Building ops 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ ops ---
[INFO] Deleting /Users/xujm/workspace/code/ops/target
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ ops ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ ops ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to /Users/xujm/workspace/code/ops/target/classes
[INFO] /Users/xujm/workspace/code/ops/src/main/java/com/ops/example/service/ExampleService.java: 某些输入文件使用了未经检查或不安全的操作。
[INFO] /Users/xujm/workspace/code/ops/src/main/java/com/ops/example/service/ExampleService.java: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ ops ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/xujm/workspace/code/ops/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ ops ---
[INFO] Changes detected - recompiling the module!
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ ops ---
[INFO] 
[INFO] --- maven-jar-plugin:3.1.2:jar (default-jar) @ ops ---
[INFO] Building jar: /Users/xujm/workspace/code/ops/target/ops-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.2.2.RELEASE:repackage (repackage) @ ops ---
[INFO] Replacing main artifact with repackaged archive
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.2.2.RELEASE:run (default-cli) > test-compile @ ops >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ ops ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ ops ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to /Users/xujm/workspace/code/ops/target/classes
[INFO] /Users/xujm/workspace/code/ops/src/main/java/com/ops/example/service/ExampleService.java: 某些输入文件使用了未经检查或不安全的操作。
[INFO] /Users/xujm/workspace/code/ops/src/main/java/com/ops/example/service/ExampleService.java: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ ops ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/xujm/workspace/code/ops/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ ops ---
[INFO] Changes detected - recompiling the module!
[INFO] 
[INFO] <<< spring-boot-maven-plugin:2.2.2.RELEASE:run (default-cli) < test-compile @ ops <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.2.2.RELEASE:run (default-cli) @ ops ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.2.RELEASE)

2020-01-18 13:52:06.387  INFO 7578 --- [           main] com.ops.SpringBoot                       : Starting SpringBoot on xujianmingdeMacBook-Pro.local with PID 7578 (/Users/xujm/workspace/code/ops/target/classes started by xujm in /Users/xujm/workspace/code/ops)
2020-01-18 13:52:06.388  INFO 7578 --- [           main] com.ops.SpringBoot                       : No active profile set, falling back to default profiles: default
2020-01-18 13:52:06.874  INFO 7578 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2020-01-18 13:52:06.875  INFO 7578 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2020-01-18 13:52:06.888  INFO 7578 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 4ms. Found 0 Redis repository interfaces.
2020-01-18 13:52:06.955  WARN 7578 --- [           main] o.m.s.mapper.ClassPathMapperScanner      : No MyBatis mapper was found in '[com.ops]' package. Please check your configuration.
2020-01-18 13:52:07.063  INFO 7578 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-01-18 13:52:07.215  INFO 7578 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8090 (http)
2020-01-18 13:52:07.222  INFO 7578 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-01-18 13:52:07.222  INFO 7578 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.29]
2020-01-18 13:52:07.277  INFO 7578 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-01-18 13:52:07.277  INFO 7578 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 864 ms
2020-01-18 13:52:07.703  INFO 7578 --- [           main] pertySourcedRequestMappingHandlerMapping : Mapped URL path [/v2/api-docs] onto method [springfox.documentation.swagger2.web.Swagger2Controller#getDocumentation(String, HttpServletRequest)]
2020-01-18 13:52:07.808  INFO 7578 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-01-18 13:52:07.961  INFO 7578 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
2020-01-18 13:52:07.970  INFO 7578 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
2020-01-18 13:52:07.989  INFO 7578 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
2020-01-18 13:52:08.063  INFO 7578 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8090 (http) with context path ''
2020-01-18 13:52:08.065  INFO 7578 --- [           main] com.ops.SpringBoot                       : Started SpringBoot in 1.923 seconds (JVM running for 2.176)
</code>


<image src="./picture/截屏2020-01-1814.06.51.png">
<image src="./picture/截屏2020-01-1814.07.22.png">



