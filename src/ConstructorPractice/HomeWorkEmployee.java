package ConstructorPractice;

public class HomeWorkEmployee {

    String name;
    int employmentYear;
    int age;
    int workHour;
    String location;

    public HomeWorkEmployee(){

    }

    public HomeWorkEmployee(String name, int employmentYear){
        this.name=name;
        this.employmentYear=employmentYear;
    }

    public HomeWorkEmployee(String name, int employmentYear, int age, int workHour, String location
    ){
        this.name=name;
        this.employmentYear=employmentYear;
        this.age=age;
        this.workHour=workHour;
        this.location=location;
    }

    public int calculateSalary(){
      return  workHour*55;

    }

    public double yearlySalary(){
        int workingDays=1;
        double yearlySalary=workHour*workingDays*55;
        return yearlySalary;
    }

    public int totalEmploymentYear (){
        return 2019-employmentYear;
    }

    public double bonusAmount (int employmentYear, int workingDays){
        double bonusAmount=1;
        employmentYear=totalEmploymentYear();
        if (employmentYear>5 && workingDays>240 ){
            return bonusAmount*(yearlySalary()*15/100);
        }else if (employmentYear<5 && workingDays<240){
        }
        return bonusAmount*(yearlySalary()*10/100);
    }

    public String getName (){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(){
        this.location=location;
    }
    public int getEmploymentYear(){
        return employmentYear;
    }
    public void setEmploymentYear(){
        this.employmentYear=employmentYear;
    }
    public int getWorkHour(){
        return workHour;
    }
    public void setWorkHour() {
       this.workHour=workHour;
    }








}
