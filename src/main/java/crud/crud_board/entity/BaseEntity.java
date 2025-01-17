package crud.crud_board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false) // 수정한다면 관여하지 않겠다는 뜻.
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(insertable = false) // 삽입된다면 관여하지 않겠다는 뜻.
    private LocalDateTime updatedTime;
}
