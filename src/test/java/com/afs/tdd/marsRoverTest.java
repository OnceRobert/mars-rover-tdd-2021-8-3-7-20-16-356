package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class marsRoverTest {

    //TESTS FACING NORTH
    @Test
    void should_Location_X_0_Location_Y_1_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_N_and_M() {    // +y move
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
    void should_Location_X_0_Location_Y_0_Direction_W_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_N_and_L() {    // left turn N
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
    void should_Location_X_0_Location_Y_0_Direction_E_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_N_and_R() {    // right turn N
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


    //TESTS FACING WEST
    @Test
    void should_Location_X_n1_Location_Y_0_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_N_and_M() {    // -x move
        //given
        marsRover marsrover = new marsRover(0,0,"W","M");
        roverStatus expectedStatus = new roverStatus(-1,0,"W");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_S_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_W_and_L() {    // left turn W
        //given
        marsRover marsrover = new marsRover(0,0,"W","L");
        roverStatus expectedStatus = new roverStatus(0,0,"S");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_W_and_R() {    // right turn W
        //given
        marsRover marsrover = new marsRover(0,0,"W","R");
        roverStatus expectedStatus = new roverStatus(0,0,"N");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    //Tests Facing south
    @Test
    void should_Location_X_0_Location_Y_n1_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_S_and_M() {    // -y move
        //given
        marsRover marsrover = new marsRover(0,0,"S","M");
        roverStatus expectedStatus = new roverStatus(0,-1,"S");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_E_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_S_and_L() {    // left turn S
        //given
        marsRover marsrover = new marsRover(0,0,"S","L");
        roverStatus expectedStatus = new roverStatus(0,0,"E");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_W_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_S_and_L() {    // right turn S
        //given
        marsRover marsrover = new marsRover(0,0,"S","R");
        roverStatus expectedStatus = new roverStatus(0,0,"W");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    //TESTS FACING EAST
    @Test
    void should_Location_X_1_Location_Y_0_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_E_and_M() {    // x move
        //given
        marsRover marsrover = new marsRover(0,0,"E","M");
        roverStatus expectedStatus = new roverStatus(1,0,"E");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_E_and_L() {    // left turn W
        //given
        marsRover marsrover = new marsRover(0,0,"E","L");
        roverStatus expectedStatus = new roverStatus(0,0,"N");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_S_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_E_and_R() {    // left turn W
        //given
        marsRover marsrover = new marsRover(0,0,"E","R");
        roverStatus expectedStatus = new roverStatus(0,0,"S");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }

    @Test
    void should_Location_X_n1_Location_Y_2_Direction_W_when_execute_Command_given_Location_X_0_Location_Y_0_Direction_N_and_MLMRM() {    // left turn W
        //given
        marsRover marsrover = new marsRover(0,0,"N","MLMRM");
        roverStatus expectedStatus = new roverStatus(-1,2,"N");

        //when
        roverStatus executedCommands = marsrover.executeCommands();

        //then
        assertEquals(expectedStatus.getX(),executedCommands.getStatus().getX());
        assertEquals(expectedStatus.getY(),executedCommands.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),executedCommands.getStatus().getDirection());
    }
    
    @Test
    void should_Location_X_0_Location_Y_0_Direction_N_when_build_report_given_Location_X_0_Location_Y_0_Direction_N()
    {
        //given
        roverStatus status = new roverStatus(0,0,"N");
        //roverStatus expectedStatus = new roverStatus(0,0,"N");
        //when
        String report = status.generateReport();

        //then
        assertEquals(String.format("X Position : 0 Y Position : 0 Direction : N"),report);
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_N_Commands_MLM_when_parseInstructions_given_String_00N_MLM()
    {
        //given
        marsRover marsrover = new marsRover();
        String input = "0 0 N  MLM";
        roverStatus expectedStatus = new roverStatus(0,0,"N");
        String expectedInstructions = "MLM";


        //when
        marsrover.parseInstructions(input);

        //then
        assertEquals(expectedStatus.getX(),marsrover.getStatus().getX());
        assertEquals(expectedStatus.getY(),marsrover.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),marsrover.getStatus().getDirection());
        assertEquals(expectedInstructions,marsrover.getCommands());
    }

    @Test
    void should_Location_X_0_Location_Y_0_Direction_N_when_executeInstructions_given_String_00N_MLM()
    {
        //given
        marsRover marsrover = new marsRover();
        String input = "0 0 N  MLM";
        roverStatus expectedStatus = new roverStatus(0,0,"N");
        String expectedInstructions = "MLM";


        //when
        marsrover.executeInstructions(input);

        //then
        assertEquals(expectedStatus.getX(),marsrover.getStatus().getX());
        assertEquals(expectedStatus.getY(),marsrover.getStatus().getY());
        assertEquals(expectedStatus.getDirection(),marsrover.getStatus().getDirection());
        assertEquals(expectedInstructions,marsrover.getCommands());
    }

}
