package com.emred.junit5;

class FootballPlayer {
    FootballTeam team;
    String name;
    String surname;
    int price;

    FootballPlayer(String name, String surname, int price, FootballTeam team) {
        this.team = team;
        this.name = name;
        this.surname = surname;
        this.price = price;
    }

    void scoreGoal() {
        team.logScorePlayer();
    }
}
