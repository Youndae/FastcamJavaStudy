package step11.Collection.treeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap(){
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member){
        treeMap.put(member.getMemberId(), member);
        //key가 member.getMemberId
        //value는 member다.
    }

    public boolean removeMember(int memberId){
        if(treeMap.containsKey(memberId)){
            //키값에 해당하는 값이 있는지를 체크하는것.

            treeMap.remove(memberId);
            return true;
        }
        System.out.println("회원번호가 없습니다.");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = treeMap.keySet().iterator();
        //모든 set객체를 반환한다.
        //key객체를 반환하는데 key는 중복되지 않으므로 set타입으로 반환한다.

        /*hashMap.values().iterator();*/
        //모든 value를 반환하는데 중복될 수 있기 때문에
        //collection으로 반환된다.

        while(ir.hasNext()){
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();

    }
}
