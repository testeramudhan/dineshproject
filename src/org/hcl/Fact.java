package org.hcl;

public class Fact {
	public static void main(String[] args) {
		String s="Hello";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			r=r+c;
		}
		System.out.println(r);	
	}
	 

}
