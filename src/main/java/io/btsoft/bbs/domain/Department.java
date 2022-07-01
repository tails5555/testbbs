package io.btsoft.bbs.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Department {
    private Long id;
    private String name;
    private String telno;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
