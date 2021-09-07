package hashmap;
import java.util.ArrayList;
public class Implement_hashMap<K,V> {
public class Node{
	K key;
	V value;
	Node next;
	public Node(K key,V value) {
		this.key=key;
		this.value=value;
	}
	
}
private ArrayList<Node>bucketarray;
private int size=0;
public  Implement_hashMap(int l) {
	bucketarray=new ArrayList<>();
	for(int i=0;i<l;i++)
	{
		bucketarray.add(null);
	}
}
public  Implement_hashMap() {
	this(4);
}

public void put(K key,V value)
{
  int bn = hashfunction(key);
  Node temp=this.bucketarray.get(bn);
  while(temp!=null)
  {
	  if(temp.key.equals(key)) {
		  temp.value=value;
	  }
	  temp=temp.next;
  }
  this.size++;
  Node node =new Node(key,value);
  node.next=this.bucketarray.get(bn);
  this.bucketarray.set(bn, node);
  double lf = (1.0 * this.size) / this.bucketarray.size();
	int thf = 2;
	if (lf > thf) {
		
		rehashing();
	}
  
}
public void rehashing() {
	ArrayList<Node> nba = new ArrayList<>();
	ArrayList<Node> oba = this.bucketarray;
	for (int i = 0; i < 2 * oba.size(); i++) {
		nba.add(null);

	}
	this.bucketarray = nba;
	this.size=0;
	for (Node temp : oba) {
		while (temp != null) {
			this.put(temp.key, temp.value);
		}
	}
}
public V get(K key)
{
	int bn=hashfunction(key);
	Node temp=this.bucketarray.get(bn);
	while(temp!=null)
	{
		if(temp.value.equals(temp))
		{
			return temp.value;
		}
		
	}
	return null;
}
public boolean containKey(K key) {
	int bn=hashfunction(key);
	Node temp=this.bucketarray.get(bn);
	while(temp!=null)
	{
		if(temp.value.equals(temp))
		{
			return true;
		}
		
	}
	return false;
}
public V remove(K key) {
	int bn=hashfunction(key);
	Node prev=null;
	Node temp=this.bucketarray.get(bn);
	while(temp!=null)
	{
		if(temp.value.equals(temp)) {
			break;
		}
		prev=temp;
		temp=temp.next;
		
	}
	if(temp==null)
	{
		return null;
	}
	size--;
	if(prev==null) {
		this.bucketarray.set(bn, temp.next);
	}
	else {
		prev.next=temp.next;
	}
	return temp.value;
}

public String toString() {
	String str = "{";
	for (Node temp : this.bucketarray) {
		while (temp != null) {
			str += temp.key + "=" + temp.value + ",";
			temp = temp.next;
		}

	}
	str += "}";
	return str;

}
public int hashfunction(K key)
{
	 int bn = key.hashCode()%this.bucketarray.size();
	 int i=(bn+this.bucketarray.size())%this.bucketarray.size();
	 return i;
}
}
