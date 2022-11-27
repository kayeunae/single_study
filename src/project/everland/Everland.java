package project.everland;

import java.util.ArrayList;
import java.util.Scanner;

public class Everland {
	
	private static ArrayList<Membership> membershipList = new ArrayList<Membership>();
	private static ArrayList<Adventure> advList = new ArrayList<Adventure>();
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Membership member01 = new Membership("유재석", 710804, 178, 10010);
		Membership member02 = new Membership("하동훈", 910518, 187, 10020);
		Membership member03 = new Membership("박명수", 120308, 116, 10030);
		Membership member04 = new Membership("송은이", 980215, 155, 10040);
		Membership member05 = new Membership("박미선", 100912, 136, 10050);
		
		membershipList.add(member01);
		membershipList.add(member02);
		membershipList.add(member03);
		membershipList.add(member04);
		membershipList.add(member05);
		
		Adventure adv01 = new Adventure("바이킹", "3분 00초");
		Adventure adv02 = new Adventure("후룸라이드", "3분 20초");
		Adventure adv03 = new Adventure("혜성특급", "4분 20초");
		Adventure adv04 = new TAdventure("드라켄", "2분 30초");
		Adventure adv05 = new TAdventure("티익스프레스", "1분 50초");
		Adventure adv06 = new KAdventure("회전목마", "4분 15초");
		Adventure adv07 = new KAdventure("동물열차", "5분 10초");
		
		advList.add(adv01);
		advList.add(adv02);
		advList.add(adv03);
		advList.add(adv04);
		advList.add(adv05);
		advList.add(adv06);
		advList.add(adv07);
		
		boolean run = true;
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1.회원 조회 | 2.놀이기구 목록 | 3.대기등록 | 4.프로그램 종료");
			System.out.println("=================================================");
			System.out.print("선택>>");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				inquiry();
			} else if (num == 2) {
				adventure();
			} else if (num == 3) {
				//waiting
			} else if (num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
		}
	}
	
	//메소드
		//회원 조회
		public static Membership inquiry() {
			System.out.println("===========회원 조회===========");
			System.out.print("이름: ");
			
			String scName = sc.nextLine();
			
			System.out.print("생년월일: ");
			int scBirth = sc.nextInt();
		
			Membership mem = null;
			for(Membership member : membershipList) {
				if(member.getName().equals(scName) && member.getBirth() == scBirth) {
					System.out.println("회원님의 ID는 " + member.getUserID() + " 입니다.");
					mem = member;
					break;
				}
			}
			if(mem == null) {
				System.out.println("일치하는 회원이 없습니다. 다시 입력해 주세요.");
			}
			return mem;
		}
		
		//놀이기구 목록
		public static void adventure()	{
			System.out.println("===========놀이기구 목록===========");
			
			for(Adventure adv : advList) {
				System.out.println(adv.advName + " ::"  + " 소요 시간: " + adv.time + " " + adv.notice());
			}
		}
		
		//대기등록
		public static void waiting() {
			int scID = sc.nextInt();
			
			for(Membership mem : membershipList) {
				if(mem.userID == scID) {
					
				}
			}
		}

}
