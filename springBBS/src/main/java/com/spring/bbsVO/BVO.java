package com.spring.bbsVO;

public class BVO { //TODO 後でmvc_bbsテーブルのフィールドに変更
  String bNo;
  String bName;
  String bSubject;
  String bContent;
  String bDate;
  int bHit;
  int bGroup;
  int bStep;
  int bIndent;

  public BVO() {}

  public BVO(
      String bNo,
      String bName,
      String bSubject,
      String bContent,
      String bDate,
      int bHit,
      int bGroup,
      int bStep,
      int bIndent) {
    this.bNo = bNo;
    this.bName = bName;
    this.bSubject = bSubject;
    this.bContent = bContent;
    this.bDate = bDate;
    this.bHit = bHit;
    this.bGroup = bGroup;
    this.bStep = bStep;
    this.bIndent = bIndent;
  }

  public String getbNo() {
    return bNo;
  }

  public void setbNo(String bNo) {
    this.bNo = bNo;
  }

  public String getbName() {
    return bName;
  }

  public void setbName(String bName) {
    this.bName = bName;
  }

  public String getbSubject() {
    return bSubject;
  }

  public void setbSubject(String bSubject) {
    this.bSubject = bSubject;
  }

  public String getbContent() {
    return bContent;
  }

  public void setbContent(String bContent) {
    this.bContent = bContent;
  }

  public String getbDate() {
    return bDate;
  }

  public void setbDate(String bDate) {
    this.bDate = bDate;
  }

  public int getbHit() {
    return bHit;
  }

  public void setbHit(int bHit) {
    this.bHit = bHit;
  }

  public int getbGroup() {
    return bGroup;
  }

  public void setbGroup(int bGroup) {
    this.bGroup = bGroup;
  }

  public int getbStep() {
    return bStep;
  }

  public void setbStep(int bStep) {
    this.bStep = bStep;
  }

  public int getbIndent() {
    return bIndent;
  }

  public void setbIndent(int bIndent) {
    this.bIndent = bIndent;
  }
}