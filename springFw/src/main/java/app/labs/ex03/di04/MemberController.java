package app.labs.ex03.di04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.labs.ex03.di03.IHelloService;

@Controller
public class MemberController {
	
	@Autowired
	private final MemberServiceImpl memberService;
	
	public MemberController(MemberServiceImpl memberService) {
		this.memberService = memberService;
	}
	
	public Member info() {
		return memberService.getMemberInfo();
	}
}
