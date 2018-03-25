package com.mycomp.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
	public static void main(String[] args) {
		int parCount=3;
		ArrayList<String> result=new ArrayList<>();
		int pendingUsage=3,pendingClose=0;
		System.out.println(generateParanthesis("",pendingUsage,pendingClose));
	}

	private static List<String> generateParanthesis( String currCombi, int pendingUsage,
			int pendingClose) {
		if(pendingUsage == 0 ) {
			for(int i=0;i<pendingClose;i++)
				currCombi=currCombi+")";
			List<String> result=new ArrayList<>();
			result.add(currCombi);
			pendingClose=0;
			return result;
		}else if(pendingClose == 0) {
			//currCombi=currCombi+"(";
			return generateParanthesis( currCombi+"(", pendingUsage-1, pendingClose+1);
			
		}else {
			
			List<String> result= generateParanthesis( currCombi+"(", pendingUsage-1, pendingClose+1);
					result.addAll(
					generateParanthesis( currCombi+")", pendingUsage, pendingClose-1));
			return result;
		}
		
	}
}
