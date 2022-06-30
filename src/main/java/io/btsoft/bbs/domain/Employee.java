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
public class Employee {
    private Long id;
    private String name;
    private Integer age;
    private Integer career;
    private String intro;

    // [Kang] 부서는 ManyToOne 관계로 설정한다.
    private Department department;

    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}
