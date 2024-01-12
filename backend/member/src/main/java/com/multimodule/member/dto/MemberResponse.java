package com.multimodule.member.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record MemberResponse (UUID id,String name) {}
