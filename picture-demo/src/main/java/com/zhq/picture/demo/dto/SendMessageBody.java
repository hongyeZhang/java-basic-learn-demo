package com.zhq.picture.demo.dto;

/**
 * @author : ZHQ
 * @date : 2019/11/27
 */
public class SendMessageBody {
    private String userId;
    private String question;
    private String channel;
    private String questionType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return "SendMessageBody{" +
                "userId='" + userId + '\'' +
                ", question='" + question + '\'' +
                ", channel='" + channel + '\'' +
                ", questionType='" + questionType + '\'' +
                '}';
    }
}
