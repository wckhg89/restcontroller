package com.zumgu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zumgu.LocalDateTimeConverter;
import org.hibernate.annotations.Where;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 강홍구 on 2016-12-10.
 */

@Entity
public class Question {

    @Id
    @GeneratedValue
    @JsonProperty
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_question_writer"))
    @JsonProperty
    private User writer;

    @Column(length = 100, nullable = false)
    @JsonProperty
    private String title;

    @Column(nullable = false)
    @Lob
    @JsonProperty
    private String contents;
    // LocalDateTime

    @Convert(converter = LocalDateTimeConverter.class)
    @JsonProperty
    private DateTime createDate = DateTime.now();

    @OneToMany(mappedBy="question")
    @Where(clause = "deleted = false")
    @OrderBy("id ASC")
    @JsonIgnore
    private List<Answer> answers;

    private boolean deleted;

    public void setId(Long id) {
        this.id = id;
    }

    public void writeBy(User writer) {
        this.writer = writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public java.sql.Timestamp getTimestampCreateDate () {
        if (createDate == null) {
            return null;
        }

        return new java.sql.Timestamp(createDate.getMillis());
    }

    /*public String getFormattedCreateDate() {
        if (createDate == null) {
            return "";
        }
        return DateTimeFormat.forPattern("yyyy.MM.dd HH:mm:ss").print(createDate);
    }*/

    public boolean isSameWriter(User loginUser) {
        System.out.println("writer : " + writer);
        return this.writer.equals(loginUser);
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", writer=" + writer + ", title=" + title + ", contents=" + contents + "]";
    }
}
