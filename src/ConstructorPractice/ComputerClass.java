package ConstructorPractice;

public class ComputerClass {

    //

   private String name;
   private String operatingSystem;
   private String brand;
   private String model;
   private int year;
   private int memory;
   private int inch;

   // Default --> only accessible inside same package
    //

   public ComputerClass(){

   }

   public ComputerClass(String name, String operatingSystem, String brand, String model){
       this.name=name;
       this.operatingSystem=operatingSystem;
       this.brand=brand;
       this.model=model;

   }
   public  ComputerClass(int year, int memory, int inch){
       this.year=year;
       this.memory=memory;
       this.inch=inch;
   }
   //to be able to call the constructor inside another constructor, we are using this keyword,
    // it should be in first line.
   public ComputerClass(String name, String operatingSystem, String brand, String model, int year, int memory, int inch){
       this(name, operatingSystem, brand, model);
       this.year=year;
       this.memory=memory;
       this.inch=inch;



   }

    public  String getName(){
        return name;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getMemory(){
       return  memory;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem=operatingSystem;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String model){
        this.brand=brand;
    }

    public void setMemory(int memory){
       this.memory=memory;
    }




}
