
public class GenericPair<K,V> implements Pair<K,V> {
	
	private K key;
	private V value;
	
	public GenericPair(K key,V value){
		this.key=key;
		this.value=value;
	}
	
	public K getKey(){
		
		return this.key;
	}

	public V getValue(){
		
		return this.value;
	}
}
