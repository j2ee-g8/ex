package edu.zut.cs.software;

import org.springframework.context.ApplicationContext;

public class DemoMangerImpl implements DemoManger{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sayHello() {
        return this.name+"说：美好的事情正在发生";
    }
}
