package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.AuthService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.User;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task2_AuthService.forTest.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AuthServiceTest {
    private AuthService authService;
    private UserRepository userRepository;

    @BeforeEach
    void setup() {
        userRepository = mock(UserRepository.class);
        authService = new AuthService(userRepository);
    }

    @Test
    void authUser_Success() {
        User user = new User("Anya", "abcdef11");
        when(userRepository.findUserByUsername("Anya")).thenReturn(user);

       boolean result = authService.authenticateUser("Anya", "abcdef11");
       Assertions.assertTrue(result);

        verify(userRepository,times(1)).findUserByUsername("Anya");
        verifyNoMoreInteractions(userRepository);
    }

    @Test
    void authUser_ErrorInPassword() {
        User user = new User("Anya", "abcdef11");
        when(userRepository.findUserByUsername("Anya")).thenReturn(user);

        boolean result = authService.authenticateUser("Anya", "error");
        Assertions.assertFalse(result);

        verify(userRepository,times(1)).findUserByUsername("Anya");
        verifyNoMoreInteractions(userRepository);
    }

    @Test
    void authUSer_USerNotFound() {
        when(userRepository.findUserByUsername("NonExistent")).thenReturn(null);

        boolean result = authService.authenticateUser("NonExistent", "anyPassword");
        Assertions.assertFalse(result);

        verify(userRepository, times(1)).findUserByUsername("NonExistent");
        verifyNoMoreInteractions(userRepository);
    }

}
