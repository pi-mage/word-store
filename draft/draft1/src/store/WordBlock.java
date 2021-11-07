package store;

import java.util.Iterator;
import java.util.List;

// Structure d'accès à toutes les données d'un mot, à la fois depuis le store in-memory et sur disque
class WordBlock {

	WordNode wordNode;
	int totalCount;
	List<PartIterator > fileAccessors;

	long getTotalCount() {
		return 0;
	}

	Iterator<Pair<Long, Long>> iterateOverPartialCounts() {
		return null;
	}


}
