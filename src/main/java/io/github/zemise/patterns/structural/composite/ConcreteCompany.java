package io.github.zemise.patterns.structural.composite;

import java.util.ArrayList;

public class ConcreteCompany implements Company{
    private ArrayList<Company> companyList = new ArrayList<>();

    private String name;

    private String position;

    private int salary;

    public ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void add(Company company){
        companyList.add(company);
    }

    void remove(Company company) {
        companyList.remove(company);
    }

    ArrayList<Company> getChild(){
        return companyList;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;

        return info;
    }
}
