package com.multimodule.member;

import com.multimodule.member.dto.MemberRequest;
import com.multimodule.member.dto.MemberResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemberMapper {

    public Member toEntity(final MemberRequest memberRequest) {
        return Member.builder()
                .name(memberRequest.getName())
                .build();
    }

    public List<MemberResponse> toResponses(final List<Member> members) {
        return members.stream()
                .map(this::toResponse)
                .toList();
    }

    private MemberResponse toResponse(final Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .name(member.getName())
                .build();
    }
}
