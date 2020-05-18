package com.company;

public class Lesson4 {

public static void main(String[] args) {
Person person = new Person();
person.setName("Kate");
person.setSurname("Smith");
person.setAge(25);
person.setPhone(64646464);
person.getPrintAllInformation();
person.getPrintName();
System.out.println();
System.out.println(person.getIsAdult());
    }
}

public class Person {

    public String name;
    public String surname;
    public int age;
    public int phone;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void getPrintAllInformation() {
        System.out.println("Name is " + name + "," + " " + "Surname is " + surname + "," + " " + age + " " + "years old" + "," + " " + "Pnone is " + phone + ".");
    }

    public void getPrintName() {
        System.out.print("Name is " + name + "," + " " + "Surname is " + surname + ".");
    }

    public int getIsAdult() {
        if (age < 18) {
            return 0;
        } else {
            return 1;
        }
    }
}

/////////////////////////////////

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 9;
        int size = 5;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * b);
        }
        Massive massive = new Massive();
        massive.printMassiveAsLine(array);
        System.out.println(" ");
        massive.printReverseMassiveAsLine(array);
        System.out.println(" ");
        System.out.println(massive.getSumOfElements(array));
        System.out.println(Arrays.toString(massive.multiplyBy3(array)));
        massive.printNewMassive(array);
    }

    public static class Massive {

        public static void printMassiveAsLine(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }

        public static void printReverseMassiveAsLine(int[] array) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }
        }

        public static int getSumOfElements(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            return sum;
        }

        public static int[] multiplyBy3(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * 3;
            }
            return array;
        }

        public static void printNewMassive(int[] array) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }
        }
    }
}
