package com.gmail.ryitlearning;

import java.util.ArrayList;

public class Team<T extends Player> {
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already in this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return won * 2 + tied;
    }

    @Override
    public String toString() {
        return "Team{" +
                "played=" + played +
                ", won=" + won +
                ", lost=" + lost +
                ", tied=" + tied +
                ", name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
