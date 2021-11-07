package store;

abstract class Action implements Serializable {

    private boolean restoring = false;

    Action() {

    }

    Action(boolean restoring) {

    }

    boolean isRestoring() {
        return restoring;
    }

    boolean isNotRestoring() {
        return !restoring;
    }

    abstract void apply(Store store);
}
