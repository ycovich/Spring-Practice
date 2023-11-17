package by.ycovich.service;

import by.ycovich.mapper.UserMapper;
import by.ycovich.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
}
