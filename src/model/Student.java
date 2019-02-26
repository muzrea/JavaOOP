package model;

/**
 * Created by 苏晓风 on 2019/2/26.
 */
public class Student {
    public String name;
    public String studentNumber;
    public String sex;
    public int age;
    public Student(String name,String studentNumber,String sex,int age){
        this.name = name;
        this.studentNumber = studentNumber;
        this.sex = sex;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getStudentNumber(){
        return studentNumber;
    }
    public void setstudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
