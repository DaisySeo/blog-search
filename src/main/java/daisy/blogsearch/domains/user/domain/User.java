package daisy.blogsearch.domains.user.domain;

public class User {

    private Long userSeq;       // 일련번호

    private String nickName;    // 닉네임

    private Gender gender;      // 성별 (추후 추천 군집 사용)

    private int ageGroup;       // 연령대 (추후 추천 군집 사용)

    public User(String nickName, Gender gender, int ageGroup) {
        this.nickName = nickName;
        this.gender = gender;
        this.ageGroup = ageGroup;
    }


    ///
    // 신규 유저 생성
    public static User create(String nickName, String gender, int age) {
        return new User(nickName, Gender.findByName(gender), calculateAgeGroup(age));
    }

    // 닉네임 변경
    public User changeNickname(String newNickname) {
        this.nickName = newNickname;
        return this;
    }

    private static int calculateAgeGroup(int age) {
        return (age / 10) * 10;
    }

}
