package step11.Collection.set;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet manager = new MemberHashSet();

        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(300, "Park");
        Member memberPark2 = new Member(300, "Park2");


        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);
        /*이렇게 중복된 값이 들어가도 출력이 된다.
          이전 HashSetTest에서는 String으로
          중복되는 값은 출력되지 않았었다.
          근데 여기서는 왜 출력되냐면
          String에서는 논리적으로 같은값이라는것이 구현되어있지만
          Member에서는 둘이 논리적으로 같은값이라는 것을
          구현하지 않았기때문에 다른 값이라고 인식.
          그래서 출력하게 되는것이다.

          이것을 구현하기 위해서는 Member클래스에서
          equals와 hashCode를 만들어서 처리해준다.
        */

        manager.showAllMember();

        /*manager.removeMember(100);
        manager.showAllMember();*/
    }
}
