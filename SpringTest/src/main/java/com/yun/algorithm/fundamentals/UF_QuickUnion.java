package com.yun.algorithm.fundamentals;

public class UF_QuickUnion extends UF{
	private int[] id;
	private int count;
	
	public UF_QuickUnion(int N)
	{
		super(N);
	}
	
	public int find(int p)
	{
		while(p != id[p]) p = id[p];
		return p;
	}
	
	public void union(int p, int q)
	{
		int i = find(p);
		int j = find(q);
		if(i == j) return;
		
		id[i] = j;
		
		count--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
