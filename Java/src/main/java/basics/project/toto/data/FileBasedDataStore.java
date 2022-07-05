package basics.project.toto.data;

import basics.project.toto.domain.Hit;
import basics.project.toto.domain.Outcome;
import basics.project.toto.domain.Round;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * FileBasedDataStore class implements the DataStore interface. TotoService needs a DataStore instance
 * to be passed as argument in its constructor (that will be FileBasedDataStore instance).
 * FileBasedDataStore init method accepts the path of the CSV file to initialize rounds.
 * TotoService.getResult(...) should throw java.util.NoSuchElementException if Round is not found for the given date.
 * The classes must have the fields and methods as defined in the class diagrams.
 * You can implement additional methods in the classes as you like.
 */
public class FileBasedDataStore implements DataStore {
    private List<Round> rounds;

    public void init(String str) {
        String line;
        String[] singleLine;
        Round round = new Round();
        rounds = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(str))) {
            while ((line = bufferedReader.readLine()) != null) {
                singleLine = line.split(",");
                setYear(singleLine, round);
                setWeek(singleLine, round);
                setRoundOfWeek(singleLine, round);
                setDate(singleLine, round);
                setHits(singleLine, round);
                setOutcomes(singleLine, round);
                rounds.add(round);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private void setRoundOfWeek(String[] singleLine, Round round) {
        round.setRoundOfWeek(getRoundOfWeek(singleLine));
    }

    private void setWeek(String[] singleLine, Round round) {
        round.setWeek((int) Long.parseLong(singleLine[1]));
    }

    private void setYear(String[] singleLine, Round round) {
        round.setYear((int) Long.parseLong(singleLine[0]));
    }

    private void setOutcomes(String[] singleLine, Round round) {
        List<Outcome> outcomes = new ArrayList<>();
        for (int i = 14; i < singleLine.length; i++) {
            if (singleLine[i].equals("1")) {
                outcomes.add(Outcome.ONE);
            } else if (singleLine[i].equals("2")) {
                outcomes.add(Outcome.TWO);
            } else {
                outcomes.add(Outcome.X);
            }
        }
        round.setOutcomes(outcomes);
    }

    private void setHits(String[] singleLine, Round round) {
        List<Hit> hits = new ArrayList<>();
        hits.add(new Hit(14, Integer.parseInt(singleLine[4]), Integer.parseInt(singleLine[5].replaceAll("\\D", ""))));
        hits.add(new Hit(13, Integer.parseInt(singleLine[6]), Integer.parseInt(singleLine[7].replaceAll("\\D", ""))));
        hits.add(new Hit(12, Integer.parseInt(singleLine[8]), Integer.parseInt(singleLine[9].replaceAll("\\D", ""))));
        hits.add(new Hit(11, Integer.parseInt(singleLine[10]), Integer.parseInt(singleLine[11].replaceAll("\\D", ""))));
        hits.add(new Hit(10, Integer.parseInt(singleLine[12]), Integer.parseInt(singleLine[13].replaceAll("\\D", ""))));
        round.setHits(hits);
    }

    private void setDate(String[] singleLine, Round round) {
        String[] date;
        date = singleLine[3].split("\\.");
        if (date.length == 1) {
            int month = Integer.parseInt(singleLine[1]);
            if (month < 4) {
                month = 1;
            } else if (month > 51) {
                month = 12;
            } else {
                month = month / 4;
            }
            round.setDate(LocalDate.of(Integer.parseInt(singleLine[0]), month, getRoundOfWeek(singleLine)));
        } else {
            round.setDate(LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])));
        }
    }

    private int getRoundOfWeek(String[] singleLine) {
        return Integer.parseInt(singleLine[2].equals("-") ? "1" : singleLine[2]);
    }

    @Override
    public List<Round> getRounds() {
        return rounds;
    }
}
