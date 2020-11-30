package com.bdqn.service.impl;

import com.bdqn.dao.BranchDao;
import com.bdqn.domain.Branch;
import com.bdqn.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchDao branchDao;

    @Override
    public List<Branch> findAll() {
        return branchDao.findAll();
    }

    @Override
    public Branch findById(Integer id) {
        return branchDao.findById(id);
    }


}
