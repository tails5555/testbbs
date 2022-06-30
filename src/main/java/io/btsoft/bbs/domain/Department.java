package io.btsoft.bbs.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Department {
    private Long id;
    private String name;
    private String telno;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
