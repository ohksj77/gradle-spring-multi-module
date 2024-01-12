package com.multimodule.member;

import com.multimodule.core.audit.AuditListener;
import com.multimodule.core.audit.Auditable;
import com.multimodule.core.audit.BaseTime;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.UUID;

@Getter
@Entity
@SQLDelete(sql = "UPDATE member SET deleted_at = now() WHERE id = ?")
@Where(clause = "deleted_at is null")
@EntityListeners(AuditListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member implements Auditable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id = UUID.randomUUID();

    private String name;

    @Setter
    @Embedded
    private BaseTime baseTime;

    @Builder
    public Member(final String name) {
        this.name = name;
    }
}
