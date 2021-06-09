
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Boards {

    @SerializedName("totalPerMember")
    @Expose
    private TotalPerMember totalPerMember;

    public TotalPerMember getTotalPerMember() {
        return totalPerMember;
    }

    public void setTotalPerMember(TotalPerMember totalPerMember) {
        this.totalPerMember = totalPerMember;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Boards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Boards) == false) {
            return false;
        }
        Boards rhs = ((Boards) other);
        return ((this.totalPerMember == rhs.totalPerMember)||((this.totalPerMember!= null)&&this.totalPerMember.equals(rhs.totalPerMember)));
    }

}
