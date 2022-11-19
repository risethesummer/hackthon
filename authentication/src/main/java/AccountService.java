import org.springframework.stereotype.Service;

/**
 * PACKAGE_NAME
 * Created by NhatLinh - 19127652
 * Date 11/19/2022 - 2:41 PM
 * Description: ...
 */
@Service
public interface AccountService{
    boolean SignUp(SignUpDto signUpDto);
}

