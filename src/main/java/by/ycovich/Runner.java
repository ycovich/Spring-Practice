package by.ycovich;

import by.ycovich.repository.UserRepository;
import by.ycovich.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var userRepository = context.getBean("repo1", UserRepository.class);
        var userRepo2 = context.getBean("repo2");
        System.out.println(userRepository);
        System.out.println(userRepo2);

        var userService = context.getBean(UserService.class);
        System.out.println(userService);

        context.close();
    }
}
