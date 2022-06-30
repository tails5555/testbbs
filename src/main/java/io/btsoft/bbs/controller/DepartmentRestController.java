package io.btsoft.bbs.controller;


import io.btsoft.bbs.domain.Department;
import io.btsoft.bbs.mapper.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("departments")
@RequiredArgsConstructor
public class DepartmentRestController {
    private final DepartmentMapper departmentMapper;

    @GetMapping
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }

    @GetMapping("{id}")
    public Department findOne(@PathVariable("id") long id) {
        return departmentMapper.findOne(id);
    }

    @PostMapping
    public Map<String, Object> insert(@RequestBody Department department) {
        return new HashMap<>() {{
            put("result", departmentMapper.insert(department));
        }};
    }

    @PutMapping
    public Map<String, Object> update(@RequestBody Department department) {
        return new HashMap<>() {{
            put("result", departmentMapper.update(department));
        }};
    }

    @DeleteMapping("{id}")
    public Map<String, Object> delete(@PathVariable long id) {
        return new HashMap<>() {{
            put("result", departmentMapper.delete(id));
        }};
    }
}
