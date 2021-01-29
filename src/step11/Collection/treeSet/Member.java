package step11.Collection.treeSet;

public class Member implements Comparable<Member>{
    /*
        Comparable말고 다른 방법으로는
        Comparator가 있다.
        Comparator<Member>로 작성하면 되고
        그럼 오버라이드가

        @Override
        public int compare(Member o1, Member o2){
          return 0;
        }
        이렇게 된다.

        작성은
        @Override
        public int compare(Member o1, Member o2){

          return (o1.memberId - o2.memberId);
        }

        여기서는 o1이 this에 해당하는 값이고
        o2가 매개변수가 된다.
        마찬가지로 양수가 반환이 되면 오름차순이 된다.

        Comparator는 MemberTreeSet의 TreeSet 생성자에
        constructor로 new Member()를 써줘야 한다.

     */
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

    @Override
    public int compareTo(Member o) {
        //여기서는 this와 넘어온 매개변수 o와 비교하면 된다.

        return (this.memberId - o.memberId);
        //내 값이 더 클때 양수를 반환하게 되면 오름차순으로 정렬이 된다.
        //만약 반대로 내림차순으로 정렬을 하고 싶다면 뒤에 *(-1)을 추가하면 된다.
        //이름으로 정렬하고 싶다면
        //this.memberName.compareTo(member.getMemberName());
        //이렇게 쓴다.
        //String은 compareTo 가 구현이 되어있기 때문에
        //그냥 사용하면 된다.
    }
}
