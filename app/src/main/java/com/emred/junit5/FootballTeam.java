package com.emred.junit5;

import java.util.ArrayList;
import java.util.List;

class FootballTeam {
    List<FootballPlayer> footballPlayerList = new ArrayList<>();

    void addPlayer(FootballPlayer player) {
        footballPlayerList.add(player);
    }

    void logScorePlayer() {
        System.out.println("A Player scored a goal");
    }

    int getNumberOfPlayers() {
        return footballPlayerList.size();
    }

    List<Integer> getPlayerPrices() {
        // For the sake of simplicity I am skipping the implementation here.
        // Since we are handling the implementation through stub, this would not be a problem.
        return  null;
    }
}