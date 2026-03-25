package TreeMap;

public class MyKey implements Comparable<MyKey> {
int key;

public MyKey(int key) {
	super();
	this.key = key;
}



@Override
public String toString() {
	return "\n[key=" + key + "]";
}



@Override
public int compareTo(MyKey k) {
	// TODO Auto-generated method stub
	return this.key-k.key;
}

}
