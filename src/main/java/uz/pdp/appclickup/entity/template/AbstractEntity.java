package uz.pdp.appclickup.entity.template;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import uz.pdp.appclickup.entity.User;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @CreationTimestamp
    private Timestamp createdAt;


    @UpdateTimestamp
    private Timestamp updatedAt;


    @Column(updatable = false)
    @CreatedBy
    private UUID createdBy;


    @LastModifiedBy
    private UUID updatedBy;


}
