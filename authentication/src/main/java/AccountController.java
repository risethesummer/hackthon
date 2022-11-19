import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PACKAGE_NAME
 * Created by NhatLinh - 19127652
 * Date 11/19/2022 - 2:38 PM
 * Description: ...
 */
@RestController
@RequestMapping("api/v1/account")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @PostMapping("signup")
    public void SignUp(SignUpDto signUpDto)
    {

    }
}
