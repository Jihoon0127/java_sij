package controller;

import java.util.ArrayList;

import model.DAO;
import model.ItemVO;

public class AllSelectItem {

	public void rangeAll(int select) {
		if (select == 1) {

		} else if (select == 2) {

		} else if (select == 3) {

		} else {
			System.out.println("잘못된 선택입니다.");
		}
	}

	public void AllWeapon() {
		DAO dao = new DAO();
		
		ArrayList<itemVO> bowList = dao.BowcheckAll();
		ArrayList<ItemVO> SwordList = dao.SwordcheckAll();
		ArrayList<ItemVO> itemList = new ArrayList<>();
		
		itemList.addAll(SwordList);
		itemList.addAll(bowList);
		
		System.out.println("num\tname\tpower\tdurability");
		 System.out.println("----------------------");
		 for(ItemVO item:itemList) {
			 System.out.println(item.getItemNum()+"\t");
			 System.out.println(item.getName()+ "\t");
			 System.out.println(item.getAttackPower( + "\t"));
			 try {
			 System.out.println(((BowVO)bowObject).getDurability());
			 }catch(Exception classCasException) {
			 }
			 System.out.println();

	public void allSword() {
		DAO dao = new DAO();
		ArrayList<ItemVO> Sword_db = dao.SwordcheckAll();
		System.out.println("num\tname\tpower");
		System.out.println("----------------------");
		for (ItemVO SwordObject : Sword_db) {
			System.out.println(SwordObject.getItemNum() + "\t");
			System.out.println(SwordObject.getName() + "\t");
			System.out.println(SwordObject.getAttackPower(+"\t"));
		}

	}

	public void allBow() {
		DAO dao = new DAO();
		ArrayList<ItemVO> Sword_db = dao.BowcheckAll();
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("----------------------");
		for (ItemVO SwordObject : bow_db) {
			System.out.println(bowObject.getItemNum() + "\t");
			System.out.println(bowObject.getName() + "\t");
			System.out.println(bowObject.getAttackPower(+"\t"));
			System.out.println(((BowVO) bowObject).getDurability());
		}
	}
}
