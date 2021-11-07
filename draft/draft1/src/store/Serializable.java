package store;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public interface Serializable {

    void load(DataInput in) throws IOException;

    void save(DataOutput out) throws IOException;
}
