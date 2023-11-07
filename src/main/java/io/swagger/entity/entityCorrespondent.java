package io.swagger.entity;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.threeten.bp.OffsetDateTime;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class entityCorrespondent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long matchingAlgorithm;
    private boolean isInsensitive;
    private long documentCount;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastCorrespondence;

    @OneToMany(mappedBy = "correspondent")
    private List<DocumentEntity> documentEntities;

}
