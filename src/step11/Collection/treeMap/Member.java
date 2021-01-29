package step11.Collection.treeMap;

public class Member {

    private int memberId;
    private String memberName;

    public Member(){}

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString(){
        return memberName + "회원님의 아이디는 " + memberId + " 입니다.";
    }


    //memberId가 같은경우 두 값은 논리적으로 같은 값이라는 것을
    // 구현하기 위해 equals와 hashCode를 만들어준다.
    @Override
    public boolean equals(Object o) {

        if(o instanceof Member){

            Member member = (Member)o;

            return (this.memberId == member.memberId);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }
}
