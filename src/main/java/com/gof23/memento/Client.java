package com.gof23.memento;

public class Client {
    public static void main(String[] args) {
        Emp emp = new Emp("王瑞", 25, 12000.0d);
        System.out.println("修改前打印信息："+"姓名："+emp.getEname()+"    年龄："+emp.getAge()+"；     工资："+emp.getSalary());
        //进行备忘
        CareTaker careTaker = new CareTaker();
        careTaker.setEmpMemento(emp.memento());//备忘
        emp.setAge(26);
        emp.setSalary(20000.0d);
        System.out.println("修改后信息："+"姓名："+emp.getEname()+"       年龄："+emp.getAge()+"；      工资"+emp.getSalary());
        //恢复信息
        emp.recovery(careTaker.getEmpMemento());//恢复到备忘时的状态
        System.out.println("恢复后打印信息："+"姓名："+emp.getEname()+"；       年龄"+emp.getAge()+";     工资"+emp.getSalary());
    }
}
