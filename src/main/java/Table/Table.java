package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;

    public Table() {
        entries = new ArrayList();
    }

    public V get(K key) {
        for (Entry e : entries) {
            if (e.getKey().equals(key)) {
                return (V) e.getValue();
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
}
