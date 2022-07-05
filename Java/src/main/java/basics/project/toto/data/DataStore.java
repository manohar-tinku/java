package basics.project.toto.data;

import basics.project.toto.domain.Round;

import java.util.List;

public interface DataStore {
    List<Round> getRounds();
}
