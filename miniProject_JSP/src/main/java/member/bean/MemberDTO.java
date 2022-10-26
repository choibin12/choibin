package member.bean;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Data//getter setter, tostring,canEqual,equals
@Getter
@Setter
@RequiredArgsConstructor
public class MemberDTO {
	private String name;
	private String id;
	private String gender;
	private String pwd;
	private String tel1;
	private String tel2;
	private String tel3;
	private String email1;
	private String email2;
	private String zipcode;
	private String addr1;
	private String addr2;
	
}
