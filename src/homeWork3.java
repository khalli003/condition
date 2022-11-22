public class homeWork3 {
    public static void main(String[] args) {



        // Задача 1
        int age = 11;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + "," + " то  он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + "," + " то  он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + "," + " то  придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + "," + " то  можно ездить спокойно");
        }

        // Задача 4
        int age1 = 25;
        if (age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то ему нужно ходить в детский сад. ");
        }
        if (age1 > 6 && age1 == 18) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то ему нужно ходить в школу. ");

        }
        if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то ему нужно ходить в университет. ");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то ему пора ходить на работу. ");
        }


        // Задача 5 ЭТА ЗАДАЧА НЕ ВЫВОДИТСЯ В КОНСОЛЬ, НЕ МОГУ ПОНЯТЬ ПО КАКОЙ ПРИЧИНЕ.
        var years = 5;
        if (years < 5) {
            System.out.println("Если возраст ребенка равен " + years + "," + " то ему  нельзя кататься на аттракционе.");
        }
        if (years > 5 && years < 14) {
            System.out.println("Если возраст ребенка равен " + years + "," + " то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (years > 14) {
            System.out.println("Если возраст ребенка равен " + years + "," + " то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

       // Задача 6
         var carriage = 102;
         var sedentary = 70;
        var standing = carriage % sedentary;// стоячих мест 42

        if (sedentary > 60 || standing > 42 ) {
            System.out.println("Свободных мест нет.");
        }else {
            System.out.println("Есть свободные места");
        }


        // Задача 7

      int one = 1;
        int two = 3;
        int three = 2;
        if (one < two && two < three) {
            System.out.println(three);
        }else {
            System.out.println("Ошибка");
        }



    }




}