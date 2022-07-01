package io.btsoft.bbs.controller;

import io.btsoft.bbs.mapper.DepartmentMapper;
import io.btsoft.bbs.model.DepartmentModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("department")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentMapper departmentMapper;

    @GetMapping("list")
    public String departmentList(Model model) {
        model.addAttribute("department", new DepartmentModel());
        model.addAttribute("departments", departmentMapper.findAll());
        return "page/department/list";
    }

    @PostMapping("create")
    public String createDepartment(DepartmentModel model) {
        departmentMapper.insert(model.convertToDTO());
        return "redirect:list";
    }

    @PostMapping("update")
    public String updateDepartment(DepartmentModel model) {
        departmentMapper.update(model.convertToDTO());
        return "redirect:list";
    }

    @PostMapping("delete")
    public String deleteDepartment(DepartmentModel model) {
        departmentMapper.delete(model.getId());
        return "redirect:list";
    }
}
