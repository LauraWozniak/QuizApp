package de.htwberlin.webtech.persistence;

import javax.persistence.*;

@Entity(name = "flashcards")
public class FlashcardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "subject", nullable = false)
    private  String subject;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "answer", nullable = false)
    private String answer;

    public FlashcardEntity(long id, String subject, String question, String answer) {
        this.id = id;
        this.subject = subject;
        this.question = question;
        this.answer = answer;
    }

    protected FlashcardEntity() {
    }

    public long getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
