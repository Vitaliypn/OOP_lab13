package task1;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TwitterUser{
    private String UserMail;
    private String Country;
    private LocalDateTime LastActiveTime;
}
