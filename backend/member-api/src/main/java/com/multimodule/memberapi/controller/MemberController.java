package com.multimodule.memberapi.controller;

import com.multimodule.core.dto.IdResponse;
import com.multimodule.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.multimodule.member.dto.MemberRequest;
import com.multimodule.member.dto.MemberResponse;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public IdResponse<UUID> create(@RequestBody final MemberRequest memberRequest) {
        return memberService.createMember(memberRequest);
    }

    @GetMapping
    public List<MemberResponse> getAll() {
        return memberService.getAll();
    }
}
