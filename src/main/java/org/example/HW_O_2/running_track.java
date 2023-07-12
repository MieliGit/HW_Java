package org.example.HW_O_2;

public class running_track extends Obstacles {

    private Integer distance;
    public running_track(String name, Integer distance) {
        super(name);
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    protected boolean moving(Inter actions) {
        System.out.println();
        System.out.println("Дорога " + super.getName() + " Длиной: " + this.distance);

        actions.run();

        if (getDistance() <= actions.getRunDistance()) {
            System.out.println();
            System.out.println("Успешная дистанция");

            return true;
        } else {
            System.out.println();
            System.out.println("Неуспешаня дистанция");

            return false;
        }
    }
}

