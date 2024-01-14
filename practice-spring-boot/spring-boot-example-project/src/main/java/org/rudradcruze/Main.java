package org.rudradcruze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ComponentScan(basePackages = "com.rudradcruze")
//@EnableAutoConfiguration
public class Main {
    public static void main(String[] args) {
        /*
            CustomerService customerService = new CustomerService(new CustomerDataAccessService());
            CustomerController customerController = new CustomerController(customerService);
        */
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);
        printBeans(applicationContext);
    }

    @Bean("Foo")
    public Foo getFoo() {
        return new Foo("Rudra");
    }

    record Foo(String name) {}

    private static void printBeans(ConfigurableApplicationContext ctx) {
        String[] beanDefinitionNames =
                ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
        }
    }


//    @GetMapping("/greet")
//    public GreetResponse greet(@RequestParam(value = "name", required = false) String name) {
//        String greetMessage = name == null || name.isBlank()? "Hello" : "Hello " + name;
//        GreetResponse response = new GreetResponse(
//                greetMessage,
//                List.of("Java", "Golang", "Javascript"),
//                new Person("Rudra", 21, 30_000));
//        return response;
//    }
//
//    record Person (String name, int age, double savings) {

//    }

//    record GreetResponse(
//            String greet,
//            List<String> facProgrammingLanguages,
//            Person person) {}

//    class GreetResponse {
//        private final String greet;
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }
}
