package com.capcun.health_shastra.Login_API;

public class FetchCurrentOrdersResponseModel {


    public String emp_contact ,emp_name,emp_mail,emp_pass,emp_bld,emp_manager,emp_desig;
    public FetchCurrentOrdersResponseModel(String emp_contact , String emp_name, String emp_mail, String emp_pass, String emp_bld, String emp_manager, String emp_desig) {

        this.emp_contact = emp_contact;
        this.emp_name = emp_name;
        this.emp_mail = emp_mail;
        this.emp_pass = emp_pass;
        this.emp_bld = emp_bld;
        this.emp_manager = emp_manager;
        this.emp_desig = emp_desig;

    }

    public String getEmp_contact() {
        return emp_contact;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public String getEmp_bld() {
        return emp_bld;
    }

    public String getEmp_manager() {
        return emp_manager;
    }

    public String getEmp_desig() {
        return emp_desig;
    }

    public void setEmp_contact(String emp_contact) {
        this.emp_contact = emp_contact;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass;
    }

    public void setEmp_bld(String emp_bld) {
        this.emp_bld = emp_bld;
    }

    public void setEmp_manager(String emp_manager) {
        this.emp_manager = emp_manager;
    }

    public void setEmp_desig(String emp_desig) {
        this.emp_desig = emp_desig;
    }


//    String c1,c2;
//    int final_amount,id;
//
//    public FetchCurrentOrdersResponseModel(String c1,String c2) {
//        this.c1 = c1;
//        this.c2 = c2;
//
//    }
//
//    public String getC1() {
//        return c1;
//    }
//
//    public void setC1(String c1) {
//        this.c1 = c1;
//    }
//
//    public String getC2() {
//        return c2;
//    }
//
//    public void setC2(String c2) {
//        this.c2 = c2;
//    }


}
