package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_005
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = 1000 - Integer.parseInt(br.readLine());
		
		int [] charges = new int[4];
		
		int [] coins = new int[] {500, 100, 50, 10};
		
		for(int i=0; i<4; i++)
		{
			charges[i] = money / coins[i];
			money -= charges[i] * coins[i];
		}
		
		for(int coin : charges)
			System.out.print(coin+" ");
		
	}
}
