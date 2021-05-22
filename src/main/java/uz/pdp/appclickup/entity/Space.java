package uz.pdp.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickup.entity.enums.AccessType;
import uz.pdp.appclickup.entity.template.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Space extends AbstractEntity {

    private String name;

    private String color;

    @ManyToOne
    private Workspace workspace;

    private String initialLetter;

    @ManyToOne
    private Icon icon;

    @ManyToOne
    private Attachment avatar;

    @ManyToOne
    private User owner;

    @Enumerated(EnumType.STRING)
    private AccessType accessType;
}
