package com.plaid.client.response;

import java.util.List;

public final class MfaSelection {
  private String question;
  private List<String> answers;

  public String getQuestion() {
    return question;
  }

  public List<String> getAnswers() {
    return answers;
  }
}
