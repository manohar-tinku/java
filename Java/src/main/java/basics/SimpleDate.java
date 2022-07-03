package basics;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

/**
 * 1. Create a custom SimpleDate class containing only the year, the month and the day of a given date.
 * 2. Implement the Comparable interface to sort these entities chronologically.
 * 3. Fill an arbitrary list with random values and sort it.
 * 4. The random generated dates should be saved into an input.txt file before the sorting, and the
 * sorted result should be saved into an output.txt file.
 */
@Data
@AllArgsConstructor
public class SimpleDate implements Comparable<SimpleDate>{
    private int year;
    private int month;
    private int day;


    @Override
    public int compareTo(SimpleDate o) {
        return Comparator.comparing(SimpleDate::getYear)
                .thenComparing(SimpleDate::getMonth)
                .thenComparingInt(SimpleDate::getDay)
                .compare(this, o);
    }


}
