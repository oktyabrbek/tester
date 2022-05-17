package com.company;

public class Student {

    private String name;
    private String soname;
    private String email;
    private int eight;

    String setName(b){
name=b;
    }
    String setSoname(){
        return soname;
    }
    String setemail(){
        return email;
    }
    int seteight(int a){
        if(a<0){
            System.out.println("Ters san bolboshu kerek");
        }else{
                eight=a;
    }

}
