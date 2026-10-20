package com.studentportal;
import jakarta.persistence.*;
@Entity
public class Student {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private String name;
  private String rollNumber;
  private double subject1, subject2, subject3;
  public Student() {}
  public Long getId(){return id;}
  public String getName(){return name;} public void setName(String v){name=v;}
  public String getRollNumber(){return rollNumber;} public void setRollNumber(String v){rollNumber=v;}
  public double getSubject1(){return subject1;} public void setSubject1(double v){subject1=v;}
  public double getSubject2(){return subject2;} public void setSubject2(double v){subject2=v;}
  public double getSubject3(){return subject3;} public void setSubject3(double v){subject3=v;}
  public double getTotal(){return subject1+subject2+subject3;}
  public double getAverage(){return getTotal()/3.0;}
  public String getGrade(){
    if(subject1<35 || subject2<35 || subject3<35) return "F";
    double a=getAverage();
    if(a>=90)return "A+"; if(a>=75)return "A"; if(a>=60)return "B";
    if(a>=45)return "C"; return "D";
  }
}
