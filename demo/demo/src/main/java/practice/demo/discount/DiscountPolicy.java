package practice.demo.discount;

import practice.demo.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
