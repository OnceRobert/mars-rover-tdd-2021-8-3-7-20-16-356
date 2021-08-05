package com.afs.tdd;

import org.junit.jupiter.api.Test;

class marsRoverTest {
    @Test
    void should_Location_X_0_Location_Y_1_Direction_N_when_execute_Command_given_Location_X_0_Location_Y_0_and_M() {    // +x move
        //given
        marsRover marsrover = new marsRover(0,0,"N","M");
        roverStatus expectedStatus = new roverStatus(0,1,"N");

        //when
        marsrover.executeCommand();

        //then
        assertThat(marsrover.getStatus).isEqualTo(expectedStatus);

    }

}
