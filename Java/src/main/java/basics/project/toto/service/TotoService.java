package basics.project.toto.service;

import basics.project.toto.data.DataStore;
import basics.project.toto.domain.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TotoService {
    private DataStore dataStore;

    public TotoService(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public Result getResult(LocalDate date, List<Outcome> outcomes) {
        List<Round> rounds=dataStore.getRounds();
        int hitCount=0;
        System.out.println(outcomes.size());
        for (Round round:rounds) {
            System.out.println(round.getYear());
            if(round.getDate().equals(date)){
                List<Outcome> outcomes1=round.getOutcomes();
                for (int i = 0; i < outcomes.size(); i++) {
                    System.out.println(outcomes1.get(i)+" "+outcomes.get(i));
                    if(outcomes1.get(i)==outcomes.get(i)){
                        hitCount++;
                    }
                }
            }
        }
        System.out.println(hitCount);
        return null;
    }

    public Statistics calculateStatistics() {
        var outcomesList = dataStore.getRounds().stream().map(Round::getOutcomes).toList();
        int firstTeamWinCount = 0;
        int secondTeamWinCount = 0;
        int drawCount = 0;
        for (var outcomes : outcomesList) {
            for (var outcome : outcomes) {
                if (outcome.equals(Outcome.ONE)) {
                    firstTeamWinCount++;
                } else if (outcome.equals(Outcome.TWO)) {
                    secondTeamWinCount++;
                } else {
                    drawCount++;
                }
            }
        }
        int totalCount = firstTeamWinCount + secondTeamWinCount + drawCount;
        return new Statistics(getPercentage(firstTeamWinCount, totalCount), getPercentage(secondTeamWinCount, totalCount), getPercentage(drawCount, totalCount));
    }

    private double getPercentage(int firstTeamWinCount, int totalCount) {
        return totalCount==0?0:(double) firstTeamWinCount / totalCount * 100;
    }

    public int getLargestPrize() {
        int max = Integer.MIN_VALUE;
        List<Round> rounds = dataStore.getRounds();
        for (Round round : rounds) {
            List<Hit> hits = round.getHits();
            for (Hit hit : hits) {
                max = Math.max(hit.getPrize(), max);
            }
        }
        return max;
    }
}
