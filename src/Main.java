public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Общая масса бойщов " + (boxer1 + boxer2) + "кг");
        System.out.println("Разница в массе " + (boxer2 - boxer1) + "кг");

        // Задача 7
        System.out.println(boxer2 % boxer1);

        // Задача 8
        var wokers = 640/8;
        System.out.println("Всего работников в компании " + wokers + " человек.");
        wokers = wokers + 94;
        System.out.println("Если в компании работает " + (wokers) + " человек, то всего " + (wokers*8) + " часов работы может быть поделено между сотрудниками.");

    }
}