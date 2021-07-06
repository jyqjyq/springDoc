package com.jyq.demo.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x, TreeNode left, TreeNode right) {
		this.val = x;
		this.left = left;
		this.right = right;
	}

	public static void main(String[] args) {
//		TreeNode t7 = new TreeNode(7,null,null);
//		TreeNode t6 = new TreeNode(6,null,null);
//		TreeNode t5 = new TreeNode(5,t6,t7);
//		TreeNode t4 = new TreeNode(4,null,null);
//		TreeNode t3 = new TreeNode(3,null,null);
//		TreeNode t2 = new TreeNode(2,t4,t5);
//		TreeNode t1 = new TreeNode(1,t2,t3);
//		prePrint(t1);
		Integer [] ints = new Integer[]{2,3,4,5,64,2,11};
		Integer[] integers = twoSum(ints, 4);
		System.out.println(Arrays.toString(integers));
	}

	private static Integer[] twoSum(Integer[] ints, int i) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int j = 0; j < ints.length; j++) {
			if(map.containsKey(i-ints[j])){
				return new Integer[]{map.get(i-ints[j]),j};
			}
			map.put(ints[j],j);
		}
		return new Integer[]{0};
	}

	private static void prePrint(TreeNode t1) {
		Stack<TreeNode> stack = new Stack<>();
		stack.add(t1);
		while(!stack.isEmpty()){

			TreeNode pop = stack.pop();

			if(pop!=null){
				System.out.println(pop.val);
				stack.push(pop.right);
				stack.push(pop.left);
			}

		}
	}


}
