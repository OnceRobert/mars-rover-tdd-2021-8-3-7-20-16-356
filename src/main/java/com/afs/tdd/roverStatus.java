package com.afs.tdd;

public class roverStatus {
    private int x;
    private int y;
    private String direction;
    public roverStatus(int x, int y, String direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public roverStatus getStatus(){
        return this;
    }


    public boolean equals(roverStatus tester){
        if (this == tester) return true;
        if (tester == null || getStatus() != tester) return false;
        return this.x == tester.getX() && this.y == tester.getY() && this.direction == tester.getDirection();
    }

    public String generateReport() {
        return String.format("X Position : %d Y Position : %d Direction : %s",this.x,this.y,this.direction);
    }
}
