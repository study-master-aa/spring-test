package com.example.demo.services;

import com.example.demo.models.UserDto;
import com.example.demo.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    @DisplayName("유저 목록 가져오기 테스트")
    public void getUsersHappyFlow() {
        List<UserDto> expected = new ArrayList<>();
        expected.add(new UserDto("user1", 30L));

        given(userRepository.findAll())
                .willReturn(expected);

        List<UserDto> result = userService.getUsers();

        verify(userRepository).findAll();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
