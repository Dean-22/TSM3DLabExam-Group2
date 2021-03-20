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
    @WebMethod
    public String Gender(String gen){
        return gen;
    }
    @WebMethod
    public String CivilStatus(String cstatus){
        return cstatus;
    }
    @WebMethod
    public String Religion(String rel){
        return rel;
    }
    @WebMethod
    public String Citizenship(String citi){
        return citi;
    }
    @WebMethod
    public String FatherName(String fname){
        return fname;
    }
    @WebMethod
    public String MotherName(String mname){
        return mname;
    }
}
