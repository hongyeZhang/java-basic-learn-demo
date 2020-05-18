package com.zhq.picture.demo.dto;

/**
 * @author : ZHQ
 * @date : 2019/11/27
 */
public class ReceiveMessageBody {
    private String answerType;
    private String answerContentType;
    private String answer;
    private float score;
    private String items;
    private String module;

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getAnswerContentType() {
        return answerContentType;
    }

    public void setAnswerContentType(String answerContentType) {
        this.answerContentType = answerContentType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "ReceiveMessageBody{" +
                "answerType='" + answerType + '\'' +
                ", answerContentType='" + answerContentType + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                ", items='" + items + '\'' +
                ", module='" + module + '\'' +
                '}';
    }
}
