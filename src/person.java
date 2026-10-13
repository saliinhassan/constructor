void main(){
    student student1=new student();
    student1.setName("saluu");
    System.out.println(student1.getName());

    student1.setId(1);
    System.out.println((student1.getId()));
    student1.setGpa(5.0);
    System.out.println((student1.getgpa()));
    lecture lecture1=new lecture();
    lecture1.setSalary(300);
    System.out.println((lecture1.getSalary()));
    lecture1.setName("ahmed");
    System.out.println((lecture1.getName()));
}



public class person {
    private String name;
    private int id;

    public  void  setName(String name){
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }



public int getId(){
        return id;
}

}
public  class student extends person{
    private double gpa;

    public void setGpa(double gpa){
        this.gpa=gpa;
    }

    public  double getgpa(){
        return gpa;
    }
}
public class lecture extends person{

    private int salary;

    public void setSalary(int salary){
        this.salary=salary;
    }


    public int getSalary(){
       return salary;
    }
}
