package org.example;

public class Course {
    int count;
    double[] obstacle;

    public Course(){}

    /**
     *
     * @param count кол-во этапов/препятствий на трассе
     */
    public Course(int count) {
        this.count = count;
    }

    public Course(double[] obstacle) {
        this.obstacle = obstacle;
    }


    /**
     *
     * @param treadmill дорожка с параметрами минимальной и максимальной длины
     * @param barrier барьер с параметрами минимальной и максимальной высота
     * @return трасса с кол-ом препятствий равным count в конструкторе
     */
    public double[] createCourse(Treadmill treadmill, Barrier barrier){
        double[] obstacle = new double[count];
        boolean step = true;
        for(int i = 0; i < count; i++){
            if (step) {
                obstacle[i] = (double) new Treadmill().randomLength(treadmill.minLength, treadmill.maxLength);
                step = false;
            }else{
                obstacle[i] = new Barrier().randomHeight(barrier.minHeight, barrier.maxHeight);
                step = true;
            }
        }
        return obstacle;
    }
}

