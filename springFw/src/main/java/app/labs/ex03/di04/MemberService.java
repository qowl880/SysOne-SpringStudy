package app.labs.ex03.di04;

import org.springframework.stereotype.Service;

@Service
public class MemberService implements MemberServiceImpl{

	@Override
	public Member getMemberInfo() {
		Member member = new Member();
		member.setMemberId("user1");
		member.setName("배지원");
		member.setAge(28);
		member.setEmail("user1@naver.com");
		return member;
	}
	
}
