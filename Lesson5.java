package com.company.Package1;

public class Lesson5 {
    public static void main(String[] args) {

        Tester tester = new Tester("Kate", "Smith", 6.5, "B1", 900);
        System.out.println("Name is " + tester.getName());
        System.out.println("Surname is " + tester.getSurname());
        System.out.println("Experience is " + tester.getExperienceInYears() + " " + "years");
        System.out.println("English level is " + tester.getEnglishLevel());
        System.out.println("Salary is " + tester.getSalary() + " " + "dollars");
        // System.out.println(tester.getTwoSalary()); Не можем получить доступ к методу, т.к. уровень доступа метода - private.
        tester.getNameSurname();
        System.out.println("Experience in a months: " + tester.getExperienceInMonths());
        tester.getAllInformationAboutUser();

    }
}
public class Main {
    public static void main(String[] args) {

        Tester tester = new Tester("Kate", "Smith", 6.5, "B1", 900);
        //System.out.println("Name is " + tester.getName()); Геттеры и сеттеры - уровень доступа только внутри пакета
       // System.out.println("Surname is " + tester.getSurname());
       // System.out.println("Experience is " + tester.getExperienceInYears() + " " + "years");
       // System.out.println("English level is " + tester.getEnglishLevel());
       // System.out.println("Salary is " + tester.getSalary() + " " + "dollars");
        //System.out.println(tester.getTwoSalary()); Не можем получить доступ к методу, т.к. уровень доступа метода - private.
        //tester.getNameSurname();Уровень доступа - protected
        //System.out.println("Experience in a months: " + tester.getExperienceInMonths()); Уровень доступа только внутри паета
        tester.getAllInformationAboutUser();
    }
}


public class Tester {

    public String name;
    public String surname;
    protected double experienceInYears;
    String englishLevel;
    private int salary;

     public Tester(String name, String surname, double experienceInYears, String englishLevel, int salary) {
        this(name, surname, englishLevel);
        this.experienceInYears = experienceInYears;
        this.salary = salary;
    }


    Tester(String name, String surname, String englishLevel) {
        this(name, surname);
        this.englishLevel = englishLevel;
    }

    Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    double getExperienceInYears() {
        return experienceInYears;
    }

    void setExperienceInYears(double experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    String getEnglishLevel() {
        return englishLevel;
    }

    void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    private int getTwoSalary() {
        return salary * 2;
    }

    protected void getNameSurname() {
        System.out.println("Name is : " + name + "," + " " + "Surname is : " + surname + ".");
    }

    double getExperienceInMonths() {
        return experienceInYears * 12;
    }

    public void getAllInformationAboutUser() {
        System.out.print("Name is  " + name + "," + " " + "Surname is  " + surname + "," + " " + "Experience is " + experienceInYears + " " + "years" + "," + " " + "Level of English is " + englishLevel + "," + " " + "Salary is " + " " + salary + " " + "dollars" + ".");
    }
}

