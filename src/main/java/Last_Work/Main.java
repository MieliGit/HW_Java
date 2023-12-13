package Last_Work;

import java.util.Scanner;

import Last_Work.PackPets.Camel;
import Last_Work.PackPets.Donkey;
import Last_Work.Pets.Cat;
import Last_Work.Pets.Dog;

public class Main {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();

        animalFarm.adopt(new Cat(1, "Буся", "2013-01-12", true));
        animalFarm.adopt(new Donkey(2, "Иа", "2019-01-12", 12));
        animalFarm.adopt(new Camel(3, "Горб", "2020-03-15", 15));
        animalFarm.adopt(new Dog(4, "Вольт", "2011-02-23", false));

        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            Farm.printAnimals();
                            break;
                        case 2:
                            Menu.printOnlyThisClass(animalFarm);
                            break;
                        case 3:
                            Menu.Comands();
                            break;
                        case 4:
                            Menu.newComand();
                            break;
                        case 5:
                            Menu.newAnimal();
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Try one more time");
        }
    }

}