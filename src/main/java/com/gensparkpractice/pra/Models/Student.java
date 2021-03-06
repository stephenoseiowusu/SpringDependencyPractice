package com.gensparkpractice.pra.Models;

import org.springframework.stereotype.Component;

import java.util.List;

public class Student {

    private int studentID;
    private String name;
    private List<String> contact_numbers;
    private  Address addr;
    public Student(int studentID, String name, Address addr){
        this.studentID = studentID;
        this.name = name;
        this.addr = addr;
    }
    public void setContact_numbers(List<String> numbers){
        this.contact_numbers = numbers;
    }
    public void call(){
         System.out.println("call method called");
    }
    public String toString(){
        String result = "{ contact_numbers: {";
        for(String s : contact_numbers ){
            result += contact_numbers + " ,";
        }
        result += " }";
        result += " studentID: " + studentID + ", ";
        result += " Address: " + addr.toString() + ", ";
        result += " name: " + name + " ";
        result += "}";
        return result;
    }
}
