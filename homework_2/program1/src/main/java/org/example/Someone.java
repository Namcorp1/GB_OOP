package org.example;

public abstract class Someone {

    protected String name;
    protected Integer maxRunDistance;
    protected Double maxJumpHeigth;

    public Someone() {
    }

    ;

    public Someone(String name, Integer maxRunDistance, Double maxJumpHeigth) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
    }


    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.printf("%s не преодолел %d метров", name, distance);
        } else {
            System.out.printf("%s преодолел %d метров", name, distance);
        }
    }

    public void jump(double distance) {
        if (distance > maxRunDistance) {
            System.out.printf("%s не перепрыгнул %f метров", name, distance);
        } else {
            System.out.printf("%s перепрыгнул %f метров", name, distance);
        }
    }

    public boolean runRace(int distance) {
        if (distance > maxRunDistance) {
            return false;
        } else {
            return true;
        }
    }

    public boolean jumpRace(double distance) {
        if (distance > maxRunDistance) {
            return false;
        } else {
            return true;
        }
    }

}
