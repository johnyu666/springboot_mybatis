package com.example.johnproject.mapper;

import com.example.johnproject.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface EmpMapper {
    Emp loadEmp(int id);
    List<Emp> findAllEmps();
    int addEmp(Emp emp);
    int updateEmp(Emp emp);
    int deleteEmp(int id);
}
