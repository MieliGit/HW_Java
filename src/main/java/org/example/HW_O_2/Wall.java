package org.example.HW_O_2;

public class Wall extends Obstacles{
    private Integer wallheight;

    public Wall( String name, Integer wallheight){
        super(name);
        this.wallheight = wallheight;

    }

    public Integer getWallheight() {
        return wallheight;
    }


    protected boolean moving(Inter actions) {
        System.out.println();
        System.out.println("Стена " + super.getName() + "Высотой: " + this.wallheight);

        actions.jump();

        if (getWallheight() <= actions.getJumpHeight()) {
            System.out.println();
            System.out.println("Успешный прыжок");

            return true;
        } else {
            System.out.println();
            System.out.println("Неуспешный прыжок");

            return false;
        }

    }
}

