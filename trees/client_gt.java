package tree;

public class client_gt {
	public static void main(String[] args) {
	Generic_tree gt = new Generic_tree();
	gt.display();
	System.out.println(gt.size());
	System.out.println(gt.find(100));
	System.out.println(gt.max());
	System.out.println(gt.ht());
	gt.preorder();
	gt.postorder();
	gt.linear();
	gt.display();
}
}
