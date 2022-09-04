
public class CustomTree {
Node rootNode;
public void add(int data)
{
	if(rootNode==null)
	{
		rootNode=new Node();
		rootNode.data=data;
	}
	else
		findPositionAndAdd(data,rootNode);
}
private void findPositionAndAdd(int data,Node node) {
	// TODO Auto-generated method stub
	if(data<node.data && node.left==null) {
		Node newNode=new Node();
		newNode.data=data;
		node.left=newNode;
		return ;
	}
	if(data>node.data && node.right==null) {
		Node newNode=new Node();
		newNode.data=data;
		node.right=newNode;
		return ;
	}
	else if(data<node.data ) {
		findPositionAndAdd(data,node.left);
	}

	
	else if(data>node.data )
	{
		findPositionAndAdd(data,node.right);
	}
	
}


public int getHeight(Node node)
{
	if(node.right==null && node.left==null)
	{
		node.height=0;
		return node.height;
	}
	int rightHeight;
	if(node.right!=null) {
	rightHeight=getHeight(node.right);
	}
	else
	{
		rightHeight=-1;
	}
	int leftHeight;
	if(node.left!=null) {
	leftHeight=getHeight(node.left);
	}
	else
	{
		leftHeight=-1;
	}
	int height= max(rightHeight+1,leftHeight+1);
	node.height=height;
	return node.height;
	
}
private int max(int rightHeight, int leftHeight) {
	if(rightHeight>leftHeight)
	{
		return rightHeight;
	}
	else
	{
		return leftHeight;
	}
}

}
