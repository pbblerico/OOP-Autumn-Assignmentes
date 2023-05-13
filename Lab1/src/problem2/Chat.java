package problem2;

import java.util.Vector;

public class Chat {
	static String chatName;
	static String chatDescription;
	final static private int maxNumberOfAdmins = 3;
	final static private int maxNumberOfMembers = 10;
	static private int totalNumberOfMessages;
	static Vector <Member> memberList;
	static Vector <Member> admins;
	
	static{
		memberList = new Vector <Member>();
		admins = new Vector <Member>();
	}
	
	public Chat() {}
	
	public Chat(String chatName, Member member) {
		Chat.chatName = chatName;
		member.setRole(Role.CREATOR);
		admins.add(member);
		memberList.add(member);
	}
	void writeMessage() {
		totalNumberOfMessages++;
	}
	String getChatName() {
		return Chat.chatName;
	}
	int getTotalNumberOfMessages() {
		return Chat.totalNumberOfMessages;
	}
	int getNumberOfMembers() {
		return Chat.memberList.size();
	}
	int getNumberOfAdmins() {
		return Chat.admins.size();
	}
	String getChatDescription() {
		return Chat.chatDescription;
	}
	Member memberIfExists(String username) {
		for(Member member: memberList) 
			if(member.getAccount().getUsername().equals(username)) 
				return member;
		return null;		
	}
	
	String setAdmin(String username) {
		if(Chat.admins.size() < maxNumberOfAdmins) {
			Member member = memberIfExists(username);
			if(member != null) {
				member.setRole(Role.ADMIN);
				admins.add(member);
				return "member " + username + " is an ADMIN now";
			}
			else return "there's no member with this tag";
		}
		return "All ADMIN positions are unavailable";
	}
	
	String setAdmin(Member member) {
		return setAdmin(member.getAccount().getUsername());
	}
	
	String setRole(Role role, Member member) {
		if(role == member.getRole()) return member.getAccount().getUsername() + "already has this role";
		if(role == Role.ADMIN) return setAdmin(member);
		if(role == Role.CREATOR) return "You can't change role to CREATOR";
		if(member.getRole() == Role.CREATOR) return "You can't change CREATOR's role";
		if(member.getRole() == Role.ADMIN && role != member.getRole()) {
			Chat.admins.remove(member);
		}
		member.setRole(role);
		return member.getAccount().getUsername() + " role changed to " + role; 
	}
	
	
	public String getMemberList() {
		String members = "";
		for(Member member: memberList) {
			members += member.toString() + '\n';
		}
		return members;
	}
	
	public String getAdminList() {
		String adminList = "";
		for(Member admin: admins) {
			adminList += admin.toString() + '\n';
		}
		return adminList;
	}
	
	public String addMember(Member member) {
		if(memberList.size() < maxNumberOfMembers) {
			memberList.add(member);
			return member.getAccount().getUsername() + " was added to the chat";
		}
		return "chat is full";
	}
	
	public String removeMember(Member member) {
		for(Member m: memberList) {
			if(m == member) {
				memberList.remove(member);
				return member.getAccount().getUsername() + " was removed from chat";
			}
		}
		return "there were no such member";
	}
	
	public String removeMember(String username) {
		return removeMember(memberIfExists(username));
	}
	
	public String setChatName(String chatName) {
		Chat.chatName = chatName;
		return chatName + " set as chat name";
	}
	public String setDescription(String description) {
		Chat.chatDescription = description;
		return "chat description was changed";
	}
}
