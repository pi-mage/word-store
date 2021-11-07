package store;

import java.io.DataOutputStream;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Store {

    private List<MappedByteBuffer> mappedByteBufferrList;
    private HashMap<String, WordNode> map;
    private HashSet<Long> removedFiles;
    private ActionSerializer actionSerializer;
    private DataOutputStream livingStoreSerialization;
    private StoreInMemory livingStore;
    private StoreInMemory archivedStore;
    private ReadWriteLock lockLivingStore;
    private ReadWriteLock lockArchivedStore;

    public void lock() {

    }

    public void unlock() {

    }

    public void addOccurrences(List<Pair<String, Long>> occurences, long fileID) {

    }

    public void removeOccurrences(List<Pair<String, Long>> occurences, long fileID) {

    }

    public WordBlock getWordBlock(String word) {
        return null;
    }

    void actionAddOccurences(ActionAddOccurrences actionAddOccurrences) {

    }

    void actionRemoveOccurences(ActionRemoveOccurrences actionRemoveOccurrences) {

    }
}
