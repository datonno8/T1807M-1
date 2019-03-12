package Assignment2;

import java.util.Scanner;

public class Student {
    public int ID;
    public double gpa;
    public int age;
    public String className;

    /**
     * Constructor
     */
    public Student(){

    }

    /**
     * Constructor full parameters
     * @param ID
     * @param gpa
     * @param age
     * @param className
     */
    public Student(int ID, double gpa, int age,String className){
        this.ID = ID;
        this.gpa = gpa;
        this.age = age;
        this.className = className;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    public double getGpa() {
        return gpa;
    }

    /**
     *
     * @param gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public String getClassName() {
        return className;
    }

    /**
     *
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Input student info
     */
    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap MSSV:");
        this.setID(scanner.hasNextInt()?scanner.nextInt():1);

        System.out.println("Nhap tuoi:");
        this.setAge(scanner.hasNextInt()?scanner.nextInt():18);

        System.out.println("nhap GPA:");
        this.setGpa(scanner.hasNextDouble()?scanner.nextDouble():0);
        scanner.nextLine();

        System.out.println("Nhap ten lop:");
        this.setClassName(scanner.hasNextLine()?scanner.nextLine():"");

    }

    /**
     * show student info
     */
    public void showInfo(){
        System.out.println(this.getID()+" -- "+this.getAge()+
                " -- "+this.getGpa()+" -- "+this.getClassName());
    }

    public void checkReward(){
        if(this.getGpa() > 8){
            System.out.println("Sinh vien dat hoc bong");
            return;
        }
        System.out.println("Sinh vien khong dat hoc bong");
    }

}
