package practice.demo;

import practice.demo.discount.FixDiscountPolicy;
import practice.demo.member.MemberService;
import practice.demo.member.MemberServiceImpl;
import practice.demo.member.MemoryMemberRepository;
import practice.demo.order.OrderService;
import practice.demo.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
