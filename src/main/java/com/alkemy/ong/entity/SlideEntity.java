package com.alkemy.ong.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "slides")
@SQLDelete(sql = "UPDATE users SET soft_delete = true WHERE id = ?")
@Where(clause = "soft_delete = false")
public class SlideEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String imageUrl;

    @Column(columnDefinition = "text")
    private String text;

    @Column(name = "slideOrder")
    private String slideOrder;

    @Column(name = "soft_delete")
    private boolean softDelete = false;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "organizationId",insertable = false,updatable = false)
    private OrganizationEntity organizationEntity;

    @Column(name = "organizationId",nullable = false)
    private String organizationId;

}
