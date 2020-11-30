package com.bdqn.controller;

import com.bdqn.domain.Branch;
import com.bdqn.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Branch> list = branchService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/detail")
    public String detail(Integer id, Model model){
        System.out.println("表现层：查询指定账户...");
        // 调用service的方法
        Branch branch= branchService.findById(id);
        model.addAttribute("branch",branch);
        return "detail";
    }
}
