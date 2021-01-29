package step13.exception.test;

public class IdFormatTest {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IdFormatException {

        if(userId == null){
            throw new IdFormatException("아이디는 null 일 수 없습니다.");
        }else if(userId.length() < 8 || userId.length() > 20){
            throw new IdFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
        }

        this.userId = userId;
    }

    public static void main(String[] args) {

        IdFormatTest idTest = new IdFormatTest();

        String myId = null;

        try {
            idTest.setUserId(myId);
        } catch (IdFormatException e) {
            System.out.println(e);
            //IdFormatException : 아이디는 null일수 없습니다. 가 출력된다.
        }

        myId = "123456";
        try {
            idTest.setUserId(myId);
        } catch (IdFormatException e) {
            System.out.println(e);
            //IdFormatException : 아이디는 8자 이상 20자 이하로 쓰세요. 가 출력된다.
        }
    }
}
