package com.api.tech_secure.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "feedbacks")
public class Feedback {
    @EmbeddedId
    private FeedbackKey feedbackId;

    @Lob
    @Column(name = "feedback")
    private String feedback;

    @Column(name = "rating")
    private int rating;

    @Column(name = "feedback_date", nullable = false)
    private LocalDateTime feedbackDate;

    @ManyToOne
    @MapsId("learnerId")
    @JoinColumn(name = "learner_id")
    private User learner;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


}