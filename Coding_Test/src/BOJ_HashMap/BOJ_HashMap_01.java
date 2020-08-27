// Date : 2020.08.27
// Title : 걸그룹 마스터 준석이
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sotring
package BOJ_HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class BOJ_HashMap_01
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<String,String> keyGirlName = new HashMap<>();
		HashMap<String,ArrayList<String>> keyGroupName = new HashMap<>();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<n; i++)	// 해쉬맵 초기화
		{
			String team = sc.next();
			int member = sc.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			//System.out.println(member);
			for(int j=0; j<member; j++)
			{
				String name = sc.next();
				keyGirlName.put(name, team);
				list.add(name);
			}
			Collections.sort(list);
			keyGroupName.put(team,list);
		}
		
		for(int i=0; i<m; i++)
		{
			String tempName = sc.next();
			int tempNum = sc.nextInt();
			if(tempNum==1)
			{
				sb.append(keyGirlName.get(tempName)+"\n");
			}
			else
			{
				ArrayList<String> tList = keyGroupName.get(tempName);
				for(int k=0; k<tList.size(); k++)
					sb.append(tList.get(k)+"\n");
			}
		}
		
		System.out.println(sb.toString());
		sc.close();
		
	}
}