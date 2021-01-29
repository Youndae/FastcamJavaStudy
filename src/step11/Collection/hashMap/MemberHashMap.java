package step11.Collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member);
        //key가 member.getMemberId
        //value는 member다.
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            //키값에 해당하는 값이 있는지를 체크하는것.

            hashMap.remove(memberId);
            return true;
        }
        System.out.println("회원번호가 없습니다.");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        //모든 set객체를 반환한다.
        //key객체를 반환하는데 key는 중복되지 않으므로 set타입으로 반환한다.

        /*hashMap.values().iterator();*/
        //모든 value를 반환하는데 중복될 수 있기 때문에
        //collection으로 반환된다.

        while(ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();

    }
}
