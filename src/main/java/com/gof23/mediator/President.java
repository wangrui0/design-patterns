package com.gof23.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者的实现者：总经理
 * @author jack
 *
 */
public class President implements Mediator {
    private Map<String, Department> map=new HashMap<String,Department>();
    @Override
    public void register(String dname, Department department) {
        map.put(dname, department);
    }

    @Override
    public void command(String dname) {
        Department department = map.get(dname);
        if(department!=null){
            department.selfAction();
        }
    }
    
}
