package store;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;

class ActionRemoveOccurrences extends Action {

    List<Pair<String, Long>> occurences;
    long fileID;

    ActionRemoveOccurrences() {

    }

    ActionRemoveOccurrences(List<Pair<String, Long>> occurences, long fileID) {

    }

    @Override
    public void load(DataInput in) throws IOException {

    }

    @Override
    public void save(DataOutput out) throws IOException {

    }

    @Override
    public void apply(Store store) {

    }
}
