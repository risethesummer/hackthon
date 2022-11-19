import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * PACKAGE_NAME
 * Created by NhatLinh - 19127652
 * Date 11/19/2022 - 2:44 PM
 * Description: ...
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    private String email;

    private LocalDateTime createdAt;
}
