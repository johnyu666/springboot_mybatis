package com.example.johnproject.mapper;

import com.example.johnproject.DemoApplication;
import com.example.johnproject.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class EmpMapperTest {
    @Autowired
    private EmpMapper empMapper;
    @Test
    public void testLoadEmp(){
        Emp emp=empMapper.loadEmp(7369);
        System.out.println(emp.getEname());
    }
    @Test
    public void testFindAllEmps(){
        List<Emp> emps=empMapper.findAllEmps();
        emps.forEach(emp-> System.out.println(emp.getId()+","+emp.getEname()));
    }

    @Test
    public void addEmp(){
        Emp emp=new Emp(null,"jackson","sale");
        int count=empMapper.addEmp(emp);
        System.out.println(count+","+emp.getId());
    }
    @Test
    public void updateEmp(){
        Emp emp=new Emp(7369,"jackson","sale");
        empMapper.updateEmp(emp);
    }
    @Test
    public void deleteEmp(){
        int count=empMapper.deleteEmp(7369);
        System.out.println(count);
    }
}
