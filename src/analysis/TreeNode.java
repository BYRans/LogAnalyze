package analysis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TreeNode implements Comparable<TreeNode> {

	private String name; // 鑺傜偣鍚嶇О
	private int count; // 璁℃暟
	private TreeNode parent; // 鐖惰妭鐐�
	private List<TreeNode> children; // 瀛愯妭鐐�
	private TreeNode nextHomonym; // 涓嬩竴涓悓鍚嶈妭鐐�

	public TreeNode(String name, List<TreeNode> children) {
		this.name = name;
		this.children = children;
	}

	public TreeNode() {

	}

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void addChild(TreeNode child) {
		if (this.getChildren() == null) {
			List<TreeNode> list = new ArrayList<TreeNode>();
			list.add(child);
			this.setChildren(list);
		} else {
			this.getChildren().add(child);
		}
	}

	public TreeNode findChild(String name) {
		List<TreeNode> children = this.getChildren();
		if (children != null) {
			for (TreeNode child : children) {
				if (child.getName().equals(name)) {
					return child;
				}
			}
		}
		return null;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	public void printChildrenName() {
		List<TreeNode> children = this.getChildren();
		if (children != null) {
			for (TreeNode child : children) {
				System.out.print(child.getName() + " ");
			}
		} else {
			System.out.print("null");
		}
	}

	public TreeNode getNextHomonym() {
		return nextHomonym;
	}

	public void setNextHomonym(TreeNode nextHomonym) {
		this.nextHomonym = nextHomonym;
	}

	public void countIncrement(int n) {
		this.count += n;
	}

	@Override
	public int compareTo(TreeNode arg0) {
		// TODO Auto-generated method stub
		int count0 = arg0.getCount();
		// 璺熼粯璁ょ殑姣旇緝澶у皬鐩稿弽锛屽鑷磋皟鐢ˋrrays.sort()鏃舵槸鎸夐檷搴忔帓鍒�
		return count0 - this.count;
	}
}
