package store;

class ActionSerializer extends Serializer<Action> {

    ActionSerializer() {
        registerType(ActionAddOccurrences.class); // id 0
        registerType(ActionRemoveOccurrences.class); // id 1
    }
}
