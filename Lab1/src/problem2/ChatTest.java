package problem2;

import java.util.Scanner;

public class ChatTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chat oopFall = new Chat("OOP Fall", new Member(new Account("Teacher")));
		System.out.println(oopFall.getChatName());
		for(int i = 0; i < 10; i++) {
			Member newMember = new Member(new Account(sc.next()));
			System.out.println(oopFall.addMember(newMember));
			if(i < 5) {
				System.out.println(oopFall.setAdmin(newMember));
			}
		}
		System.out.println("\nthere are " + oopFall.getNumberOfAdmins() + " admins");
		System.out.println("there are " + oopFall.getNumberOfMembers() + " members");
		System.out.println(oopFall.getMemberList());
		
		System.out.println(oopFall.removeMember(sc.next()));
		
		System.out.println(oopFall.getMemberList());
		
		oopFall.setDescription("OOP Fall chat\n");
		System.out.println(oopFall.getChatDescription());
		
		sc.close();
	}
}
