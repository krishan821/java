package tree;
import java.util.*;


public class Binary_tree {
	Scanner sc = new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public Binary_tree()
	{
		this.root=Create_tree(null,false);
	}
	private Node Create_tree(Node parent,boolean ilc)
	{
		if(parent==null)
		{
			System.out.println("enter root node");
		}
		else {
			if(ilc) {
				System.out.println("enter data for left child"+parent.data);
			}
			else {
				System.out.println("enter data for right child"+parent.data);
			}
			
		}
		int item=sc.nextInt();
		Node nn=new Node();
		nn.data=item;
		System.out.println("has left child??"+nn.data);
		boolean hlc=sc.nextBoolean();
		if(hlc) {
			nn.left=Create_tree(nn,true);
		}
		System.out.println("has right child??"+nn.data);
		boolean hrc=sc.nextBoolean();
		if(hrc)
		{
			nn.right=Create_tree(nn,false);
		}
		return nn;
		
	}
	public void display()
	{
		display(this.root);
	}
	private void display(Node node)
	{
		if(node==null)
		{
			return;
		}
		String str="";
		if(node.left!=null)
		{
			str+=node.left.data;
		}
		else {
			str+=".";
		}
		str+="<--"+ node.data +"-->";
		if(node.right!=null)
		{
			str+=node.right.data;
		}
		else {
			str+=".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	//Maximum Value of tree
	public int max()
	{
		return max(this.root);
	}
	private int max(Node node)
	{
		if(node==null)
		{
			return Integer.MIN_VALUE;
		}
		int left_maximum=max(node.left);
		int right_maximum=max(node.right);
		return Math.max(left_maximum, Math.max(right_maximum,node.data));
	}
	//Height of tree
	public int ht()
	{
		return ht(this.root);
	}
	private int ht(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		int left_ht=ht(node.left);
		int right_ht=ht(node.right);
		return Math.max(left_ht, right_ht)+1;
	}
	//size of tree
	public int size()
	{
		return size(this.root);
	}
	private int size(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		int left_size=size(node.left);
		int right_size=size(node.right);
		return left_size + right_size;
	}
   // Find the item in binary tree
	public boolean find(int item)
	{
		return find(this.root,item);
	}
	private boolean find(Node node,int item)
	{
		if(node==null)
		{
			return false;
		}
		if(node==item)
		{
			return true;
		}
		boolean left=find(node.left);
		boolean right=find(node.right);
		return left||right;
	}
}
