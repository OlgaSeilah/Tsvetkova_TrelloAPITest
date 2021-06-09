
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalPerMember {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("disableAt")
    @Expose
    private Integer disableAt;
    @SerializedName("warnAt")
    @Expose
    private Integer warnAt;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDisableAt() {
        return disableAt;
    }

    public void setDisableAt(Integer disableAt) {
        this.disableAt = disableAt;
    }

    public Integer getWarnAt() {
        return warnAt;
    }

    public void setWarnAt(Integer warnAt) {
        this.warnAt = warnAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TotalPerMember.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("disableAt");
        sb.append('=');
        sb.append(((this.disableAt == null)?"<null>":this.disableAt));
        sb.append(',');
        sb.append("warnAt");
        sb.append('=');
        sb.append(((this.warnAt == null)?"<null>":this.warnAt));
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
        result = ((result* 31)+((this.disableAt == null)? 0 :this.disableAt.hashCode()));
        result = ((result* 31)+((this.warnAt == null)? 0 :this.warnAt.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalPerMember) == false) {
            return false;
        }
        TotalPerMember rhs = ((TotalPerMember) other);
        return ((((this.disableAt == rhs.disableAt)||((this.disableAt!= null)&&this.disableAt.equals(rhs.disableAt)))&&((this.warnAt == rhs.warnAt)||((this.warnAt!= null)&&this.warnAt.equals(rhs.warnAt))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
