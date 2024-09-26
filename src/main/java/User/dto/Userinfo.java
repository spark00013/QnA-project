package User.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class Userinfo {

    private Long id;

    private String email;

    private String username;
}
