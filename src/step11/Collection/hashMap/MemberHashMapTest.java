package step11.Collection.hashMap;

public class MemberHashMapTest {

    public static void main(String[] args) {
        MemberHashMap manager = new MemberHashMap();

        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(300, "Park");
        Member memberPark2 = new Member(300, "Park2");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);

        manager.showAllMember();

        manager.removeMember(200);
        manager.showAllMember();

        //키값이 Integer고 Integer에는 equals와 hashCode가 구현되어 있기 때문에
        //중복값은 출력하지 않는다.
    }
}
