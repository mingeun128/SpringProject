package practice.demo;

import practice.demo.member.Grade;
import practice.demo.member.Member;
import practice.demo.member.MemberService;
import practice.demo.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new mem = "+ member.getName());
        System.out.println("find mem = "+ findMember.getName());
    }
}
