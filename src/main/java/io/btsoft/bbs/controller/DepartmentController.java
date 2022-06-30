package io.btsoft.bbs.controller;

import io.btsoft.bbs.mapper.DepartmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("department")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentMapper departmentMapper;
}
