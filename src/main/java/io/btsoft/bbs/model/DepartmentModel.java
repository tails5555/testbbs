package io.btsoft.bbs.model;

import io.btsoft.bbs.domain.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentModel {
    private Long id;
    private String name;
    private String telno;

    public Department convertToDTO() {
        return Department.builder()
                .id(id)
                .name(name)
                .telno(telno)
                .build();
    }
}
