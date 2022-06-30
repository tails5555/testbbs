package io.btsoft.bbs.mapper;

import io.btsoft.bbs.domain.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> findAll();
    Department findOne(Long id);
    int insert(Department department);
    int update(Department department);
    int delete(Long id);
}
