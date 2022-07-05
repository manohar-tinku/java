package basics.project.toto.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hit {
    private int hitCount;
    private int numberOfWagers;
    private int prize;

    public int getHitCount() {
        return hitCount;
    }

    public int getNumberOfWagers() {
        return numberOfWagers;
    }

    public int getPrize() {
        return prize;
    }
}
