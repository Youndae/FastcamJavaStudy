package step11.Collection.treeSet;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member(300, "Lee");
        Member memberKim = new Member(100, "Kim");
        Member memberPark = new Member(200, "Park");



        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);


        manager.showAllMember();
        /*
            그냥 실행하게 되면 ClassCastException이 발생한다.
            Member cannot be cast to java.lang.Comparable
            이라고 하는데
            Comparable을 cast할 수 없다는 것이다.
            기존 TreeSetTest에서는 String클래스에 Comparable이 구현되어있으니
            문제가 없었지만 Member에서는 구현이 되어있지 않기 때문에
            오류가 발생한다.

            addMember할 때 오류가 발생했는데 트리셋에 member를 넣으려고 했는데
            member를 어떻게 비교해야 할지 모르겠다는 것이다.
            비교하는 방법을 구현해야 되는 상황이다.

            Member에서 implements Comparable<Member>를 해서
            Comparable을 정의해주면 된다.

         */

    }
}
