package com.api.tech_secure.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "creator_id", nullable = false)
    private User createdBy;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Module> modules;

    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private Test test;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Enroll> enrolls;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}