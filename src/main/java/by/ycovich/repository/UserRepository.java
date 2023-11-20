package by.ycovich.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Slf4j

@Repository
public class UserRepository {
    private String username;
    private int age;
    private List<Object> cars;
    private Map<String, Object> info;

    @PostConstruct
    public void init(){
        log.info("init userRepository");
    }

    @PreDestroy
    public void destroy(){
        log.info("destroy userRepository");
    }

}
