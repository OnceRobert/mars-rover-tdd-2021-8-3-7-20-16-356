package com.afs.tdd;

public class marsRover {
    private roverStatus status;
    private String commands;
    public marsRover (int x, int y, String direction, String commands){
        status = new roverStatus(x,y,direction);
        this.commands = commands;
    }

    public marsRover() {

    }


    public roverStatus executeCommands(){
        roverStatus newStatus = status;
        String command = "";
        for (int i = 0; i<commands.length();i++) {
            command = "" + commands.charAt(i);
            newStatus = executeCommand(status, command);
            status = newStatus;
        }
        return newStatus;
    }
    
    public roverStatus executeCommand(roverStatus status, String command){
        if(command.equals("M")){
            if(status.getDirection().equals("N")){
                int newY = status.getY() + 1;
                return new roverStatus(status.getX(),newY,status.getDirection());
            }else if(status.getDirection().equals("W")){
                int newX = status.getX() - 1;
                return new roverStatus(newX, status.getY(), status.getDirection());
            }else if(status.getDirection().equals("S")){
                int newY = status.getY() - 1;
                return new roverStatus(status.getX(),newY,status.getDirection());
            }else if(status.getDirection().equals("E")){
                int newX = status.getX() + 1;
                return new roverStatus(newX, status.getY(), status.getDirection());
            }
            else
                return status;
        }
        else if(command.equals("L")){
            if(status.getDirection().equals("N")) {
                String newDirection = "W";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            } else if(status.getDirection().equals("W")) {
                String newDirection = "S";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            } else if(status.getDirection().equals("S")) {
                String newDirection = "E";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            } else if(status.getDirection().equals("E")) {
                String newDirection = "N";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            }
            else
                return status;
        }
        else if(command.equals("R")){
            if(status.getDirection().equals("N")) {
                String newDirection = "E";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            }else if(status.getDirection().equals("W")) {
                String newDirection = "N";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            } else if(status.getDirection().equals("S")) {
                String newDirection = "W";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            } else if(status.getDirection().equals("E")) {
                String newDirection = "S";
                return new roverStatus(status.getX(), status.getY(), newDirection);
            } else
                return status;
        }
        else
            return status;
    }

    public roverStatus getStatus(){
        return status;
    }

    public String parseInstructions(String input) {
        String[] inputs = input.split("  ");
        setStatus(inputs[0]);
        commands = inputs[1];
        return commands;
    }

    public void setStatus(String input){
        String forStatus[] = input.split(" ");
        this.status = new roverStatus(Integer.parseInt(forStatus[0]),Integer.parseInt(forStatus[1]),forStatus[2]);
        return;
    }

    public String getCommands() {
        return commands;
    }

    public void executeInstructions(String input) {

    }
}
