package org.rudradcruze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
//@ComponentScan(basePackages = "com.rudradcruze")
//@EnableAutoConfiguration
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
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
