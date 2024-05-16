package es.neesis.demospringbatch.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserEntity {
    private Integer id;
    private String username;
    private String password;
    private String email;
}
