package store;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

abstract class Serializer<T extends Serializable> {

    private Map<Class<? extends T>, Integer> typeIdTable;
    private Map<Integer, Class<? extends T>> typeIdTable2;

    protected void registerType(Class<? extends T> type) {

    }

    T  load(DataInput in) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        int typeId = in.readInt();
        T a = typeIdTable2.get(typeId).getConstructor().newInstance();
        a.load(in);
        return a;
    }

    void save(T obj, DataOutput out) {

    }
}
