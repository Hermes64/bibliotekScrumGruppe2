package filialbiliotek.packages.Model;

public class Members {

    private long memberId;
    private String memberName;
    private String memberLastName;

    public Members(long memberId, String memberName, String memberLastName) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberLastName = memberLastName;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    @Override
    public String toString() {
        return "Members{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberLastName='" + memberLastName + '\'' +
                '}';
    }
}
