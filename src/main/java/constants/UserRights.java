package constants;

public enum UserRights {
    NORMAL("normal"),
    ADMIN( "admin"),
    OBSERVER("observer");

    public String type;

    UserRights(String type) {
        this.type = type;
    }
}
