package com.workintech.employeeApp.Models;

import com.workintech.employeeApp.Enums.Plan;

public class Healthplan {
    private int id;
    private Plan plan;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Plan getPlan() {
        return plan;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }
    public String toString() {
        return "com.workintech.employeeApp.Models.Healthplan{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", com.workintech.employeeApp.Enums.Plan Name=" + plan.getName() +
                ", com.workintech.employeeApp.Enums.Plan Price=" + plan.getPrice()+
                '}';
    }
}
