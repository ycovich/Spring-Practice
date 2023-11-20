package by.ycovich.mapper;

import by.ycovich.dto.UserDTO;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@ToString
@Component
public class UserMapper {
    @Autowired
    private UserDTO userDTO;
}
