package daisy.blogsearch.domains.user.domain;

public enum Gender {

    F("female", "여성"),
    M("male", "남성"),
    U("unknown", "미상");

    private String gender;

    private String korean;

    Gender(String gender, String korean) {
        this.gender = gender;
        this.korean = korean;
    }


    ///
    public static Gender findByName(String gender) {
        return Gender.valueOf(gender);
    }

}
