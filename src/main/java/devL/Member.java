package devL;


/**
 * Member 클래스
 * @author joel
 * @since 2017. 9. 18
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일        수정자           수정내용
 *  -------       --------    ---------------------------
 *   2017. 9. 18    joel          최초 생성
 *
 * Copyright (C) 2017 by devL  All right reserved.
 * </pre>
 */
public class Member {

  /** 회원일련번호 */
  private int memberNo;
  /** 회원 아이디 */
  private String memberId;
  /** 회원 비밀번호 */
  private String password;
  /** 회원 이메일 */
  private String email;
  /** 회원 이름 */
  private String name;
  /** 회원 생년월일 */
  private String birthday;
  /** 회원 전화번호 */
  private String phoneNo;
  /** 회원 성별*/
  private String gender;
  /** 회원 직업*/
  private String job;
  /** 회원 국적*/
  private String nation;
  /** 회원 기본주소*/
  private String baseAddress;
  /** 회원 상세주소*/
  private String detailAddress;
  /** 회원 우편번호*/
  private String zip;
  /** 회원 사진경로*/
  private String path;
  /** 회원 상태*/
  private String memberStatus;
  /** 회원 가입일*/
  private String joinDate;
  /** 회원 승인일*/
  private String admisionDate;
  /** 회원 탈퇴일*/
  private String leaveDate;
  /** 회원 마지막접속일*/
  private String lastDate;
  /** 비고 */
  private String remarks;
  
  public int getMemberNo() {
    return memberNo;
  }
  public void setMemberNo(int memberNo) {
    this.memberNo = memberNo;
  }
  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getBirthday() {
    return birthday;
  }
  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
  public String getPhoneNo() {
    return phoneNo;
  }
  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }
  public String getNation() {
    return nation;
  }
  public void setNation(String nation) {
    this.nation = nation;
  }
  public String getBaseAddress() {
    return baseAddress;
  }
  public void setBaseAddress(String baseAddress) {
    this.baseAddress = baseAddress;
  }
  public String getDetailAddress() {
    return detailAddress;
  }
  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }
  public String getMemberStatus() {
    return memberStatus;
  }
  public void setMemberStatus(String memberStatus) {
    this.memberStatus = memberStatus;
  }
  public String getJoinDate() {
    return joinDate;
  }
  public void setJoinDate(String joinDate) {
    this.joinDate = joinDate;
  }
  public String getAdmisionDate() {
    return admisionDate;
  }
  public void setAdmisionDate(String admisionDate) {
    this.admisionDate = admisionDate;
  }
  public String getLeaveDate() {
    return leaveDate;
  }
  public void setLeaveDate(String leaveDate) {
    this.leaveDate = leaveDate;
  }
  public String getLastDate() {
    return lastDate;
  }
  public void setLastDate(String lastDate) {
    this.lastDate = lastDate;
  }
  public String getRemarks() {
    return remarks;
  }
  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }
  
}
