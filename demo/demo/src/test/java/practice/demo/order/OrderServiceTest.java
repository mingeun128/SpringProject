package practice.demo.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.demo.member.Grade;
import practice.demo.member.Member;
import practice.demo.member.MemberService;
import practice.demo.member.MemberServiceImpl;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "mem A", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
