package tree_traversal;

import java.util.*;
public class level_order_traversal {
	Scanner sc = new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public level_order_traversal()
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
	public void LevelOrder() {

		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		while (!q.isEmpty()) {
			Node node = q.remove();
			System.out.print(node.data + " ");
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}

		}
		System.out.println();

	}
}
