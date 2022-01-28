package com.example.johnproject.service;

import com.example.johnproject.mapper.EmpMapper;
import com.example.johnproject.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements  EmpService{
    @Autowired
    private EmpMapper empMapper;
    @Override
    public Emp loadEmp(int id) {
        return empMapper.loadEmp(id);
    }

    @Override
    public List<Emp> findAllEmp() {
        return empMapper.findAllEmps();
    }

    @Override
    public Emp addEmp(Emp emp) {
        empMapper.addEmp(emp);
        return emp;
    }

    @Override
    public Emp updateEmp(Emp emp, int id) {
        emp.setId(id);
        empMapper.updateEmp(emp);
        return emp;
    }
    @Override
    public void deleteEmp(int id) {
        empMapper.deleteEmp(id);
    }
}
