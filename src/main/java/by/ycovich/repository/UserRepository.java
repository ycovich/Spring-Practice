package by.ycovich.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class UserRepository {
    private String username;
    private int age;
    private List<Object> cars;
    private Map<String, Object> info;

    @PostConstruct
    public void init(){
        System.out.println("init userRepository");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy userRepository");
    }

}
