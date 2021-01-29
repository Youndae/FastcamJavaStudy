package step11.Collection.treeMap;

public class MemberTreeMapTest {

    public static void main(String[] args) {
        MemberTreeMap manager = new MemberTreeMap();

        Member memberPark = new Member(300, "Park");
        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark2 = new Member(400, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);

        manager.showAllMember();

        manager.removeMember(200);
        manager.showAllMember();

        //아이디를 기준으로 오름차순 정렬되어 출력된다.
        //treeMap의 키값이 INteger이기 때문인데
        //Integer에는 Comparable이 구현되어 있어서 정렬된다.
        //만약 Integer가 아닌 다른 클래스라고 한다면
        //treeSet에서 처럼 직접 구현해야 한다.
    }
}
