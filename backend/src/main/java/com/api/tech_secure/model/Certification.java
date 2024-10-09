package com.api.tech_secure.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "certifications")
public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "certification_name", nullable = false)
    private String certificationName;

    @Column(name = "certification_description", nullable = false)
    private String certificationDescription;

    @Column(name = "issued_date", nullable = false)
    private LocalDate issuedDate;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "learner_id", referencedColumnName = "learner_id", nullable = false),
            @JoinColumn(name = "course_id", referencedColumnName = "course_id", nullable = false)
    })
    private Enroll enroll;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}