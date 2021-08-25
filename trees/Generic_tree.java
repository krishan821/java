package tree;
import java.util.*;
public class Generic_tree {
	Scanner sc=new Scanner(System.in);
	private class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	private Node root; 
	
	public Generic_tree() {
		this.root=Create_Tree(null,-1);
	}
	// create Tree
	private Node Create_Tree(Node parent,int ith) {
		if(parent==null)
		{
			System.out.println("Enter root node");
		}
		else {
			System.out.println("Enter data for " + ith + " ith chid " + parent.data);
		}
		int item=sc.nextInt();
		Node nn=new Node();
		nn.data=item;
		System.out.println("enter number of child");
		int noc=sc.nextInt();
		for(int i=0;i<noc;i++)
		{
			Node child=Create_Tree(nn,i);
			nn.children.add(child);
		}
		return nn;
		
	}
	//Display Tree
	public void display() {
		this.display(this.root);
	}
	private void display(Node node)
	{
		String str="";
		str+=node.data + "->";
		for(Node child: node.children)
		{
			str+=child.data +",";
		}
		str+=".";
		System.out.println(str);
		for(Node child:node.children )
		{
			display(child);
		}
	
}
	//size of tree
	public int size() {
		return size(this.root);
	}
	private int size(Node node)
	{
		int th=0;
		for(Node child:node.children)
		{
			th+=size(child);
		}
		return th+1;
	}
	//find a value in tree
	public boolean find(int item)
	{
		return find(this.root,item);
	}
	private boolean find(Node node,int item)
	{
		if(node.data==item)
		{
			return true;
		}
		for(Node child:node.children)
		{
			boolean ans=find(child,item);
			if(ans) {
				return true;
			}
		}
		return false;
    }
	//find maximum value in tree
	public int max()
	{
		return max(this.root);
	}
	private int max(Node node) {
		int max=node.data;
		for(Node child:node.children)
		{
			int curr_max=child.data;
			max=Math.max(max, curr_max);
		}
		return max;
	}
	//find maximum height
	public int ht()
	{
		return ht(this.root);
	}
	private int ht(Node node)
	{
		int ht=-1;
		for(Node child: node.children)
		{
			int max_ht=ht(child);
			ht=Math.max(max_ht, ht);
		}
		return ht+1;
	}
	// Traversal pre order
	public void preorder()
	{
		preorder(this.root);
		System.out.println();
	}
	private void preorder(Node node)
	{
		System.out.print(node.data+",");
		for(Node child:node.children)
		{
			preorder(child);
		}
	}
	//postorder traversal
	public void postorder()
	{
		postorder(this.root);
		System.out.println();
	}
	private void postorder(Node node)
	{
		
		for(Node child:node.children)
		{
			postorder(child);
		}
		System.out.print(node.data+",");
	}
	// make a liner tree
	public void linear()
	{
		linear(this.root);
	}
	private void linear(Node node)
	{
		for(Node child:node.children)
		{
			linear(child);
		}
		while(node.children.size()>1)
		{
			Node tail_node=Get_tail_node(node.children.get(0));
			Node firstnode=node.children.remove(1);
			tail_node.children.add(firstnode);
		}
	}
	private Node Get_tail_node(Node node)
	{
		if(node.children.size()==0)
		{
			return node;
		}
		for(Node child: node.children)
		{
			return Get_tail_node(child);
		}
		return null;
	}
}

