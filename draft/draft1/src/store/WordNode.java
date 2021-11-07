package store;

import java.util.TreeMap;

// Structure pour le store in-memory
class WordNode {
	String word;
	long totalCountInMemory; // can be negative when virtually updating store on disk
	TreeMap<Long, Long> treeMap; // (partialCount, fileID)
}
