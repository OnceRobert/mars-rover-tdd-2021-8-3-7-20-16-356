package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class marsRoverTest {
    @Test
    void should_Location_X_0_Location_Y_1_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_and_M() {    // +x move
        //given
        marsRover marsrover = new marsRover(0,0,"N","M");
        roverStatus expectedStatus = new roverStatus(0,1,"N");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_W_when_execute_Command_given_Location_X_0_Location_Y_0_and_L() {    // left turn N
        //given
        marsRover marsrover = new marsRover(0,0,"N","L");
        roverStatus expectedStatus = new roverStatus(0,0,"W");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_E_when_execute_Command_given_Location_X_0_Location_Y_0_and_R() {    // right turn N
        //given
        marsRover marsrover = new marsRover(0,0,"N","R");
        roverStatus expectedStatus = new roverStatus(0,0,"E");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }



}
