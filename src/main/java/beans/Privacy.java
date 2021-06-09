
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Privacy {

    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("avatar")
    @Expose
    private String avatar;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Privacy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("avatar");
        sb.append('=');
        sb.append(((this.avatar == null)?"<null>":this.avatar));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.avatar == null)? 0 :this.avatar.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Privacy) == false) {
            return false;
        }
        Privacy rhs = ((Privacy) other);
        return (((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName)))&&((this.avatar == rhs.avatar)||((this.avatar!= null)&&this.avatar.equals(rhs.avatar))));
    }

}
