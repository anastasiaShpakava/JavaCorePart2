package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для ввода размера массива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size]; // создали массив
        // заполняем массив элементами
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size); // заполняем массив
            System.out.println(myArray[i]);
            i++;
        }
    }
}
//////////////////

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // для ввода размера
        System.out.println("Введите размер массива");

        int size = scanner.nextInt(); // ввели размер
        int[] myArray = new int[size]; // создали массив
        System.out.println("Заполните элементы массива");

        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавы
        }
        System.out.print("Вставить введенные элементы");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + myArray[i]); // Выводим на экран полученный массив
        }
        System.out.println();
    }
}
//////////

package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // для ввода размера
        System.out.println("Введите размер массива");

        int size = scanner.nextInt();
        int[] myArray = new int[size]; // создали массив


        int i = 0;

       while (i < myArray.length)
       {

            myArray[i] = (int) (Math.random() * size); // заполняем массив
            System.out.println(myArray[i]);
             i++;
        }
    }
}
///////////////

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для ввода размера массива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
        }
        System.out.println(" ");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}

//////////////
package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        int multiply = 1;
        for (i = 0; i < myArray.length; i++) {
            multiply = multiply * myArray[i];
        }
        System.out.println("Произведение всех элементов массива = " + multiply);
    }
}
///////////////

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для ввода размера массива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size]; // создали массив
        // заполняем массив элементами
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size); // заполняем массив
            System.out.println(myArray[i]);
            i++;
        }

        if (i % 3 == 0) {

            for (i = 0; i < myArray.length; i++) {
                myArray[i] = myArray[i] * 2;


                System.out.println("Результат умножения каждого терьего элемента массива на 2 = " + myArray[i]);
            }
        }
    }
}

///////////////

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для ввода размера массива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size]; // создали массив
        // заполняем массив элементами
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size); // заполняем массив
            System.out.println(myArray[i]);
            i++;
        }

        for (i = 2; i < myArray.length; i = i + 3) {

                myArray[i] = myArray[i] * 2;

                System.out.println("Результат умножения каждого терьего элемента массива на 2 = " + myArray[i]);
            }

    }
}
/////////////////////////////
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для ввода размера массива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size]; // создали массив
        // заполняем массив элементами
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size); // заполняем массив
            System.out.println(myArray[i]);
            i++;
        }

        for (i = 2; i < myArray.length; i = i + 3) {

                myArray[i] = myArray[i] * 2;

                System.out.println("Результат умножения каждого терьего элемента массива на 2 = " + myArray[i]);
            }

    }
}
/////////////
package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        int count = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                count++;
            }
        }

            System.out.println("Количество нулевых элементов в массиве = " + count);
        if (count == 0) {
            System.out.println("В массиве нет нулевых элементов");
        }
    }
}
///////////

package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        int count = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                count++;

                System.out.println("Номера нулевых элементов:" + i);
            }
}
        if (count == 0) {
            System.out.println("В массиве нет нулевых элементов");
        }
    }
}

////////////////

package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        i = 0;
        while (i < myArray.length - 1) {
            int a = myArray[i];
            myArray[i] = myArray[i + 1];
            myArray[i + 1] = a;
            i = i + 2;
        }
        System.out.println("Теперь меняем местами:");
        for (i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
/////////////////
package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        int min = myArray[0];
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        int max = myArray[0];
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
}
///////////////////

package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        int max = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] > myArray[0]) {
                myArray[0] = myArray[i];
                max = i;
            }
        }
        System.out.println("Номер максимального элемента: " + max);
        int min = 0;
        for (i = 0; i < myArray.length; i++) {
            if (myArray[i] < myArray[0]) {
                min = i;
            }
        }
        System.out.println("Номер минимального элемента: " + min);
    }
}
////////////////////
package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        int maxNum = 0;
        int maxInd = 0;
        maxNum = myArray[0];
        for (i = 1; i < myArray.length; i++) {
            if (maxNum < myArray[i]) {
                maxNum = myArray[i];
                maxInd = i;
            }
        }
        System.out.println("Индекс максимального эелемента: " + maxInd);
        int minNum = 0;
        int minInd = 0;
        minNum = myArray[0];
        for (i = 1; i < myArray.length; i++) {
            if (minNum > myArray[i]) {
                minNum = myArray[i];
                minInd = i;
            }
        }
        System.out.println("Индекс минимального эелемента: " + minInd);
    }
}

//////////////
package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
boolean a;
        for (i = 1; i < myArray.length; i++) {
            if (myArray[i] <= myArray[i - 1]) {
                a = false;
            }
            }
        if (a = true) {
            System.out.println("Массив не является возврастающей последовательностью");
        }
        if (a = false) {
            System.out.println("Массив  является возврастающей последовательностью");
        }
    }
}
///////////////
package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int i = 0;
        while (i < myArray.length) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i]);
            i++;
        }
        for (i = 1; i < myArray.length - 1; i++) {
            double a = myArray[i];
            myArray[i] = (myArray[i - 1] + myArray[i + 1]) / 2;
            a = (myArray[i - 1] + myArray[i + 1]) / 2;
        }
        System.out.println("Теперь выводим получившийся массив");
        for (i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}

///////////////
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для ввода размера массива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        int newArray[] = new int[myArray.length + 2];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * size);
            System.out.println(myArray[i] + "");

            newArray[i + 2] = myArray[i];
            myArray[i] = newArray[i];
        }
        System.out.println();
        System.out.print("Массив после сдвига:");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
