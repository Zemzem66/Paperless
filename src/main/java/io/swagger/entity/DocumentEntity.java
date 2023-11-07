package io.swagger.entity;

import lombok.*;
import org.threeten.bp.LocalDateTime;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String content;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "correspondent_id")
    private entityCorrespondent correspondent;

    @ManyToOne
    @JoinColumn(name = "document_type_id")
    private DocumentType documentType;

    @ManyToMany
    private List<entityDocTag> docTags;





}
