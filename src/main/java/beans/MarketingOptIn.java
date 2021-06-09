
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketingOptIn {

    @SerializedName("optedIn")
    @Expose
    private Boolean optedIn;
    @SerializedName("date")
    @Expose
    private String date;

    public Boolean getOptedIn() {
        return optedIn;
    }

    public void setOptedIn(Boolean optedIn) {
        this.optedIn = optedIn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MarketingOptIn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("optedIn");
        sb.append('=');
        sb.append(((this.optedIn == null)?"<null>":this.optedIn));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.optedIn == null)? 0 :this.optedIn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketingOptIn) == false) {
            return false;
        }
        MarketingOptIn rhs = ((MarketingOptIn) other);
        return (((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.optedIn == rhs.optedIn)||((this.optedIn!= null)&&this.optedIn.equals(rhs.optedIn))));
    }

}
