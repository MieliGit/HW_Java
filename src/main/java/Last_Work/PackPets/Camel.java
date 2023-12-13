package Last_Work.PackPets;

public class Camel extends PackPet {

    public Camel(int id, String name, String birthdate, int loadCapacity) {
        super(id, name, birthdate, loadCapacity);
    }

    public void Comands(){
        System.out.println("Выполняемые команды животного");
    }
}