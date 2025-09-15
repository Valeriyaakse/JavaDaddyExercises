package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.Account;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


public class AccountServiceTest {
    private AccountService accountService;
    private AccountRepository accountRepository;

    @BeforeEach
    void setup() {
        accountRepository = mock(AccountRepository.class);
        accountService = new AccountService(accountRepository);
    }

    @Test
    void withdraw_Success() {
        Account account = new Account("Anna Mesh", 20000.0);
        when(accountRepository.findAccountById("Anna Mesh")).thenReturn(account);

        boolean result = accountService.withdraw("Anna Mesh", 20000.0);
        Assertions.assertTrue(result);

        verify(accountRepository,times(1)).findAccountById("Anna Mesh");
        verify(accountRepository,times(1)).updateAccount(account);
        verifyNoMoreInteractions(accountRepository);

    }

    @Test
    void withdraw_NotAmount() {
        Account account = new Account("Anna Mesh", 0.0);
        when(accountRepository.findAccountById("Anna Mesh")).thenReturn(account);

        boolean result = accountService.withdraw("Anna Mesh", 20000.0);
        Assertions.assertFalse(result);

        verify(accountRepository,times(1)).findAccountById("Anna Mesh");
        verify(accountRepository,never()).updateAccount(any());
        verifyNoMoreInteractions(accountRepository);
    }

    @Test
    void withdraw_AccountNotFound() {
        when(accountRepository.findAccountById("NotExistent")).thenReturn(null);

        boolean result = accountService.withdraw("NotExistent", 20000.0);
        Assertions.assertFalse(result);

        verify(accountRepository,times(1)).findAccountById("NotExistent");
        verify(accountRepository,never()).updateAccount(any());
        verifyNoMoreInteractions(accountRepository);

    }
}
