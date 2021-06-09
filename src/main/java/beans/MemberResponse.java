
package beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class MemberResponse {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("bio")
    @Expose
    private String bio;

    @SerializedName("username")
    @Expose
    private String username;

    @SerializedName("fullName")
    @Expose
    private String fullName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(MemberResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("id");
//        sb.append('=');
//        sb.append(((this.id == null)?"<null>":this.id));
//        sb.append(',');
//        sb.append("bio");
//        sb.append('=');
//        sb.append(((this.bio == null)?"<null>":this.bio));
//        sb.append(',');
//        sb.append("bioData");
//        sb.append('=');
//        sb.append(((this.bioData == null)?"<null>":this.bioData));
//        sb.append(',');
//        sb.append("confirmed");
//        sb.append('=');
//        sb.append(((this.confirmed == null)?"<null>":this.confirmed));
//        sb.append(',');
//        sb.append("memberType");
//        sb.append('=');
//        sb.append(((this.memberType == null)?"<null>":this.memberType));
//        sb.append(',');
//        sb.append("username");
//        sb.append('=');
//        sb.append(((this.username == null)?"<null>":this.username));
//        sb.append(',');
//        sb.append("aaId");
//        sb.append('=');
//        sb.append(((this.aaId == null)?"<null>":this.aaId));
//        sb.append(',');
//        sb.append("activityBlocked");
//        sb.append('=');
//        sb.append(((this.activityBlocked == null)?"<null>":this.activityBlocked));
//        sb.append(',');
//        sb.append("avatarHash");
//        sb.append('=');
//        sb.append(((this.avatarHash == null)?"<null>":this.avatarHash));
//        sb.append(',');
//        sb.append("avatarUrl");
//        sb.append('=');
//        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
//        sb.append(',');
//        sb.append("fullName");
//        sb.append('=');
//        sb.append(((this.fullName == null)?"<null>":this.fullName));
//        sb.append(',');
//        sb.append("idEnterprise");
//        sb.append('=');
//        sb.append(((this.idEnterprise == null)?"<null>":this.idEnterprise));
//        sb.append(',');
//        sb.append("idEnterprisesDeactivated");
//        sb.append('=');
//        sb.append(((this.idEnterprisesDeactivated == null)?"<null>":this.idEnterprisesDeactivated));
//        sb.append(',');
//        sb.append("idMemberReferrer");
//        sb.append('=');
//        sb.append(((this.idMemberReferrer == null)?"<null>":this.idMemberReferrer));
//        sb.append(',');
//        sb.append("idPremOrgsAdmin");
//        sb.append('=');
//        sb.append(((this.idPremOrgsAdmin == null)?"<null>":this.idPremOrgsAdmin));
//        sb.append(',');
//        sb.append("initials");
//        sb.append('=');
//        sb.append(((this.initials == null)?"<null>":this.initials));
//        sb.append(',');
//        sb.append("nonPublic");
//        sb.append('=');
//        sb.append(((this.nonPublic == null)?"<null>":this.nonPublic));
//        sb.append(',');
//        sb.append("nonPublicAvailable");
//        sb.append('=');
//        sb.append(((this.nonPublicAvailable == null)?"<null>":this.nonPublicAvailable));
//        sb.append(',');
//        sb.append("products");
//        sb.append('=');
//        sb.append(((this.products == null)?"<null>":this.products));
//        sb.append(',');
//        sb.append("url");
//        sb.append('=');
//        sb.append(((this.url == null)?"<null>":this.url));
//        sb.append(',');
//        sb.append("status");
//        sb.append('=');
//        sb.append(((this.status == null)?"<null>":this.status));
//        sb.append(',');
//        sb.append("aaBlockSyncUntil");
//        sb.append('=');
//        sb.append(((this.aaBlockSyncUntil == null)?"<null>":this.aaBlockSyncUntil));
//        sb.append(',');
//        sb.append("aaEmail");
//        sb.append('=');
//        sb.append(((this.aaEmail == null)?"<null>":this.aaEmail));
//        sb.append(',');
//        sb.append("aaEnrolledDate");
//        sb.append('=');
//        sb.append(((this.aaEnrolledDate == null)?"<null>":this.aaEnrolledDate));
//        sb.append(',');
//        sb.append("avatarSource");
//        sb.append('=');
//        sb.append(((this.avatarSource == null)?"<null>":this.avatarSource));
//        sb.append(',');
//        sb.append("credentialsRemovedCount");
//        sb.append('=');
//        sb.append(((this.credentialsRemovedCount == null)?"<null>":this.credentialsRemovedCount));
//        sb.append(',');
//        sb.append("domainClaimed");
//        sb.append('=');
//        sb.append(((this.domainClaimed == null)?"<null>":this.domainClaimed));
//        sb.append(',');
//        sb.append("email");
//        sb.append('=');
//        sb.append(((this.email == null)?"<null>":this.email));
//        sb.append(',');
//        sb.append("gravatarHash");
//        sb.append('=');
//        sb.append(((this.gravatarHash == null)?"<null>":this.gravatarHash));
//        sb.append(',');
//        sb.append("idBoards");
//        sb.append('=');
//        sb.append(((this.idBoards == null)?"<null>":this.idBoards));
//        sb.append(',');
//        sb.append("idOrganizations");
//        sb.append('=');
//        sb.append(((this.idOrganizations == null)?"<null>":this.idOrganizations));
//        sb.append(',');
//        sb.append("idEnterprisesAdmin");
//        sb.append('=');
//        sb.append(((this.idEnterprisesAdmin == null)?"<null>":this.idEnterprisesAdmin));
//        sb.append(',');
//        sb.append("loginTypes");
//        sb.append('=');
//        sb.append(((this.loginTypes == null)?"<null>":this.loginTypes));
//        sb.append(',');
//        sb.append("marketingOptIn");
//        sb.append('=');
//        sb.append(((this.marketingOptIn == null)?"<null>":this.marketingOptIn));
//        sb.append(',');
//        sb.append("messagesDismissed");
//        sb.append('=');
//        sb.append(((this.messagesDismissed == null)?"<null>":this.messagesDismissed));
//        sb.append(',');
//        sb.append("oneTimeMessagesDismissed");
//        sb.append('=');
//        sb.append(((this.oneTimeMessagesDismissed == null)?"<null>":this.oneTimeMessagesDismissed));
//        sb.append(',');
//        sb.append("prefs");
//        sb.append('=');
//        sb.append(((this.prefs == null)?"<null>":this.prefs));
//        sb.append(',');
//        sb.append("trophies");
//        sb.append('=');
//        sb.append(((this.trophies == null)?"<null>":this.trophies));
//        sb.append(',');
//        sb.append("uploadedAvatarHash");
//        sb.append('=');
//        sb.append(((this.uploadedAvatarHash == null)?"<null>":this.uploadedAvatarHash));
//        sb.append(',');
//        sb.append("uploadedAvatarUrl");
//        sb.append('=');
//        sb.append(((this.uploadedAvatarUrl == null)?"<null>":this.uploadedAvatarUrl));
//        sb.append(',');
//        sb.append("premiumFeatures");
//        sb.append('=');
//        sb.append(((this.premiumFeatures == null)?"<null>":this.premiumFeatures));
//        sb.append(',');
//        sb.append("isAaMastered");
//        sb.append('=');
//        sb.append(((this.isAaMastered == null)?"<null>":this.isAaMastered));
//        sb.append(',');
//        sb.append("ixUpdate");
//        sb.append('=');
//        sb.append(((this.ixUpdate == null)?"<null>":this.ixUpdate));
//        sb.append(',');
//        sb.append("limits");
//        sb.append('=');
//        sb.append(((this.limits == null)?"<null>":this.limits));
//        sb.append(',');
//        if (sb.charAt((sb.length()- 1)) == ',') {
//            sb.setCharAt((sb.length()- 1), ']');
//        } else {
//            sb.append(']');
//        }
//        return sb.toString();
//    }
//
//    @Override
//    public int hashCode() {
//        int result = 1;
//        result = ((result* 31)+((this.idEnterprisesDeactivated == null)? 0 :this.idEnterprisesDeactivated.hashCode()));
//        result = ((result* 31)+((this.aaEnrolledDate == null)? 0 :this.aaEnrolledDate.hashCode()));
//        result = ((result* 31)+((this.idMemberReferrer == null)? 0 :this.idMemberReferrer.hashCode()));
//        result = ((result* 31)+((this.bio == null)? 0 :this.bio.hashCode()));
//        result = ((result* 31)+((this.avatarSource == null)? 0 :this.avatarSource.hashCode()));
//        result = ((result* 31)+((this.nonPublic == null)? 0 :this.nonPublic.hashCode()));
//        result = ((result* 31)+((this.confirmed == null)? 0 :this.confirmed.hashCode()));
//        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
//        result = ((result* 31)+((this.activityBlocked == null)? 0 :this.activityBlocked.hashCode()));
//        result = ((result* 31)+((this.aaBlockSyncUntil == null)? 0 :this.aaBlockSyncUntil.hashCode()));
//        result = ((result* 31)+((this.uploadedAvatarHash == null)? 0 :this.uploadedAvatarHash.hashCode()));
//        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
//        result = ((result* 31)+((this.idOrganizations == null)? 0 :this.idOrganizations.hashCode()));
//        result = ((result* 31)+((this.aaEmail == null)? 0 :this.aaEmail.hashCode()));
//        result = ((result* 31)+((this.trophies == null)? 0 :this.trophies.hashCode()));
//        result = ((result* 31)+((this.bioData == null)? 0 :this.bioData.hashCode()));
//        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
//        result = ((result* 31)+((this.idEnterprisesAdmin == null)? 0 :this.idEnterprisesAdmin.hashCode()));
//        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
//        result = ((result* 31)+((this.uploadedAvatarUrl == null)? 0 :this.uploadedAvatarUrl.hashCode()));
//        result = ((result* 31)+((this.messagesDismissed == null)? 0 :this.messagesDismissed.hashCode()));
//        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
//        result = ((result* 31)+((this.initials == null)? 0 :this.initials.hashCode()));
//        result = ((result* 31)+((this.domainClaimed == null)? 0 :this.domainClaimed.hashCode()));
//        result = ((result* 31)+((this.oneTimeMessagesDismissed == null)? 0 :this.oneTimeMessagesDismissed.hashCode()));
//        result = ((result* 31)+((this.nonPublicAvailable == null)? 0 :this.nonPublicAvailable.hashCode()));
//        result = ((result* 31)+((this.credentialsRemovedCount == null)? 0 :this.credentialsRemovedCount.hashCode()));
//        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
//        result = ((result* 31)+((this.premiumFeatures == null)? 0 :this.premiumFeatures.hashCode()));
//        result = ((result* 31)+((this.loginTypes == null)? 0 :this.loginTypes.hashCode()));
//        result = ((result* 31)+((this.idPremOrgsAdmin == null)? 0 :this.idPremOrgsAdmin.hashCode()));
//        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
//        result = ((result* 31)+((this.marketingOptIn == null)? 0 :this.marketingOptIn.hashCode()));
//        result = ((result* 31)+((this.prefs == null)? 0 :this.prefs.hashCode()));
//        result = ((result* 31)+((this.gravatarHash == null)? 0 :this.gravatarHash.hashCode()));
//        result = ((result* 31)+((this.ixUpdate == null)? 0 :this.ixUpdate.hashCode()));
//        result = ((result* 31)+((this.avatarHash == null)? 0 :this.avatarHash.hashCode()));
//        result = ((result* 31)+((this.aaId == null)? 0 :this.aaId.hashCode()));
//        result = ((result* 31)+((this.idEnterprise == null)? 0 :this.idEnterprise.hashCode()));
//        result = ((result* 31)+((this.isAaMastered == null)? 0 :this.isAaMastered.hashCode()));
//        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
//        result = ((result* 31)+((this.idBoards == null)? 0 :this.idBoards.hashCode()));
//        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
//        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof MemberResponse) == false) {
//            return false;
//        }
//        MemberResponse rhs = ((MemberResponse) other);
//        return (((((((((((((((((((((((((((((((((((((((((((((this.idEnterprisesDeactivated == rhs.idEnterprisesDeactivated)||((this.idEnterprisesDeactivated!= null)&&this.idEnterprisesDeactivated.equals(rhs.idEnterprisesDeactivated)))&&((this.aaEnrolledDate == rhs.aaEnrolledDate)||((this.aaEnrolledDate!= null)&&this.aaEnrolledDate.equals(rhs.aaEnrolledDate))))&&((this.idMemberReferrer == rhs.idMemberReferrer)||((this.idMemberReferrer!= null)&&this.idMemberReferrer.equals(rhs.idMemberReferrer))))&&((this.bio == rhs.bio)||((this.bio!= null)&&this.bio.equals(rhs.bio))))&&((this.avatarSource == rhs.avatarSource)||((this.avatarSource!= null)&&this.avatarSource.equals(rhs.avatarSource))))&&((this.nonPublic == rhs.nonPublic)||((this.nonPublic!= null)&&this.nonPublic.equals(rhs.nonPublic))))&&((this.confirmed == rhs.confirmed)||((this.confirmed!= null)&&this.confirmed.equals(rhs.confirmed))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.activityBlocked == rhs.activityBlocked)||((this.activityBlocked!= null)&&this.activityBlocked.equals(rhs.activityBlocked))))&&((this.aaBlockSyncUntil == rhs.aaBlockSyncUntil)||((this.aaBlockSyncUntil!= null)&&this.aaBlockSyncUntil.equals(rhs.aaBlockSyncUntil))))&&((this.uploadedAvatarHash == rhs.uploadedAvatarHash)||((this.uploadedAvatarHash!= null)&&this.uploadedAvatarHash.equals(rhs.uploadedAvatarHash))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.idOrganizations == rhs.idOrganizations)||((this.idOrganizations!= null)&&this.idOrganizations.equals(rhs.idOrganizations))))&&((this.aaEmail == rhs.aaEmail)||((this.aaEmail!= null)&&this.aaEmail.equals(rhs.aaEmail))))&&((this.trophies == rhs.trophies)||((this.trophies!= null)&&this.trophies.equals(rhs.trophies))))&&((this.bioData == rhs.bioData)||((this.bioData!= null)&&this.bioData.equals(rhs.bioData))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.idEnterprisesAdmin == rhs.idEnterprisesAdmin)||((this.idEnterprisesAdmin!= null)&&this.idEnterprisesAdmin.equals(rhs.idEnterprisesAdmin))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.uploadedAvatarUrl == rhs.uploadedAvatarUrl)||((this.uploadedAvatarUrl!= null)&&this.uploadedAvatarUrl.equals(rhs.uploadedAvatarUrl))))&&((this.messagesDismissed == rhs.messagesDismissed)||((this.messagesDismissed!= null)&&this.messagesDismissed.equals(rhs.messagesDismissed))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.initials == rhs.initials)||((this.initials!= null)&&this.initials.equals(rhs.initials))))&&((this.domainClaimed == rhs.domainClaimed)||((this.domainClaimed!= null)&&this.domainClaimed.equals(rhs.domainClaimed))))&&((this.oneTimeMessagesDismissed == rhs.oneTimeMessagesDismissed)||((this.oneTimeMessagesDismissed!= null)&&this.oneTimeMessagesDismissed.equals(rhs.oneTimeMessagesDismissed))))&&((this.nonPublicAvailable == rhs.nonPublicAvailable)||((this.nonPublicAvailable!= null)&&this.nonPublicAvailable.equals(rhs.nonPublicAvailable))))&&((this.credentialsRemovedCount == rhs.credentialsRemovedCount)||((this.credentialsRemovedCount!= null)&&this.credentialsRemovedCount.equals(rhs.credentialsRemovedCount))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.premiumFeatures == rhs.premiumFeatures)||((this.premiumFeatures!= null)&&this.premiumFeatures.equals(rhs.premiumFeatures))))&&((this.loginTypes == rhs.loginTypes)||((this.loginTypes!= null)&&this.loginTypes.equals(rhs.loginTypes))))&&((this.idPremOrgsAdmin == rhs.idPremOrgsAdmin)||((this.idPremOrgsAdmin!= null)&&this.idPremOrgsAdmin.equals(rhs.idPremOrgsAdmin))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.marketingOptIn == rhs.marketingOptIn)||((this.marketingOptIn!= null)&&this.marketingOptIn.equals(rhs.marketingOptIn))))&&((this.prefs == rhs.prefs)||((this.prefs!= null)&&this.prefs.equals(rhs.prefs))))&&((this.gravatarHash == rhs.gravatarHash)||((this.gravatarHash!= null)&&this.gravatarHash.equals(rhs.gravatarHash))))&&((this.ixUpdate == rhs.ixUpdate)||((this.ixUpdate!= null)&&this.ixUpdate.equals(rhs.ixUpdate))))&&((this.avatarHash == rhs.avatarHash)||((this.avatarHash!= null)&&this.avatarHash.equals(rhs.avatarHash))))&&((this.aaId == rhs.aaId)||((this.aaId!= null)&&this.aaId.equals(rhs.aaId))))&&((this.idEnterprise == rhs.idEnterprise)||((this.idEnterprise!= null)&&this.idEnterprise.equals(rhs.idEnterprise))))&&((this.isAaMastered == rhs.isAaMastered)||((this.isAaMastered!= null)&&this.isAaMastered.equals(rhs.isAaMastered))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.idBoards == rhs.idBoards)||((this.idBoards!= null)&&this.idBoards.equals(rhs.idBoards))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
//    }

}
