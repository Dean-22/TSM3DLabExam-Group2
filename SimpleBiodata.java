package com.biodata;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class SimpleBiodata {
    @WebMethod
    
    public String Name(String name){
        return name;
    }
    @WebMethod
    public String Address(String add){
        return add;
    }
    @WebMethod
    public String DateOfBirth(String dobirth){
        return dobirth;
    }
    @WebMethod
    public String BirthPlace(String bplace){
        return bplace;
    }
    @WebMethod
    public String Age(String age){
        return age;
    }
    @WebMethod
    public String ContactNo(String num){
        return num;
    }
}
