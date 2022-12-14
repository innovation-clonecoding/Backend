package com.velog.backend.dto.response;

import com.velog.backend.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberInfoResDto {
    private Long memberId;
    private String email;
    private String nickname;
    private String introduction;
    private String profileUrl;
    private String velogTitle;

    public MemberInfoResDto(Member member){
        this.memberId = member.getMemberId();
        this.email = member.getEmail();
        this.nickname = member.getNickname();
        this.introduction = member.getIntroduction();
        this.profileUrl = member.getProfileUrl();
        this.velogTitle = member.getVelogTitle();
    }
}
