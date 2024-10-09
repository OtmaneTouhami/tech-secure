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
@Table(name = "enrolls")
public class Enroll {
    @EmbeddedId
    private EnrollKey id;

    @Column(name = "enroll_date", nullable = false)
    private LocalDate enrollDate;

    @Column(name = "completion_date")
    private LocalDate completionDate;

    @Column(name = "last_accessed")
    private LocalDateTime lastAccessed;

    @Column(name = "progress")
    private int progress;

    @Column(name = "status")
    private Status status;

    @Column(name = "score")
    private int score;

    @ManyToOne
    @MapsId("learnerId")
    @JoinColumn(name = "learner_id")
    private User learner;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToOne(mappedBy = "enroll", cascade = CascadeType.ALL)
    private Certification certification;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    public enum Status {
        IN_PROGRESS("In Progress"),
        COMPLETED("Completed"),
        NOT_STARTED("Not Started"),
        FAILED("Failed"),
        PASSED("Passed");

        private final String status;

        Status(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }

}