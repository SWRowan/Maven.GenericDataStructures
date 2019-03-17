package TableNested;

import java.util.ArrayList;
import java.util.List;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K key) {
        for(Entry entry : entries){
            if(entry.getKey().equals(key)){
                return (V)entry.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean hasKey = false;
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                hasKey = true;
            }
        }
        if (!hasKey) {
            Entry entry = new Entry(key, value);
            entries.add(entry);
        }
    }

    public void remove(K key) {
        entries.removeIf(entry -> entry.getKey().equals(key));

    }




    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
