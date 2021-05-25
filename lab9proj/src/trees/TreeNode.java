

package trees;

import java.util.*;


class TreeNode<T> 
{
	private T					data;
	private TreeNode<T>				parent;
	private ArrayList<TreeNode<T>>		children;
	
	
	TreeNode(T data)
	{
		this.data = data;
		children = new ArrayList<>();
	}
	
	
	T getData()
	{
		return data;
	}
	
	
	void addChild(TreeNode<T> childNode)
	{
		children.add(childNode);
		childNode.parent = this;
	
	}
	
	
	// Searches subtree at this node for a node
	// with the given name. Returns the node, or null if not found.
	TreeNode<T> getNodeWithName(String targetName)
	{
		if (this.data.equals(targetName))
			return this;
				
		for (TreeNode<T> child: children)
		{	
			if(child.getNodeWithName(targetName)!= null)
				return child.getNodeWithName(targetName);	
		}
		
		// Not found anywhere.
		return null;
	}
	
	// Returns a list of ancestors of this TreeNode, starting with this node’s parent and
	// ending with the root. Order is from recent to ancient.
	ArrayList<TreeNode<T>> collectAncestorsToList()
	{
		ArrayList<TreeNode<T>> ancestors = new ArrayList<>();
		TreeNode<T> anc = this.parent;
		while(anc != null) {
			ancestors.add(anc);
			anc = anc.parent;
		}
		return ancestors;
	}
	
	
	public String toString()
	{
		return toStringWithIndent("");
	}
	
	
	private String toStringWithIndent(String indent)
	{
		String s = indent + data + "\n";
		indent += "  ";
		for (TreeNode<T> childNode: children)
			s += childNode.toStringWithIndent(indent);
		return s;
	}
}
