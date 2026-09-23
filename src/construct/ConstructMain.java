package construct;

public class ConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 12, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 20, 80);


        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 점수: " + member.grade);
        }


    }
}
