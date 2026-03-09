public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №4");
        //Задача №1
        System.out.println("Задача №1");
        int age = 19;
        if (age>=18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача №2
        System.out.println("Задача №2");
        int temperature = 4;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        //Задача №3
        System.out.println("Задача №3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Задача №4
        System.out.println("Задача №4");
        int age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский садик.");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }
        //Задача №5
        System.out.println("Задача №5");
        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе без сопровождения");
        }
        //Задача №6
        System.out.println("Задача №6");
        int capacityOfOneCarriage = 102;//вместимость одного вагон поезда
        int seatingPlace = 60;// расчитанное количество сидячих мест в вагоне
        int standingPlace = capacityOfOneCarriage - seatingPlace;//расчитанное количество стоячих мест
        int seatedPassengers = 5;//количество сидящих пассажиров
        int standingPassengers = 5;//количество стоящих пассажиров
        if ((seatedPassengers + standingPassengers) < capacityOfOneCarriage) {
            int totalAvailableSeats = capacityOfOneCarriage - (seatedPassengers + standingPassengers);//всего свободных мест в вагоне
            System.out.println("Вагоне " + totalAvailableSeats + " Cвободных мест, из них:");
        } else {
            System.out.println("Вагон переполнен!!! Свободных мест нет!!!");
        }
        if (seatedPassengers < seatingPlace) {
            int freeNumberOfSeats = seatingPlace - seatedPassengers;//количество свободных сидячих мест
            System.out.println("сидячих мест -  " + freeNumberOfSeats);
        } else {
            System.out.println("сидячих мест 0");
        }
        if (standingPassengers < seatingPlace) {
            int freeNumberOfStanding = standingPlace - standingPassengers;//количество свободных стоячих мест
            System.out.println("стоячих мест -  " + freeNumberOfStanding);
        } else if (seatedPassengers >= seatingPlace) {
            System.out.println("стоячих мест 0");
        }
        //Задача №7
        System.out.println("Задача №7");
        int one = 30;
        int two = 25;
        int three = 78;
        int max;
        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }
        System.out.println("Наибольшее значение: " + max);
   
    }
}