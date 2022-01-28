package com.example.johnproject.service;

import com.example.johnproject.pojo.Emp;

import java.util.List;

public interface EmpService {
    Emp loadEmp(int id);
    List<Emp> findAllEmp();
    Emp addEmp(Emp emp);
    Emp updateEmp(Emp emp,int id);
    void deleteEmp(int id);
}
