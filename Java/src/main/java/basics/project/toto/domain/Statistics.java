package basics.project.toto.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Statistics {
    private double firstTeamWinPercentage;
    private double secondTeamWinPercentage;
    private double drawPercentage;

    public double getFirstTeamWinPercentage() {
        return firstTeamWinPercentage;
    }

    public double getSecondTeamWinPercentage() {
        return secondTeamWinPercentage;
    }

    public double getDrawPercentage() {
        return drawPercentage;
    }
}
