package com.company.accounts;

import com.company.accounts.application.AccountService;
import com.company.accounts.domain.Account;
import com.company.accounts.infrastructure.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAccountById() {
        Long id = 1L;
        Account account = new Account();
        account.setId(id);
        account.setAccountNumber("123456789");
        account.setBalance(1000.0);

        when(accountRepository.findById(id)).thenReturn(Optional.of(account));

        Account result = accountService.getAccountById(id);

        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals("123456789", result.getAccountNumber());
        assertEquals(1000.0, result.getBalance());
    }
}