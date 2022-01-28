package com.example.johnproject.controller;

import com.example.johnproject.pojo.Emp;
import com.example.johnproject.service.EmpService;
import com.example.johnproject.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping(value = "/emps",method = RequestMethod.POST)
    public CommonResult<Emp> addEmp(@RequestBody  Emp emp){
        Emp e=empService.addEmp(emp);
        CommonResult<Emp> result=new CommonResult<>(201,"添加成功",e);
        return result;
    }

    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public CommonResult<List> findAllEmp(){
        List<Emp> emps=empService.findAllEmp();
        CommonResult<List> result=new CommonResult<>(200,"查询成功",emps);
        return result;
    }
    @RequestMapping(value = "/emps/{id}",method = RequestMethod.GET)
    public CommonResult<Emp> loadEmp(@PathVariable int id){
        Emp emp=empService.loadEmp(id);
        CommonResult<Emp> result=new CommonResult<>(200,"查询成功",emp);
        return result;
    }

    @RequestMapping(value = "/emps/{id}",method = RequestMethod.DELETE)
    public CommonResult<Emp> deleteEmp(@PathVariable int id){
        empService.deleteEmp(id);
        CommonResult<Emp> result=new CommonResult<>(204,"删除成功",null);
        return result;
    }
    @RequestMapping(value = "/emps/{eid}",method = RequestMethod.PUT)
    public CommonResult<Emp> updateEmp(@RequestBody Emp emp, @PathVariable int eid){
        System.out.println(eid+","+emp.getJob());
        Emp emp1=empService.updateEmp(emp,eid);
        CommonResult<Emp> result=new CommonResult<>(205,"更新成功",emp1);
        return  result;
    }

}
