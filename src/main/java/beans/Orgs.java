
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Orgs {

    @SerializedName("totalPerMember")
    @Expose
    private TotalPerMember__1 totalPerMember;

    public TotalPerMember__1 getTotalPerMember() {
        return totalPerMember;
    }

    public void setTotalPerMember(TotalPerMember__1 totalPerMember) {
        this.totalPerMember = totalPerMember;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Orgs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalPerMember");
        sb.append('=');
        sb.append(((this.totalPerMember == null)?"<null>":this.totalPerMember));
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
        result = ((result* 31)+((this.totalPerMember == null)? 0 :this.totalPerMember.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Orgs) == false) {
            return false;
        }
        Orgs rhs = ((Orgs) other);
        return ((this.totalPerMember == rhs.totalPerMember)||((this.totalPerMember!= null)&&this.totalPerMember.equals(rhs.totalPerMember)));
    }

}
