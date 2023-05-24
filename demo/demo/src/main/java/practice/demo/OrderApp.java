package practice.demo;

import practice.demo.member.Grade;
import practice.demo.member.Member;
import practice.demo.member.MemberService;
import practice.demo.member.MemberServiceImpl;
import practice.demo.order.Order;
import practice.demo.order.OrderService;
import practice.demo.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "mem A", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
