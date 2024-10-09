package com.api.tech_secure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class FeedbackKey implements Serializable {
    @Column(name = "learner_id")
    private Long learnerId;
    @Column(name = "course_id")
    private Long courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeedbackKey that = (FeedbackKey) o;

        if (!Objects.equals(learnerId, that.learnerId)) return false;
        return Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(learnerId, courseId);
    }
}