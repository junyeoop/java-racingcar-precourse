package racingcar;

public class Car {
    private String name;
    private int dist;

    public Car(String name){
        this.name = name;
        this.dist = 0;
    }

    public void move(){
        this.dist++;
    }
    public String getName(){
        return this.name;
    }
    public int getDist(){
        return this.dist;
    }
}
