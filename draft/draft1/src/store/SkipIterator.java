package store;

import java.util.Iterator;
import java.util.function.Predicate;

class SkipIterator<T> implements Iterator<T> {

        private Iterator<T> iterator;
        private Predicate<T> skipPredicate;
        private T next;

        SkipIterator(Iterator<T> iterator, Predicate<T> skipPredicate) {

        }

        public boolean hasNext() {
                return false;
        }

        @Override
        public T next() {
                return null;
        }

        private void goToNextEntry() {

        }

}