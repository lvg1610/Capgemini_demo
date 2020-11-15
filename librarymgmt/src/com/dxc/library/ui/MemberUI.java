package com.dxc.library.ui;
import java.util.*;
import com.dxc.library.dto.Member;
import com.dxc.library.dao.MemberDAO;
import com.dxc.library.dao.DBConnection;
public class MemberUI 
{
    private static MemberDAO mdao = new MemberDAO();
    public static String insertMemberDetails(Scanner sc)
    {
    	Member m = new Member();
    	System.out.print("Enter Member Id :- ");
    	m.setMemberId(sc.nextInt());
    	sc.nextLine();
    	System.out.print("Enter Member Name :- ");
    	m.setName(sc.nextLine());
    	System.out.print("Enter Member Aadhar Number :- ");
    	m.setAadharNo(sc.nextLine());
    	System.out.print("Enter Member Phone Number :- ");
    	m.setPhone(sc.nextLong());
    	sc.nextLine();
    	System.out.print("Enter Member Email Id :- ");
    	m.setEmailId(sc.nextLine());
    	System.out.println();
    	return mdao.insertMemberDetails(m) ? "Member Inserted Sucessfully" : "Member Insertion Failed" ;
    }
    public static String deleteMemberDetails(Scanner sc)
    {
    	System.out.print("Enter Member Id to Delete :- ");
    	int memberId=sc.nextInt();
    	sc.nextLine();
    	return mdao.deleteMemberDetails(memberId) ? "Member Deleted Successfully" : "Member Deletion Failed" ;
    }
    public static String modifyMemberDetails(Scanner sc)
    {
    	Member m = new Member();
    	System.out.print("Enter Member Id To Modify :-");
    	m.setMemberId(sc.nextInt());
    	sc.nextLine();
    	System.out.print("Enter Member new Phone Number :- ");
    	m.setPhone(sc.nextLong());
    	sc.nextLine();
    	System.out.print("Enter Member new Email Id :- ");
    	m.setEmailId(sc.nextLine());
    	return mdao.modifyMemberDetails(m) ? "Member Details Modified " : "Member Details Modification Failed" ;
    }
    public static void showMemberDetails(Scanner sc)
    {
    	System.out.println("Enter Member Id to view Details :-");
    	int memberId = sc.nextInt();
    	sc.nextLine();
    	Member m = mdao.getMemberDetails(memberId);
    	if(m!=null) System.out.println(m);
    	else System.out.println("Member with Id "+memberId+" Does Not Exist");
    }
    public static void showAllMembersDetails()
    {
    	for(Member m : mdao.getAllMembersDetails())
    		System.out.println(m);
    }
}
