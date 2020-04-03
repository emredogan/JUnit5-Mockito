package com.emred.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class FootballTeamClassTest {
    //Example of DUMMY test double. Dummy football player is created and used as an input parameter.
    @Test
    void addPlayerWithDummyTest() {
        FootballPlayer dummyPlayer = mock(FootballPlayer.class);
        FootballTeam team = new FootballTeam();
        team.addPlayer(dummyPlayer);
        Assert.assertEquals(1, team.getNumberOfPlayers());
    }

    // Example of STUB. The function is stubbed to return the wanted values, when it is called.
    @Test
     void findTheMostValuablePlayerTest()  {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(300);
        list.add(400);

        FootballTeam team = mock(FootballTeam.class);
        when(team.getPlayerPrices())
                .thenReturn(list);

        PriceService service = new PriceService();
        assertEquals(400, service.findTheHighestValue(list));
    }
    ///////

    // Example of MOCK. Test is checking if the logScorePlayer method within the FootballTeam class.
    @Test
    void testAddPlayerCalled() {
        FootballTeam galatasaray = Mockito.mock(FootballTeam.class);
        FootballPlayer hagi =
                new FootballPlayer("Gheorghe", "Hagi", 200, galatasaray);
        hagi.scoreGoal();
        verify(galatasaray).logScorePlayer();
    }
    ///////

    // Example of Spy. Here Spy allows us to track the interactions with the object
    // while offering access to the methods of the object.
    @Test
    void whenSpyingOnTeam_thenCorrect() {
        FootballTeam galatasaray = new FootballTeam();
        FootballTeam spyTeam = Mockito.spy(galatasaray);

        FootballPlayer hagi = mock(FootballPlayer.class);
        FootballPlayer popescu = mock(FootballPlayer.class);

        spyTeam.addPlayer(hagi);
        spyTeam.addPlayer(popescu);

        Mockito.verify(spyTeam).addPlayer(hagi);
        Mockito.verify(spyTeam).addPlayer(popescu);

        assertEquals(2, spyTeam.getNumberOfPlayers());
    }
    //TESTS END HERE

    //HELPER CLASSES STARTS
    static class PriceService {
         int findTheHighestValue(List<Integer> priceList) {
            return Collections.max(priceList);
        }
    }
}
