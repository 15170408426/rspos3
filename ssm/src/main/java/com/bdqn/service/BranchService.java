package com.bdqn.service;

import com.bdqn.domain.Branch;

import java.util.List;

public interface BranchService {
    List<Branch> findAll();
    Branch findById(Integer id);
}
