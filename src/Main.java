public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var summeryWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес бойцов " + summeryWeight + " кг!");
        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов " + weightDifference + " кг!");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов " + weightDifference + " кг!");
        var summeryWeight = boxerOne + boxerTwo;
        var weightDifferenceLeft = (boxerTwo - boxerOne) % summeryWeight;
        System.out.println("Весовая разница через остаток деления " + weightDifferenceLeft + " кг!");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var workingHoursTotal = 640;
        var workingHourPerMan = 8;
        var workersAmount = workingHoursTotal / workingHourPerMan;
        System.out.println("Всего работников в компании — " + workersAmount + " человек");
        workersAmount = workersAmount + 94;
        workingHoursTotal = workersAmount * workingHourPerMan;
        System.out.println("Если в компании работает " + workersAmount + (" человека, то всего " + workingHoursTotal + " часа работы может быть поделено между сотрудниками "));
    }


    }