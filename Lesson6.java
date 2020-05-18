package com.company;

import java.io.PrintStream;

public class Lesson6 {

    public static void main(String[] args) {

//////////////////Звездная система
        StarSystem starSystem = new StarSystem(5000000, 283647473, 384756, "Andromeda");
        //////////перегруженные методы
        System.out.println("Age is" + " " + starSystem.getAge());
        System.out.println("Number of star in this system is " + " " + starSystem.getNumberOfStars());
        System.out.println("Quantity of systems is " + " " + starSystem.getQuantity());
        System.out.println("The name one of constellations of star system is " + " " + starSystem.getOneOfConstellations());
        starSystem.printInformationAboutStarSystem();
        starSystem.getDoubleAge();

       //////////////////////Планета

        Planet planet = new Planet(4.503E9, 0, 116, "Venus");
        planet.printInformationAboutPlanet();
        planet.getDoubleLengthOfDay();

        //////////////////////////////////Земля
        Earth earth = new Earth(4.543E9, 0, 360, "Earth", 6372, 5.372E24);
        earth.getDiameterOfEarth();
        earth.printAllInformationAboutEarth();

        ///////////////Марс
        Mars mars = new Mars(4.603E9, 0, 668, "Mars", 6779, -50);
        mars.radiusOfMars();
        mars.printAllInformationAboutMars();
        ///////////Сеттеры и геттеры
        mars.setDiameter(6779);
        mars.setAverageTemperature(-50);


        ///////////////////Звезда
        Star star = new Star(6E7, 0, 447, 1450);
        star.doubleBright();
        star.printAllInformationAboutStar();
        ///перегруженные независимые методы
        Star star1 = new Star();
        System.out.println("The distance from this star to the Earth is" + " " + star1.getDistanceToEarth());
        System.out.println("The bright from this star is" + " " + star1.getBright());
        Star star2 = new Star(543, 44432);
        System.out.println("The distance from this star to the Earth is" + " " + star2.getDistanceToEarth());
        System.out.println("The bright from this star is" + " " + star2.getBright());
        ///////////////Солнце
        Sun sun = new Sun(4.603E9, 0, 149789, 897E10, 1.409, 1.4E7);
        sun.getMasOfSun();
        sun.printAllInformationAboutSun();

        ///////////////Сириус
        Sirius sirius = new Sirius(2.3E7, 0, 86111, 25.4, 3.56, "Earth");
        sirius.getRadiusOfSirius();
        sirius.printAllInformationAboutSirius();
    }
}
public class Earth extends Planet {
    private int radius;
    private double weight;

    Earth(double age, int numberOfStars, int lengthOfDay, String nameOfPlanet, int radius, double weight) {
        super(age, numberOfStars, lengthOfDay, nameOfPlanet);
        this.weight = weight;
        this.radius = radius;
    }

    public int getDiameterOfEarth() {
        return radius * 2;
    }

    public void printAllInformationAboutEarth() {
        System.out.println("The weight of Earth is " + this.weight + "," + " " + "radius of Earth is " + " " + this.radius);
    }
}
public class Mars extends Planet {
    private double diameter;
    private int averageTemperature;

    public Mars(double age, int numberOfStars, int lengthOfDay, String nameOfPlanet, double diameter, int averageTemperature) {
        super(age, numberOfStars, lengthOfDay, nameOfPlanet);
        this.diameter = diameter;
        this.averageTemperature = averageTemperature;
    }
    public double radiusOfMars()
    {
        return diameter / 2;
    }

    public void printAllInformationAboutMars() {
        System.out.println("The diameter of Mars is " + " " + this.diameter + ", " + " " + "average temperature per year is " + " " + this.averageTemperature);
    }


    public void setDiameter(double diameter)
    {
        this.diameter = diameter;
    }


    public void setAverageTemperature(int averageTemperature)
    {
        this.averageTemperature = averageTemperature;
    }
}
public class Planet extends StarSystem {
    private int lengthOfDay;
    private String nameOfPlanet;

    public Planet(double age, int numberOfStars, int lengthOfDay, String nameOfPlanet) {
        super(age, numberOfStars);
        this.lengthOfDay = lengthOfDay;
        this.nameOfPlanet = nameOfPlanet;
    }

    public void printInformationAboutPlanet()
    {
        System.out.println("The length of day of this planet is " + " " + this.lengthOfDay + "," + " " + "this planet called" + " " + this.nameOfPlanet);
    }

    public int getDoubleLengthOfDay()
    {
        return lengthOfDay * 2;
    }

}
public class Sirius extends Star {
    private double diameter;
    private String nearestPlanet;


    public Sirius(double age, int numberOfStars, int distanceToEarth, double bright, double diameter, String nearestPlanet) {
        super(age, numberOfStars, distanceToEarth, bright);
        this.diameter = diameter;
        this.nearestPlanet = nearestPlanet;
    }

    public double getRadiusOfSirius()
    {
        return diameter / 2;
    }

    public void printAllInformationAboutSirius()
    {
        System.out.println("The diameter of Sirius is " + " " + this.diameter + "," + " " + "The" + " " + this.nearestPlanet + " " + "is the nearest planet to Sirius");
    }
}
public class Star extends StarSystem {
    private int distanceToEarth;
    private double bright;

    public Star(double age, int numberOfStars, int distanceToEarth, double bright) {
        super(age, numberOfStars);
        this.distanceToEarth = distanceToEarth;
        this.bright = bright;
    }
    //////Независимые перегруженные методы методы
    Star() {
        distanceToEarth = 447;
        bright = 1450;
    }
    Star(int num1, int num2) {
        distanceToEarth = num1;
        bright = num2;
    }
    public int getDistanceToEarth() {
        return distanceToEarth;
    }
    public double getBright() {
        return bright;
    }
    //////// 2 метода
    public double doubleBright() {
        return bright * 2;
    }

    public void printAllInformationAboutStar() {
        System.out.println("The star Polaris is " + " " + this.distanceToEarth + " " + "km" + " " + "from the Earth" + "," + " " + "and has bright " + " " + this.bright + " " + "");
    }
}
public class StarSystem {
    private double age;
    private int numberOfStars;
    protected int quantity;
    protected String oneOfConstellations;

    ///////////перегруженные конструкторы

    StarSystem(double age, int numberOfStars, int quantity, String oneOfConstellations) {
        this(age, numberOfStars);
        this.age = age;
        this.quantity = quantity;
        this.oneOfConstellations = oneOfConstellations;
    }

    StarSystem(double age, int numberOfStars) {
        this(numberOfStars);
        this.age = age;
    }

    StarSystem(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public StarSystem() {
    }

    public double getAge() {
        return age;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOneOfConstellations() {
        return oneOfConstellations;
    }
    ////////////////2 метода

    public void printInformationAboutStarSystem() {
        System.out.println("Age of Star System  Alpha Centauri is " + this.age + "," + "this Star System contains" + " " + this.numberOfStars + " " + "stars.");
    }

    public double getDoubleAge() {
        return age * 2;
    }
}

public class Sun extends Star {
    private double density;
    private double volume;

    public Sun(double age, int numberOfStars, int distanceToEarth, double bright, double density, double volume) {
        super(age, numberOfStars, distanceToEarth, bright);
        this.density = density;
        this.volume = volume;
    }

    public double getMasOfSun()
    {
        return density * volume;
    }

    public void printAllInformationAboutSun()
    {
        System.out.println(density + "," + volume);
    }
}
