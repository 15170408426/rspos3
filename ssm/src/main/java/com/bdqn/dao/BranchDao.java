package com.bdqn.dao;

import com.bdqn.domain.Branch;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BranchDao {
    List<Branch> findAll();
    Branch findById(Integer id);

}
