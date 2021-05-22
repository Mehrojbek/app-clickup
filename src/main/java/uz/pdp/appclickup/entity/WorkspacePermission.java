package uz.pdp.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickup.entity.enums.Permission;
import uz.pdp.appclickup.entity.template.AbstractEntity;

import javax.persistence.*;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class WorkspacePermission extends AbstractEntity {

    @ManyToOne
    private WorkspaceRole workspaceRole;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Permission> permission;

}
