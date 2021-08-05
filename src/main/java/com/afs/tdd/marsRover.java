package com.afs.tdd;

public class marsRover {
    private roverStatus status;
    private String commands;
    public marsRover (int x, int y, String direction, String commands){
        status = new roverStatus(x,y,direction);
        this.commands = commands;
    }
    
    public roverStatus executeCommands(){
        roverStatus newStatus = status;
        for (int i = 0; i<commands.length();i++) {
            String command = "" + commands.charAt(i);
            newStatus = executeCommand(status, command);
        }
        return newStatus;
    }
    
    public roverStatus executeCommand(roverStatus status, String command){
        if(command.equals("M")){
            int newY = status.getY() + 1;
            return new roverStatus(status.getX(),newY,status.getDirection());
        }
        else
            return status;
    }

    public roverStatus getStatus(){
        return status;
    }
}
