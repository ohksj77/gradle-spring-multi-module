package com.multimodule.member;

import com.multimodule.member.dto.MemberRequest;
import com.multimodule.member.dto.MemberResponse;
import com.multimodule.core.dto.IdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public IdResponse<UUID> createMember(MemberRequest memberRequest) {
        final Member member = memberRepository.save(memberMapper.toEntity(memberRequest));
        return new IdResponse<>(member.getId());
    }

    public List<MemberResponse> getAll() {
        return memberMapper.toResponses(memberRepository.findAll());
    }
}
