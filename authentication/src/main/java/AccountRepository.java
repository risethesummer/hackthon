import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PACKAGE_NAME
 * Created by NhatLinh - 19127652
 * Date 11/19/2022 - 2:46 PM
 * Description: ...
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
}