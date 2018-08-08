# Core Spring 5.0 Study Notes

This is the answer I prepared for the question list of the Pivotal's [Certification Study Guide](https://d1fto35gcfffzn.cloudfront.net/academy/Core-Spring-5.0-Certification-Study-Guide.pdf); inspired by Vojtech Ruzicka's [Exam Notes – Pivotal Certified Spring Professional](https://www.vojtechruzicka.com/exam-notes-pivotal-certified-spring-professional/). 

## Container, Dependency, and IOC

### What is dependency injection and what are the advantages?

- *Dependency inversion*: a principle in SOLID about decoupling the high-level and low-level modules from each other. 
- *Inversion of Control* is a design pattern follow Dependency Inversion. There are many implementation such as Event, Delegator, Dependency Injection... In Spring, IoC is also known as Dependency Injection.

- **Dependency injection (DI)**: a technique whereby one object (or static method) supplies the dependencies of another object. A dependency is an object that can be used (a service). An injection is the passing of a dependency to a dependent object (a client) that would use it. The service is made part of the client's state. Passing the service to the client, rather than allowing a client to build or find the service, is the fundamental requirement of the pattern.

> Example: a Car class is dependent on the Engine class. In order to create a Car object, we need to create the Engine of the car.

//TODO + Code

Further reading: [a series about SOLID](https://stackify.com/dependency-inversion-principle/), [Good series about DI (Vietnamese)](https://toidicodedao.com/2015/11/03/dependency-injection-va-inversion-of-control-phan-1-dinh-nghia/), [my friend's blog](https://fromnoobstogeeks.com/2018/05/21/dependency-injection/)

### What is a pattern? What is an anti-pattern. Is dependency injection a pattern?

- Pattern: a general solution to a commonly occuring problem within a given context. Example: Singleton - each clas has only 1 instance; Iterator - a way to access each element of an aggregate object without exposing its underlying representation (foreach in Java, PHP,...).
- Anti-pattern: a common responses to recurring problem that is ineffective and risks. Example: Hard Code configuration information instead of provide them in a config file.
- Dependency Injection is a design pattern. Be noticed that it was not mentioned in the [Gang of Four book.](https://softwareengineering.stackexchange.com/questions/135914/why-was-dependency-injection-pattern-not-included-in-the-gang-of-four/135982)

### What is an interface and what are the advantages of making use of them in Java?
In its most common form, an interface is a group of related methods with empty bodies. [source](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)

In my opinion, there're some advantages:
- A contract for a sets of class to implement a sets of method.
- To implement Abstraction.
- Easier to implement Dependency Injection.
- ...

### Why are they recommended for Spring beans
//TODO

### What is meant by “application-context?

The interface org.springframework.context.ApplicationContext represents the **Spring IoC container** and is responsible for instantiating, configuring, and assembling the aforementioned beans. 

The following diagram is a high-level view of how Spring works. Your application classes are combined with configuration metadata so that after the ApplicationContext is created and initialized, you have a fully configured and executable system or application. [(Source)](https://docs.spring.io/spring/docs/5.0.8.RELEASE/spring-framework-reference/core.html#beans-basics)

![The Spring IoC container](https://i.imgur.com/LgJEtb4.png)


### What is the concept of a “container” and what is its lifecycle?
- **A Spring IoC container** manages one or more beans. 
- Container runs through 3 phases: Initialization (Create Spring Beans, Inject dependencies), Usage, Destruction (release Beans for Garbage Collection)

*Note: Spring Container lifecycle is different with Spring Bean lifecycle*

### How are you going to create a new instance of an *ApplicationContext*?

// TODO + Code

3 steps:
- Configure for class.
- Configuration Instructions with @Configuration annotation
```java
@Configuration
public class ApplicationConfig {
	@Bean
    public DataSource dataSource{
    	DataSource dataSource = new DataSource();
        dataSource.setUsername();          
        dataSource.setPassword();
        ...
        return dataSource;
    }
}
```
- Creating and Using the Application

```java
ApplicationContext context = SpringApplication.run( ApplicationConfig.class);
```

### Can you describe the lifecycle of a Spring Bean in an ApplicationContext?