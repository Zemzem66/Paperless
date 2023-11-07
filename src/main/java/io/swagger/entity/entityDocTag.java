package io.swagger.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class entityDocTag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String slug;
    private String name;
    private String color;
    private String match;
    private long matchingAlgorithm;
    private boolean isInsensitive;
    private boolean isInboxTag;
    private long documentCount;

    @ManyToMany
    private List<DocumentEntity> documentEntities;
}
