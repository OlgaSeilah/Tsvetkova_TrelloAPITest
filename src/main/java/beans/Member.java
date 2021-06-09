
package beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Member {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("bioData")
    @Expose
    private Object bioData;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("memberType")
    @Expose
    private String memberType;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("aaId")
    @Expose
    private String aaId;
    @SerializedName("activityBlocked")
    @Expose
    private Boolean activityBlocked;
    @SerializedName("avatarHash")
    @Expose
    private Object avatarHash;
    @SerializedName("avatarUrl")
    @Expose
    private Object avatarUrl;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("idEnterprise")
    @Expose
    private Object idEnterprise;
    @SerializedName("idEnterprisesDeactivated")
    @Expose
    private List<Object> idEnterprisesDeactivated = new ArrayList<Object>();
    @SerializedName("idMemberReferrer")
    @Expose
    private Object idMemberReferrer;
    @SerializedName("idPremOrgsAdmin")
    @Expose
    private List<Object> idPremOrgsAdmin = new ArrayList<Object>();
    @SerializedName("initials")
    @Expose
    private String initials;
    @SerializedName("nonPublic")
    @Expose
    private NonPublic nonPublic;
    @SerializedName("nonPublicAvailable")
    @Expose
    private Boolean nonPublicAvailable;
    @SerializedName("products")
    @Expose
    private List<Object> products = new ArrayList<Object>();
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("aaBlockSyncUntil")
    @Expose
    private Object aaBlockSyncUntil;
    @SerializedName("aaEmail")
    @Expose
    private Object aaEmail;
    @SerializedName("aaEnrolledDate")
    @Expose
    private Object aaEnrolledDate;
    @SerializedName("avatarSource")
    @Expose
    private String avatarSource;
    @SerializedName("credentialsRemovedCount")
    @Expose
    private Integer credentialsRemovedCount;
    @SerializedName("domainClaimed")
    @Expose
    private Object domainClaimed;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("gravatarHash")
    @Expose
    private String gravatarHash;
    @SerializedName("idBoards")
    @Expose
    private List<String> idBoards = new ArrayList<String>();
    @SerializedName("idOrganizations")
    @Expose
    private List<String> idOrganizations = new ArrayList<String>();
    @SerializedName("idEnterprisesAdmin")
    @Expose
    private List<Object> idEnterprisesAdmin = new ArrayList<Object>();
    @SerializedName("loginTypes")
    @Expose
    private List<String> loginTypes = new ArrayList<String>();
    @SerializedName("marketingOptIn")
    @Expose
    private MarketingOptIn marketingOptIn;
    @SerializedName("messagesDismissed")
    @Expose
    private List<MessagesDismissed> messagesDismissed = new ArrayList<MessagesDismissed>();
    @SerializedName("oneTimeMessagesDismissed")
    @Expose
    private List<String> oneTimeMessagesDismissed = new ArrayList<String>();
    @SerializedName("prefs")
    @Expose
    private Prefs prefs;
    @SerializedName("trophies")
    @Expose
    private List<Object> trophies = new ArrayList<Object>();
    @SerializedName("uploadedAvatarHash")
    @Expose
    private Object uploadedAvatarHash;
    @SerializedName("uploadedAvatarUrl")
    @Expose
    private Object uploadedAvatarUrl;
    @SerializedName("premiumFeatures")
    @Expose
    private List<Object> premiumFeatures = new ArrayList<Object>();
    @SerializedName("isAaMastered")
    @Expose
    private Boolean isAaMastered;
    @SerializedName("ixUpdate")
    @Expose
    private String ixUpdate;
    @SerializedName("limits")
    @Expose
    private Limits limits;

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

    public Object getBioData() {
        return bioData;
    }

    public void setBioData(Object bioData) {
        this.bioData = bioData;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAaId() {
        return aaId;
    }

    public void setAaId(String aaId) {
        this.aaId = aaId;
    }

    public Boolean getActivityBlocked() {
        return activityBlocked;
    }

    public void setActivityBlocked(Boolean activityBlocked) {
        this.activityBlocked = activityBlocked;
    }

    public Object getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(Object avatarHash) {
        this.avatarHash = avatarHash;
    }

    public Object getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(Object avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Object getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public List<Object> getIdEnterprisesDeactivated() {
        return idEnterprisesDeactivated;
    }

    public void setIdEnterprisesDeactivated(List<Object> idEnterprisesDeactivated) {
        this.idEnterprisesDeactivated = idEnterprisesDeactivated;
    }

    public Object getIdMemberReferrer() {
        return idMemberReferrer;
    }

    public void setIdMemberReferrer(Object idMemberReferrer) {
        this.idMemberReferrer = idMemberReferrer;
    }

    public List<Object> getIdPremOrgsAdmin() {
        return idPremOrgsAdmin;
    }

    public void setIdPremOrgsAdmin(List<Object> idPremOrgsAdmin) {
        this.idPremOrgsAdmin = idPremOrgsAdmin;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public NonPublic getNonPublic() {
        return nonPublic;
    }

    public void setNonPublic(NonPublic nonPublic) {
        this.nonPublic = nonPublic;
    }

    public Boolean getNonPublicAvailable() {
        return nonPublicAvailable;
    }

    public void setNonPublicAvailable(Boolean nonPublicAvailable) {
        this.nonPublicAvailable = nonPublicAvailable;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getAaBlockSyncUntil() {
        return aaBlockSyncUntil;
    }

    public void setAaBlockSyncUntil(Object aaBlockSyncUntil) {
        this.aaBlockSyncUntil = aaBlockSyncUntil;
    }

    public Object getAaEmail() {
        return aaEmail;
    }

    public void setAaEmail(Object aaEmail) {
        this.aaEmail = aaEmail;
    }

    public Object getAaEnrolledDate() {
        return aaEnrolledDate;
    }

    public void setAaEnrolledDate(Object aaEnrolledDate) {
        this.aaEnrolledDate = aaEnrolledDate;
    }

    public String getAvatarSource() {
        return avatarSource;
    }

    public void setAvatarSource(String avatarSource) {
        this.avatarSource = avatarSource;
    }

    public Integer getCredentialsRemovedCount() {
        return credentialsRemovedCount;
    }

    public void setCredentialsRemovedCount(Integer credentialsRemovedCount) {
        this.credentialsRemovedCount = credentialsRemovedCount;
    }

    public Object getDomainClaimed() {
        return domainClaimed;
    }

    public void setDomainClaimed(Object domainClaimed) {
        this.domainClaimed = domainClaimed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGravatarHash() {
        return gravatarHash;
    }

    public void setGravatarHash(String gravatarHash) {
        this.gravatarHash = gravatarHash;
    }

    public List<String> getIdBoards() {
        return idBoards;
    }

    public void setIdBoards(List<String> idBoards) {
        this.idBoards = idBoards;
    }

    public List<String> getIdOrganizations() {
        return idOrganizations;
    }

    public void setIdOrganizations(List<String> idOrganizations) {
        this.idOrganizations = idOrganizations;
    }

    public List<Object> getIdEnterprisesAdmin() {
        return idEnterprisesAdmin;
    }

    public void setIdEnterprisesAdmin(List<Object> idEnterprisesAdmin) {
        this.idEnterprisesAdmin = idEnterprisesAdmin;
    }

    public List<String> getLoginTypes() {
        return loginTypes;
    }

    public void setLoginTypes(List<String> loginTypes) {
        this.loginTypes = loginTypes;
    }

    public MarketingOptIn getMarketingOptIn() {
        return marketingOptIn;
    }

    public void setMarketingOptIn(MarketingOptIn marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    public List<MessagesDismissed> getMessagesDismissed() {
        return messagesDismissed;
    }

    public void setMessagesDismissed(List<MessagesDismissed> messagesDismissed) {
        this.messagesDismissed = messagesDismissed;
    }

    public List<String> getOneTimeMessagesDismissed() {
        return oneTimeMessagesDismissed;
    }

    public void setOneTimeMessagesDismissed(List<String> oneTimeMessagesDismissed) {
        this.oneTimeMessagesDismissed = oneTimeMessagesDismissed;
    }

    public Prefs getPrefs() {
        return prefs;
    }

    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    public List<Object> getTrophies() {
        return trophies;
    }

    public void setTrophies(List<Object> trophies) {
        this.trophies = trophies;
    }

    public Object getUploadedAvatarHash() {
        return uploadedAvatarHash;
    }

    public void setUploadedAvatarHash(Object uploadedAvatarHash) {
        this.uploadedAvatarHash = uploadedAvatarHash;
    }

    public Object getUploadedAvatarUrl() {
        return uploadedAvatarUrl;
    }

    public void setUploadedAvatarUrl(Object uploadedAvatarUrl) {
        this.uploadedAvatarUrl = uploadedAvatarUrl;
    }

    public List<Object> getPremiumFeatures() {
        return premiumFeatures;
    }

    public void setPremiumFeatures(List<Object> premiumFeatures) {
        this.premiumFeatures = premiumFeatures;
    }

    public Boolean getIsAaMastered() {
        return isAaMastered;
    }

    public void setIsAaMastered(Boolean isAaMastered) {
        this.isAaMastered = isAaMastered;
    }

    public String getIxUpdate() {
        return ixUpdate;
    }

    public void setIxUpdate(String ixUpdate) {
        this.ixUpdate = ixUpdate;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Member.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("bioData");
        sb.append('=');
        sb.append(((this.bioData == null)?"<null>":this.bioData));
        sb.append(',');
        sb.append("confirmed");
        sb.append('=');
        sb.append(((this.confirmed == null)?"<null>":this.confirmed));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("aaId");
        sb.append('=');
        sb.append(((this.aaId == null)?"<null>":this.aaId));
        sb.append(',');
        sb.append("activityBlocked");
        sb.append('=');
        sb.append(((this.activityBlocked == null)?"<null>":this.activityBlocked));
        sb.append(',');
        sb.append("avatarHash");
        sb.append('=');
        sb.append(((this.avatarHash == null)?"<null>":this.avatarHash));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("idEnterprise");
        sb.append('=');
        sb.append(((this.idEnterprise == null)?"<null>":this.idEnterprise));
        sb.append(',');
        sb.append("idEnterprisesDeactivated");
        sb.append('=');
        sb.append(((this.idEnterprisesDeactivated == null)?"<null>":this.idEnterprisesDeactivated));
        sb.append(',');
        sb.append("idMemberReferrer");
        sb.append('=');
        sb.append(((this.idMemberReferrer == null)?"<null>":this.idMemberReferrer));
        sb.append(',');
        sb.append("idPremOrgsAdmin");
        sb.append('=');
        sb.append(((this.idPremOrgsAdmin == null)?"<null>":this.idPremOrgsAdmin));
        sb.append(',');
        sb.append("initials");
        sb.append('=');
        sb.append(((this.initials == null)?"<null>":this.initials));
        sb.append(',');
        sb.append("nonPublic");
        sb.append('=');
        sb.append(((this.nonPublic == null)?"<null>":this.nonPublic));
        sb.append(',');
        sb.append("nonPublicAvailable");
        sb.append('=');
        sb.append(((this.nonPublicAvailable == null)?"<null>":this.nonPublicAvailable));
        sb.append(',');
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("aaBlockSyncUntil");
        sb.append('=');
        sb.append(((this.aaBlockSyncUntil == null)?"<null>":this.aaBlockSyncUntil));
        sb.append(',');
        sb.append("aaEmail");
        sb.append('=');
        sb.append(((this.aaEmail == null)?"<null>":this.aaEmail));
        sb.append(',');
        sb.append("aaEnrolledDate");
        sb.append('=');
        sb.append(((this.aaEnrolledDate == null)?"<null>":this.aaEnrolledDate));
        sb.append(',');
        sb.append("avatarSource");
        sb.append('=');
        sb.append(((this.avatarSource == null)?"<null>":this.avatarSource));
        sb.append(',');
        sb.append("credentialsRemovedCount");
        sb.append('=');
        sb.append(((this.credentialsRemovedCount == null)?"<null>":this.credentialsRemovedCount));
        sb.append(',');
        sb.append("domainClaimed");
        sb.append('=');
        sb.append(((this.domainClaimed == null)?"<null>":this.domainClaimed));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("gravatarHash");
        sb.append('=');
        sb.append(((this.gravatarHash == null)?"<null>":this.gravatarHash));
        sb.append(',');
        sb.append("idBoards");
        sb.append('=');
        sb.append(((this.idBoards == null)?"<null>":this.idBoards));
        sb.append(',');
        sb.append("idOrganizations");
        sb.append('=');
        sb.append(((this.idOrganizations == null)?"<null>":this.idOrganizations));
        sb.append(',');
        sb.append("idEnterprisesAdmin");
        sb.append('=');
        sb.append(((this.idEnterprisesAdmin == null)?"<null>":this.idEnterprisesAdmin));
        sb.append(',');
        sb.append("loginTypes");
        sb.append('=');
        sb.append(((this.loginTypes == null)?"<null>":this.loginTypes));
        sb.append(',');
        sb.append("marketingOptIn");
        sb.append('=');
        sb.append(((this.marketingOptIn == null)?"<null>":this.marketingOptIn));
        sb.append(',');
        sb.append("messagesDismissed");
        sb.append('=');
        sb.append(((this.messagesDismissed == null)?"<null>":this.messagesDismissed));
        sb.append(',');
        sb.append("oneTimeMessagesDismissed");
        sb.append('=');
        sb.append(((this.oneTimeMessagesDismissed == null)?"<null>":this.oneTimeMessagesDismissed));
        sb.append(',');
        sb.append("prefs");
        sb.append('=');
        sb.append(((this.prefs == null)?"<null>":this.prefs));
        sb.append(',');
        sb.append("trophies");
        sb.append('=');
        sb.append(((this.trophies == null)?"<null>":this.trophies));
        sb.append(',');
        sb.append("uploadedAvatarHash");
        sb.append('=');
        sb.append(((this.uploadedAvatarHash == null)?"<null>":this.uploadedAvatarHash));
        sb.append(',');
        sb.append("uploadedAvatarUrl");
        sb.append('=');
        sb.append(((this.uploadedAvatarUrl == null)?"<null>":this.uploadedAvatarUrl));
        sb.append(',');
        sb.append("premiumFeatures");
        sb.append('=');
        sb.append(((this.premiumFeatures == null)?"<null>":this.premiumFeatures));
        sb.append(',');
        sb.append("isAaMastered");
        sb.append('=');
        sb.append(((this.isAaMastered == null)?"<null>":this.isAaMastered));
        sb.append(',');
        sb.append("ixUpdate");
        sb.append('=');
        sb.append(((this.ixUpdate == null)?"<null>":this.ixUpdate));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
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
        result = ((result* 31)+((this.idEnterprisesDeactivated == null)? 0 :this.idEnterprisesDeactivated.hashCode()));
        result = ((result* 31)+((this.aaEnrolledDate == null)? 0 :this.aaEnrolledDate.hashCode()));
        result = ((result* 31)+((this.idMemberReferrer == null)? 0 :this.idMemberReferrer.hashCode()));
        result = ((result* 31)+((this.bio == null)? 0 :this.bio.hashCode()));
        result = ((result* 31)+((this.avatarSource == null)? 0 :this.avatarSource.hashCode()));
        result = ((result* 31)+((this.nonPublic == null)? 0 :this.nonPublic.hashCode()));
        result = ((result* 31)+((this.confirmed == null)? 0 :this.confirmed.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.activityBlocked == null)? 0 :this.activityBlocked.hashCode()));
        result = ((result* 31)+((this.aaBlockSyncUntil == null)? 0 :this.aaBlockSyncUntil.hashCode()));
        result = ((result* 31)+((this.uploadedAvatarHash == null)? 0 :this.uploadedAvatarHash.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.idOrganizations == null)? 0 :this.idOrganizations.hashCode()));
        result = ((result* 31)+((this.aaEmail == null)? 0 :this.aaEmail.hashCode()));
        result = ((result* 31)+((this.trophies == null)? 0 :this.trophies.hashCode()));
        result = ((result* 31)+((this.bioData == null)? 0 :this.bioData.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.idEnterprisesAdmin == null)? 0 :this.idEnterprisesAdmin.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.uploadedAvatarUrl == null)? 0 :this.uploadedAvatarUrl.hashCode()));
        result = ((result* 31)+((this.messagesDismissed == null)? 0 :this.messagesDismissed.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.initials == null)? 0 :this.initials.hashCode()));
        result = ((result* 31)+((this.domainClaimed == null)? 0 :this.domainClaimed.hashCode()));
        result = ((result* 31)+((this.oneTimeMessagesDismissed == null)? 0 :this.oneTimeMessagesDismissed.hashCode()));
        result = ((result* 31)+((this.nonPublicAvailable == null)? 0 :this.nonPublicAvailable.hashCode()));
        result = ((result* 31)+((this.credentialsRemovedCount == null)? 0 :this.credentialsRemovedCount.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.premiumFeatures == null)? 0 :this.premiumFeatures.hashCode()));
        result = ((result* 31)+((this.loginTypes == null)? 0 :this.loginTypes.hashCode()));
        result = ((result* 31)+((this.idPremOrgsAdmin == null)? 0 :this.idPremOrgsAdmin.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.marketingOptIn == null)? 0 :this.marketingOptIn.hashCode()));
        result = ((result* 31)+((this.prefs == null)? 0 :this.prefs.hashCode()));
        result = ((result* 31)+((this.gravatarHash == null)? 0 :this.gravatarHash.hashCode()));
        result = ((result* 31)+((this.ixUpdate == null)? 0 :this.ixUpdate.hashCode()));
        result = ((result* 31)+((this.avatarHash == null)? 0 :this.avatarHash.hashCode()));
        result = ((result* 31)+((this.aaId == null)? 0 :this.aaId.hashCode()));
        result = ((result* 31)+((this.idEnterprise == null)? 0 :this.idEnterprise.hashCode()));
        result = ((result* 31)+((this.isAaMastered == null)? 0 :this.isAaMastered.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        result = ((result* 31)+((this.idBoards == null)? 0 :this.idBoards.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return (((((((((((((((((((((((((((((((((((((((((((((this.idEnterprisesDeactivated == rhs.idEnterprisesDeactivated)||((this.idEnterprisesDeactivated!= null)&&this.idEnterprisesDeactivated.equals(rhs.idEnterprisesDeactivated)))&&((this.aaEnrolledDate == rhs.aaEnrolledDate)||((this.aaEnrolledDate!= null)&&this.aaEnrolledDate.equals(rhs.aaEnrolledDate))))&&((this.idMemberReferrer == rhs.idMemberReferrer)||((this.idMemberReferrer!= null)&&this.idMemberReferrer.equals(rhs.idMemberReferrer))))&&((this.bio == rhs.bio)||((this.bio!= null)&&this.bio.equals(rhs.bio))))&&((this.avatarSource == rhs.avatarSource)||((this.avatarSource!= null)&&this.avatarSource.equals(rhs.avatarSource))))&&((this.nonPublic == rhs.nonPublic)||((this.nonPublic!= null)&&this.nonPublic.equals(rhs.nonPublic))))&&((this.confirmed == rhs.confirmed)||((this.confirmed!= null)&&this.confirmed.equals(rhs.confirmed))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.activityBlocked == rhs.activityBlocked)||((this.activityBlocked!= null)&&this.activityBlocked.equals(rhs.activityBlocked))))&&((this.aaBlockSyncUntil == rhs.aaBlockSyncUntil)||((this.aaBlockSyncUntil!= null)&&this.aaBlockSyncUntil.equals(rhs.aaBlockSyncUntil))))&&((this.uploadedAvatarHash == rhs.uploadedAvatarHash)||((this.uploadedAvatarHash!= null)&&this.uploadedAvatarHash.equals(rhs.uploadedAvatarHash))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.idOrganizations == rhs.idOrganizations)||((this.idOrganizations!= null)&&this.idOrganizations.equals(rhs.idOrganizations))))&&((this.aaEmail == rhs.aaEmail)||((this.aaEmail!= null)&&this.aaEmail.equals(rhs.aaEmail))))&&((this.trophies == rhs.trophies)||((this.trophies!= null)&&this.trophies.equals(rhs.trophies))))&&((this.bioData == rhs.bioData)||((this.bioData!= null)&&this.bioData.equals(rhs.bioData))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.idEnterprisesAdmin == rhs.idEnterprisesAdmin)||((this.idEnterprisesAdmin!= null)&&this.idEnterprisesAdmin.equals(rhs.idEnterprisesAdmin))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.uploadedAvatarUrl == rhs.uploadedAvatarUrl)||((this.uploadedAvatarUrl!= null)&&this.uploadedAvatarUrl.equals(rhs.uploadedAvatarUrl))))&&((this.messagesDismissed == rhs.messagesDismissed)||((this.messagesDismissed!= null)&&this.messagesDismissed.equals(rhs.messagesDismissed))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.initials == rhs.initials)||((this.initials!= null)&&this.initials.equals(rhs.initials))))&&((this.domainClaimed == rhs.domainClaimed)||((this.domainClaimed!= null)&&this.domainClaimed.equals(rhs.domainClaimed))))&&((this.oneTimeMessagesDismissed == rhs.oneTimeMessagesDismissed)||((this.oneTimeMessagesDismissed!= null)&&this.oneTimeMessagesDismissed.equals(rhs.oneTimeMessagesDismissed))))&&((this.nonPublicAvailable == rhs.nonPublicAvailable)||((this.nonPublicAvailable!= null)&&this.nonPublicAvailable.equals(rhs.nonPublicAvailable))))&&((this.credentialsRemovedCount == rhs.credentialsRemovedCount)||((this.credentialsRemovedCount!= null)&&this.credentialsRemovedCount.equals(rhs.credentialsRemovedCount))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.premiumFeatures == rhs.premiumFeatures)||((this.premiumFeatures!= null)&&this.premiumFeatures.equals(rhs.premiumFeatures))))&&((this.loginTypes == rhs.loginTypes)||((this.loginTypes!= null)&&this.loginTypes.equals(rhs.loginTypes))))&&((this.idPremOrgsAdmin == rhs.idPremOrgsAdmin)||((this.idPremOrgsAdmin!= null)&&this.idPremOrgsAdmin.equals(rhs.idPremOrgsAdmin))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.marketingOptIn == rhs.marketingOptIn)||((this.marketingOptIn!= null)&&this.marketingOptIn.equals(rhs.marketingOptIn))))&&((this.prefs == rhs.prefs)||((this.prefs!= null)&&this.prefs.equals(rhs.prefs))))&&((this.gravatarHash == rhs.gravatarHash)||((this.gravatarHash!= null)&&this.gravatarHash.equals(rhs.gravatarHash))))&&((this.ixUpdate == rhs.ixUpdate)||((this.ixUpdate!= null)&&this.ixUpdate.equals(rhs.ixUpdate))))&&((this.avatarHash == rhs.avatarHash)||((this.avatarHash!= null)&&this.avatarHash.equals(rhs.avatarHash))))&&((this.aaId == rhs.aaId)||((this.aaId!= null)&&this.aaId.equals(rhs.aaId))))&&((this.idEnterprise == rhs.idEnterprise)||((this.idEnterprise!= null)&&this.idEnterprise.equals(rhs.idEnterprise))))&&((this.isAaMastered == rhs.isAaMastered)||((this.isAaMastered!= null)&&this.isAaMastered.equals(rhs.isAaMastered))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.idBoards == rhs.idBoards)||((this.idBoards!= null)&&this.idBoards.equals(rhs.idBoards))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
