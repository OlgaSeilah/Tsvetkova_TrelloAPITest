
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Limits {

    @SerializedName("boards")
    @Expose
    private Boards boards;
    @SerializedName("orgs")
    @Expose
    private Orgs orgs;

    public Boards getBoards() {
        return boards;
    }

    public void setBoards(Boards boards) {
        this.boards = boards;
    }

    public Orgs getOrgs() {
        return orgs;
    }

    public void setOrgs(Orgs orgs) {
        this.orgs = orgs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("boards");
        sb.append('=');
        sb.append(((this.boards == null)?"<null>":this.boards));
        sb.append(',');
        sb.append("orgs");
        sb.append('=');
        sb.append(((this.orgs == null)?"<null>":this.orgs));
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
        result = ((result* 31)+((this.boards == null)? 0 :this.boards.hashCode()));
        result = ((result* 31)+((this.orgs == null)? 0 :this.orgs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limits) == false) {
            return false;
        }
        Limits rhs = ((Limits) other);
        return (((this.boards == rhs.boards)||((this.boards!= null)&&this.boards.equals(rhs.boards)))&&((this.orgs == rhs.orgs)||((this.orgs!= null)&&this.orgs.equals(rhs.orgs))));
    }

}
