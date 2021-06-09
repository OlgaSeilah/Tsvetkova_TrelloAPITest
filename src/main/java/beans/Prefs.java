
package beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prefs {

    @SerializedName("privacy")
    @Expose
    private Privacy privacy;
    @SerializedName("sendSummaries")
    @Expose
    private Boolean sendSummaries;
    @SerializedName("minutesBetweenSummaries")
    @Expose
    private Integer minutesBetweenSummaries;
    @SerializedName("minutesBeforeDeadlineToNotify")
    @Expose
    private Integer minutesBeforeDeadlineToNotify;
    @SerializedName("colorBlind")
    @Expose
    private Boolean colorBlind;
    @SerializedName("locale")
    @Expose
    private String locale;

    public Privacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    public Boolean getSendSummaries() {
        return sendSummaries;
    }

    public void setSendSummaries(Boolean sendSummaries) {
        this.sendSummaries = sendSummaries;
    }

    public Integer getMinutesBetweenSummaries() {
        return minutesBetweenSummaries;
    }

    public void setMinutesBetweenSummaries(Integer minutesBetweenSummaries) {
        this.minutesBetweenSummaries = minutesBetweenSummaries;
    }

    public Integer getMinutesBeforeDeadlineToNotify() {
        return minutesBeforeDeadlineToNotify;
    }

    public void setMinutesBeforeDeadlineToNotify(Integer minutesBeforeDeadlineToNotify) {
        this.minutesBeforeDeadlineToNotify = minutesBeforeDeadlineToNotify;
    }

    public Boolean getColorBlind() {
        return colorBlind;
    }

    public void setColorBlind(Boolean colorBlind) {
        this.colorBlind = colorBlind;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Prefs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("privacy");
        sb.append('=');
        sb.append(((this.privacy == null)?"<null>":this.privacy));
        sb.append(',');
        sb.append("sendSummaries");
        sb.append('=');
        sb.append(((this.sendSummaries == null)?"<null>":this.sendSummaries));
        sb.append(',');
        sb.append("minutesBetweenSummaries");
        sb.append('=');
        sb.append(((this.minutesBetweenSummaries == null)?"<null>":this.minutesBetweenSummaries));
        sb.append(',');
        sb.append("minutesBeforeDeadlineToNotify");
        sb.append('=');
        sb.append(((this.minutesBeforeDeadlineToNotify == null)?"<null>":this.minutesBeforeDeadlineToNotify));
        sb.append(',');
        sb.append("colorBlind");
        sb.append('=');
        sb.append(((this.colorBlind == null)?"<null>":this.colorBlind));
        sb.append(',');
        sb.append("locale");
        sb.append('=');
        sb.append(((this.locale == null)?"<null>":this.locale));
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
        result = ((result* 31)+((this.colorBlind == null)? 0 :this.colorBlind.hashCode()));
        result = ((result* 31)+((this.minutesBetweenSummaries == null)? 0 :this.minutesBetweenSummaries.hashCode()));
        result = ((result* 31)+((this.sendSummaries == null)? 0 :this.sendSummaries.hashCode()));
        result = ((result* 31)+((this.minutesBeforeDeadlineToNotify == null)? 0 :this.minutesBeforeDeadlineToNotify.hashCode()));
        result = ((result* 31)+((this.privacy == null)? 0 :this.privacy.hashCode()));
        result = ((result* 31)+((this.locale == null)? 0 :this.locale.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Prefs) == false) {
            return false;
        }
        Prefs rhs = ((Prefs) other);
        return (((((((this.colorBlind == rhs.colorBlind)||((this.colorBlind!= null)&&this.colorBlind.equals(rhs.colorBlind)))&&((this.minutesBetweenSummaries == rhs.minutesBetweenSummaries)||((this.minutesBetweenSummaries!= null)&&this.minutesBetweenSummaries.equals(rhs.minutesBetweenSummaries))))&&((this.sendSummaries == rhs.sendSummaries)||((this.sendSummaries!= null)&&this.sendSummaries.equals(rhs.sendSummaries))))&&((this.minutesBeforeDeadlineToNotify == rhs.minutesBeforeDeadlineToNotify)||((this.minutesBeforeDeadlineToNotify!= null)&&this.minutesBeforeDeadlineToNotify.equals(rhs.minutesBeforeDeadlineToNotify))))&&((this.privacy == rhs.privacy)||((this.privacy!= null)&&this.privacy.equals(rhs.privacy))))&&((this.locale == rhs.locale)||((this.locale!= null)&&this.locale.equals(rhs.locale))));
    }

}
