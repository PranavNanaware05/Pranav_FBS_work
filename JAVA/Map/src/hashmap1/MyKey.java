package hashmap1;

import java.util.Objects;

public class MyKey   {
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
public int hashCode() {
	return key;
}



@Override
public boolean equals(Object obj) {
   MyKey e=(MyKey)obj;
   if(this.key==e.key)
    return true;
    else
    	return false;
}
 




}