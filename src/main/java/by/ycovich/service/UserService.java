package by.ycovich.service;

import by.ycovich.mapper.UserMapper;
import by.ycovich.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@ToString
@Service
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
}
