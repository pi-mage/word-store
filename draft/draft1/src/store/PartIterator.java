package store;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.Iterator;

// Iterator over a single partxxx.bin, comparable by next partial count
class PartIterator implements Iterator<Pair<Long, Long>>, Comparable<PartIterator> {

	ByteBuffer ByteBuffer; // slice mapped buffer pour être indépendant du thread de merging des parts
	Pair<Long, Long> next;
	long coupleCount;
	long coupleIndex;

	public boolean hasNext() {
		return false;
	}

	@Override
	public Pair<Long, Long> next() {
		return null;
	}

	@Override
	public int compareTo(PartIterator o) {
		return 0;
	}
}
