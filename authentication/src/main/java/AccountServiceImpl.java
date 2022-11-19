import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

/**
 * PACKAGE_NAME
 * Created by NhatLinh - 19127652
 * Date 11/19/2022 - 2:47 PM
 * Description: ...
 */


@AllArgsConstructor
public class AccountServiceImpl implements  AccountService
{
    private final AccountRepository accountRepository;
    @Override
    public boolean SignUp(SignUpDto signUpDto) {
        Account account = Account
                .builder()
                .email(signUpDto.email())
                .createdAt(LocalDateTime.now())
                .build();
        accountRepository.saveAndFlush(account);
        return false;
    }
}