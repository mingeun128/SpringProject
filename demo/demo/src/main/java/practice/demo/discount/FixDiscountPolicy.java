package practice.demo.discount;

import practice.demo.member.Grade;
import practice.demo.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        else{
            return 0;
        }
    }
}
