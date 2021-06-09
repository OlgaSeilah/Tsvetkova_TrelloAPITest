
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessagesDismissed {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("lastDismissed")
    @Expose
    private String lastDismissed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLastDismissed() {
        return lastDismissed;
    }

    public void setLastDismissed(String lastDismissed) {
        this.lastDismissed = lastDismissed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MessagesDismissed.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("lastDismissed");
        sb.append('=');
        sb.append(((this.lastDismissed == null)?"<null>":this.lastDismissed));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lastDismissed == null)? 0 :this.lastDismissed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessagesDismissed) == false) {
            return false;
        }
        MessagesDismissed rhs = ((MessagesDismissed) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lastDismissed == rhs.lastDismissed)||((this.lastDismissed!= null)&&this.lastDismissed.equals(rhs.lastDismissed))));
    }

}
