package basics.project.toto.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Round {
    private int year;
    private int week;
    private int roundOfWeek;
    private LocalDate date;
    private List<Outcome> outcomes;
    private List<Hit> hits;
}
