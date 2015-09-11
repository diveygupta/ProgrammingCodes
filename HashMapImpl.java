// entry class

public class MyEntry<K, V> {
  private final K key;
  private V value;

  public MyEntry(K key, V value) {
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



// hashmap class
public class MyMap<K, V> {
	  private int size;
	  private int DEFAULT_CAPACITY = 16;
	  @SuppressWarnings("unchecked")
	  private MyEntry<K, V>[] values = new MyEntry[DEFAULT_CAPACITY];


	  public V get(K key) {
	    for (int i = 0; i < size; i++) {
	      if (values[i] != null) {
	        if (values[i].getKey().equals(key)) {
	          return values[i].getValue();
	        }
	      }
	    }
	    return null;
	  }

	  public void put(K key, V value) {
	    boolean insert = true;
	    for (int i = 0; i < size; i++) {
	      if (values[i].getKey().equals(key)) {
	        values[i].setValue(value);
	        insert = false;
	      }
	    }
	    if (insert) {
	      resize();
	      values[size++] = new MyEntry<K, V>(key, value);
	    }
	  }

	  private void resize() {
		  // use load factor
	    if (size == values.length) {
	      int newSize = values.length * 2;
	      values = Arrays.copyOf(values, newSize);
	    }
	  }

	  public int size() {
	    return size;
	  }

	  public void remove(K key) {
	    for (int i = 0; i < size; i++) {
	      if (values[i].getKey().equals(key)) {
	        values[i] = null;
	        size--;
	        condenseArray(i);
	      }
	    }
	  }

	  private void condenseArray(int start) {
	    for (int i = start; i < size; i++) {
	      values[i] = values[i + 1];
	    }
	  }

	  public Set<K> keySet() {
	    Set<K> set = new HashSet<K>();
	    for (int i = 0; i < size; i++) {
	      set.add(values[i].getKey());
	    }
	    return set;
	  }
	} 