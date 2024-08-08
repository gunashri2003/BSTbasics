package dsa;

class BinarySearchTree
{
	Node root;
	
	class Node
	{
		int value;
		Node right;
		Node left;
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public boolean insert(int value)
	{
		Node newNode=new Node(value);
		if(root==null)
		{
			root=newNode;
			return true;
		}
		Node temp=root;
		while(true)
		{
			if(newNode.value==temp.value)
			{
				return false;
			}
			if(newNode.value<temp.value)
			{
				if(temp.left==null)
				{
					temp.left=newNode;
					return true;
				}
				temp=temp.left;
			}
			if(newNode.value>temp.value)
			{
				if(temp.right==null)
				{
					temp.right=newNode;
					return true;
				}
				temp=temp.right;
			}
		}
	}
	
	public boolean contains(int value)
	{
		Node temp=root;
		if(root==null)
		{
			return false;
		}
		while(temp!=null)
		{
			if(value<temp.value)
			{
				temp=temp.left;
			}
			else if(value>temp.value)
			{
				temp=temp.right;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
}
public class BSTbasics {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println("Root="+bst.root);
		bst.insert(47);
		bst.insert(21);
		bst.insert(76);
		bst.insert(18);
		bst.insert(27);
		bst.insert(52);
		bst.insert(82);
		System.out.println(bst.contains(19));
		System.out.println(bst.root.left.right.value);
	}

}
