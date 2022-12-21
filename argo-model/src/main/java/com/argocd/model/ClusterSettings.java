package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

/**
 * ClusterSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class ClusterSettings  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("appLabelKey")
  private String appLabelKey = null;

  @JsonProperty("appsInAnyNamespaceEnabled")
  private Boolean appsInAnyNamespaceEnabled = null;

  @JsonProperty("configManagementPlugins")
  @Valid
  private List<V1alpha1ConfigManagementPlugin> configManagementPlugins = null;

  @JsonProperty("controllerNamespace")
  private String controllerNamespace = null;

  @JsonProperty("dexConfig")
  private ClusterDexConfig dexConfig = null;

  @JsonProperty("execEnabled")
  private Boolean execEnabled = null;

  @JsonProperty("googleAnalytics")
  private ClusterGoogleAnalyticsConfig googleAnalytics = null;

  @JsonProperty("help")
  private ClusterHelp help = null;

  @JsonProperty("kustomizeOptions")
  private V1alpha1KustomizeOptions kustomizeOptions = null;

  @JsonProperty("kustomizeVersions")
  @Valid
  private List<String> kustomizeVersions = null;

  @JsonProperty("oidcConfig")
  private ClusterOIDCConfig oidcConfig = null;

  @JsonProperty("passwordPattern")
  private String passwordPattern = null;

  @JsonProperty("plugins")
  @Valid
  private List<ClusterPlugin> plugins = null;

  @JsonProperty("resourceOverrides")
  @Valid
  private Map<String, V1alpha1ResourceOverride> resourceOverrides = null;

  @JsonProperty("statusBadgeEnabled")
  private Boolean statusBadgeEnabled = null;

  @JsonProperty("statusBadgeRootUrl")
  private String statusBadgeRootUrl = null;

  @JsonProperty("trackingMethod")
  private String trackingMethod = null;

  @JsonProperty("uiBannerContent")
  private String uiBannerContent = null;

  @JsonProperty("uiBannerPermanent")
  private Boolean uiBannerPermanent = null;

  @JsonProperty("uiBannerPosition")
  private String uiBannerPosition = null;

  @JsonProperty("uiBannerURL")
  private String uiBannerURL = null;

  @JsonProperty("uiCssURL")
  private String uiCssURL = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("userLoginsDisabled")
  private Boolean userLoginsDisabled = null;

  public ClusterSettings appLabelKey(String appLabelKey) {
    this.appLabelKey = appLabelKey;
    return this;
  }

  /**
   * Get appLabelKey
   * @return appLabelKey
   **/
  @Schema(description = "")
  
    public String getAppLabelKey() {
    return appLabelKey;
  }

  public void setAppLabelKey(String appLabelKey) {
    this.appLabelKey = appLabelKey;
  }

  public ClusterSettings appsInAnyNamespaceEnabled(Boolean appsInAnyNamespaceEnabled) {
    this.appsInAnyNamespaceEnabled = appsInAnyNamespaceEnabled;
    return this;
  }

  /**
   * Get appsInAnyNamespaceEnabled
   * @return appsInAnyNamespaceEnabled
   **/
  @Schema(description = "")
  
    public Boolean isAppsInAnyNamespaceEnabled() {
    return appsInAnyNamespaceEnabled;
  }

  public void setAppsInAnyNamespaceEnabled(Boolean appsInAnyNamespaceEnabled) {
    this.appsInAnyNamespaceEnabled = appsInAnyNamespaceEnabled;
  }

  public ClusterSettings configManagementPlugins(List<V1alpha1ConfigManagementPlugin> configManagementPlugins) {
    this.configManagementPlugins = configManagementPlugins;
    return this;
  }

  public ClusterSettings addConfigManagementPluginsItem(V1alpha1ConfigManagementPlugin configManagementPluginsItem) {
    if (this.configManagementPlugins == null) {
      this.configManagementPlugins = new ArrayList<>();
    }
    this.configManagementPlugins.add(configManagementPluginsItem);
    return this;
  }

  /**
   * Get configManagementPlugins
   * @return configManagementPlugins
   **/
  @Schema(description = "")
      @Valid
    public List<V1alpha1ConfigManagementPlugin> getConfigManagementPlugins() {
    return configManagementPlugins;
  }

  public void setConfigManagementPlugins(List<V1alpha1ConfigManagementPlugin> configManagementPlugins) {
    this.configManagementPlugins = configManagementPlugins;
  }

  public ClusterSettings controllerNamespace(String controllerNamespace) {
    this.controllerNamespace = controllerNamespace;
    return this;
  }

  /**
   * Get controllerNamespace
   * @return controllerNamespace
   **/
  @Schema(description = "")
  
    public String getControllerNamespace() {
    return controllerNamespace;
  }

  public void setControllerNamespace(String controllerNamespace) {
    this.controllerNamespace = controllerNamespace;
  }

  public ClusterSettings dexConfig(ClusterDexConfig dexConfig) {
    this.dexConfig = dexConfig;
    return this;
  }

  /**
   * Get dexConfig
   * @return dexConfig
   **/
  @Schema(description = "")
  
    @Valid
    public ClusterDexConfig getDexConfig() {
    return dexConfig;
  }

  public void setDexConfig(ClusterDexConfig dexConfig) {
    this.dexConfig = dexConfig;
  }

  public ClusterSettings execEnabled(Boolean execEnabled) {
    this.execEnabled = execEnabled;
    return this;
  }

  /**
   * Get execEnabled
   * @return execEnabled
   **/
  @Schema(description = "")
  
    public Boolean isExecEnabled() {
    return execEnabled;
  }

  public void setExecEnabled(Boolean execEnabled) {
    this.execEnabled = execEnabled;
  }

  public ClusterSettings googleAnalytics(ClusterGoogleAnalyticsConfig googleAnalytics) {
    this.googleAnalytics = googleAnalytics;
    return this;
  }

  /**
   * Get googleAnalytics
   * @return googleAnalytics
   **/
  @Schema(description = "")
  
    @Valid
    public ClusterGoogleAnalyticsConfig getGoogleAnalytics() {
    return googleAnalytics;
  }

  public void setGoogleAnalytics(ClusterGoogleAnalyticsConfig googleAnalytics) {
    this.googleAnalytics = googleAnalytics;
  }

  public ClusterSettings help(ClusterHelp help) {
    this.help = help;
    return this;
  }

  /**
   * Get help
   * @return help
   **/
  @Schema(description = "")
  
    @Valid
    public ClusterHelp getHelp() {
    return help;
  }

  public void setHelp(ClusterHelp help) {
    this.help = help;
  }

  public ClusterSettings kustomizeOptions(V1alpha1KustomizeOptions kustomizeOptions) {
    this.kustomizeOptions = kustomizeOptions;
    return this;
  }

  /**
   * Get kustomizeOptions
   * @return kustomizeOptions
   **/
  @Schema(description = "")
  
    @Valid
    public V1alpha1KustomizeOptions getKustomizeOptions() {
    return kustomizeOptions;
  }

  public void setKustomizeOptions(V1alpha1KustomizeOptions kustomizeOptions) {
    this.kustomizeOptions = kustomizeOptions;
  }

  public ClusterSettings kustomizeVersions(List<String> kustomizeVersions) {
    this.kustomizeVersions = kustomizeVersions;
    return this;
  }

  public ClusterSettings addKustomizeVersionsItem(String kustomizeVersionsItem) {
    if (this.kustomizeVersions == null) {
      this.kustomizeVersions = new ArrayList<>();
    }
    this.kustomizeVersions.add(kustomizeVersionsItem);
    return this;
  }

  /**
   * Get kustomizeVersions
   * @return kustomizeVersions
   **/
  @Schema(description = "")
  
    public List<String> getKustomizeVersions() {
    return kustomizeVersions;
  }

  public void setKustomizeVersions(List<String> kustomizeVersions) {
    this.kustomizeVersions = kustomizeVersions;
  }

  public ClusterSettings oidcConfig(ClusterOIDCConfig oidcConfig) {
    this.oidcConfig = oidcConfig;
    return this;
  }

  /**
   * Get oidcConfig
   * @return oidcConfig
   **/
  @Schema(description = "")
  
    @Valid
    public ClusterOIDCConfig getOidcConfig() {
    return oidcConfig;
  }

  public void setOidcConfig(ClusterOIDCConfig oidcConfig) {
    this.oidcConfig = oidcConfig;
  }

  public ClusterSettings passwordPattern(String passwordPattern) {
    this.passwordPattern = passwordPattern;
    return this;
  }

  /**
   * Get passwordPattern
   * @return passwordPattern
   **/
  @Schema(description = "")
  
    public String getPasswordPattern() {
    return passwordPattern;
  }

  public void setPasswordPattern(String passwordPattern) {
    this.passwordPattern = passwordPattern;
  }

  public ClusterSettings plugins(List<ClusterPlugin> plugins) {
    this.plugins = plugins;
    return this;
  }

  public ClusterSettings addPluginsItem(ClusterPlugin pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

  /**
   * Get plugins
   * @return plugins
   **/
  @Schema(description = "")
      @Valid
    public List<ClusterPlugin> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<ClusterPlugin> plugins) {
    this.plugins = plugins;
  }

  public ClusterSettings resourceOverrides(Map<String, V1alpha1ResourceOverride> resourceOverrides) {
    this.resourceOverrides = resourceOverrides;
    return this;
  }

  public ClusterSettings putResourceOverridesItem(String key, V1alpha1ResourceOverride resourceOverridesItem) {
    if (this.resourceOverrides == null) {
      this.resourceOverrides = new HashMap<>();
    }
    this.resourceOverrides.put(key, resourceOverridesItem);
    return this;
  }

  /**
   * Get resourceOverrides
   * @return resourceOverrides
   **/
  @Schema(description = "")
      @Valid
    public Map<String, V1alpha1ResourceOverride> getResourceOverrides() {
    return resourceOverrides;
  }

  public void setResourceOverrides(Map<String, V1alpha1ResourceOverride> resourceOverrides) {
    this.resourceOverrides = resourceOverrides;
  }

  public ClusterSettings statusBadgeEnabled(Boolean statusBadgeEnabled) {
    this.statusBadgeEnabled = statusBadgeEnabled;
    return this;
  }

  /**
   * Get statusBadgeEnabled
   * @return statusBadgeEnabled
   **/
  @Schema(description = "")
  
    public Boolean isStatusBadgeEnabled() {
    return statusBadgeEnabled;
  }

  public void setStatusBadgeEnabled(Boolean statusBadgeEnabled) {
    this.statusBadgeEnabled = statusBadgeEnabled;
  }

  public ClusterSettings statusBadgeRootUrl(String statusBadgeRootUrl) {
    this.statusBadgeRootUrl = statusBadgeRootUrl;
    return this;
  }

  /**
   * Get statusBadgeRootUrl
   * @return statusBadgeRootUrl
   **/
  @Schema(description = "")
  
    public String getStatusBadgeRootUrl() {
    return statusBadgeRootUrl;
  }

  public void setStatusBadgeRootUrl(String statusBadgeRootUrl) {
    this.statusBadgeRootUrl = statusBadgeRootUrl;
  }

  public ClusterSettings trackingMethod(String trackingMethod) {
    this.trackingMethod = trackingMethod;
    return this;
  }

  /**
   * Get trackingMethod
   * @return trackingMethod
   **/
  @Schema(description = "")
  
    public String getTrackingMethod() {
    return trackingMethod;
  }

  public void setTrackingMethod(String trackingMethod) {
    this.trackingMethod = trackingMethod;
  }

  public ClusterSettings uiBannerContent(String uiBannerContent) {
    this.uiBannerContent = uiBannerContent;
    return this;
  }

  /**
   * Get uiBannerContent
   * @return uiBannerContent
   **/
  @Schema(description = "")
  
    public String getUiBannerContent() {
    return uiBannerContent;
  }

  public void setUiBannerContent(String uiBannerContent) {
    this.uiBannerContent = uiBannerContent;
  }

  public ClusterSettings uiBannerPermanent(Boolean uiBannerPermanent) {
    this.uiBannerPermanent = uiBannerPermanent;
    return this;
  }

  /**
   * Get uiBannerPermanent
   * @return uiBannerPermanent
   **/
  @Schema(description = "")
  
    public Boolean isUiBannerPermanent() {
    return uiBannerPermanent;
  }

  public void setUiBannerPermanent(Boolean uiBannerPermanent) {
    this.uiBannerPermanent = uiBannerPermanent;
  }

  public ClusterSettings uiBannerPosition(String uiBannerPosition) {
    this.uiBannerPosition = uiBannerPosition;
    return this;
  }

  /**
   * Get uiBannerPosition
   * @return uiBannerPosition
   **/
  @Schema(description = "")
  
    public String getUiBannerPosition() {
    return uiBannerPosition;
  }

  public void setUiBannerPosition(String uiBannerPosition) {
    this.uiBannerPosition = uiBannerPosition;
  }

  public ClusterSettings uiBannerURL(String uiBannerURL) {
    this.uiBannerURL = uiBannerURL;
    return this;
  }

  /**
   * Get uiBannerURL
   * @return uiBannerURL
   **/
  @Schema(description = "")
  
    public String getUiBannerURL() {
    return uiBannerURL;
  }

  public void setUiBannerURL(String uiBannerURL) {
    this.uiBannerURL = uiBannerURL;
  }

  public ClusterSettings uiCssURL(String uiCssURL) {
    this.uiCssURL = uiCssURL;
    return this;
  }

  /**
   * Get uiCssURL
   * @return uiCssURL
   **/
  @Schema(description = "")
  
    public String getUiCssURL() {
    return uiCssURL;
  }

  public void setUiCssURL(String uiCssURL) {
    this.uiCssURL = uiCssURL;
  }

  public ClusterSettings url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @Schema(description = "")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ClusterSettings userLoginsDisabled(Boolean userLoginsDisabled) {
    this.userLoginsDisabled = userLoginsDisabled;
    return this;
  }

  /**
   * Get userLoginsDisabled
   * @return userLoginsDisabled
   **/
  @Schema(description = "")
  
    public Boolean isUserLoginsDisabled() {
    return userLoginsDisabled;
  }

  public void setUserLoginsDisabled(Boolean userLoginsDisabled) {
    this.userLoginsDisabled = userLoginsDisabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSettings clusterSettings = (ClusterSettings) o;
    return Objects.equals(this.appLabelKey, clusterSettings.appLabelKey) &&
        Objects.equals(this.appsInAnyNamespaceEnabled, clusterSettings.appsInAnyNamespaceEnabled) &&
        Objects.equals(this.configManagementPlugins, clusterSettings.configManagementPlugins) &&
        Objects.equals(this.controllerNamespace, clusterSettings.controllerNamespace) &&
        Objects.equals(this.dexConfig, clusterSettings.dexConfig) &&
        Objects.equals(this.execEnabled, clusterSettings.execEnabled) &&
        Objects.equals(this.googleAnalytics, clusterSettings.googleAnalytics) &&
        Objects.equals(this.help, clusterSettings.help) &&
        Objects.equals(this.kustomizeOptions, clusterSettings.kustomizeOptions) &&
        Objects.equals(this.kustomizeVersions, clusterSettings.kustomizeVersions) &&
        Objects.equals(this.oidcConfig, clusterSettings.oidcConfig) &&
        Objects.equals(this.passwordPattern, clusterSettings.passwordPattern) &&
        Objects.equals(this.plugins, clusterSettings.plugins) &&
        Objects.equals(this.resourceOverrides, clusterSettings.resourceOverrides) &&
        Objects.equals(this.statusBadgeEnabled, clusterSettings.statusBadgeEnabled) &&
        Objects.equals(this.statusBadgeRootUrl, clusterSettings.statusBadgeRootUrl) &&
        Objects.equals(this.trackingMethod, clusterSettings.trackingMethod) &&
        Objects.equals(this.uiBannerContent, clusterSettings.uiBannerContent) &&
        Objects.equals(this.uiBannerPermanent, clusterSettings.uiBannerPermanent) &&
        Objects.equals(this.uiBannerPosition, clusterSettings.uiBannerPosition) &&
        Objects.equals(this.uiBannerURL, clusterSettings.uiBannerURL) &&
        Objects.equals(this.uiCssURL, clusterSettings.uiCssURL) &&
        Objects.equals(this.url, clusterSettings.url) &&
        Objects.equals(this.userLoginsDisabled, clusterSettings.userLoginsDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLabelKey, appsInAnyNamespaceEnabled, configManagementPlugins, controllerNamespace, dexConfig, execEnabled, googleAnalytics, help, kustomizeOptions, kustomizeVersions, oidcConfig, passwordPattern, plugins, resourceOverrides, statusBadgeEnabled, statusBadgeRootUrl, trackingMethod, uiBannerContent, uiBannerPermanent, uiBannerPosition, uiBannerURL, uiCssURL, url, userLoginsDisabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSettings {\n");
    
    sb.append("    appLabelKey: ").append(toIndentedString(appLabelKey)).append("\n");
    sb.append("    appsInAnyNamespaceEnabled: ").append(toIndentedString(appsInAnyNamespaceEnabled)).append("\n");
    sb.append("    configManagementPlugins: ").append(toIndentedString(configManagementPlugins)).append("\n");
    sb.append("    controllerNamespace: ").append(toIndentedString(controllerNamespace)).append("\n");
    sb.append("    dexConfig: ").append(toIndentedString(dexConfig)).append("\n");
    sb.append("    execEnabled: ").append(toIndentedString(execEnabled)).append("\n");
    sb.append("    googleAnalytics: ").append(toIndentedString(googleAnalytics)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    kustomizeOptions: ").append(toIndentedString(kustomizeOptions)).append("\n");
    sb.append("    kustomizeVersions: ").append(toIndentedString(kustomizeVersions)).append("\n");
    sb.append("    oidcConfig: ").append(toIndentedString(oidcConfig)).append("\n");
    sb.append("    passwordPattern: ").append(toIndentedString(passwordPattern)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    resourceOverrides: ").append(toIndentedString(resourceOverrides)).append("\n");
    sb.append("    statusBadgeEnabled: ").append(toIndentedString(statusBadgeEnabled)).append("\n");
    sb.append("    statusBadgeRootUrl: ").append(toIndentedString(statusBadgeRootUrl)).append("\n");
    sb.append("    trackingMethod: ").append(toIndentedString(trackingMethod)).append("\n");
    sb.append("    uiBannerContent: ").append(toIndentedString(uiBannerContent)).append("\n");
    sb.append("    uiBannerPermanent: ").append(toIndentedString(uiBannerPermanent)).append("\n");
    sb.append("    uiBannerPosition: ").append(toIndentedString(uiBannerPosition)).append("\n");
    sb.append("    uiBannerURL: ").append(toIndentedString(uiBannerURL)).append("\n");
    sb.append("    uiCssURL: ").append(toIndentedString(uiCssURL)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userLoginsDisabled: ").append(toIndentedString(userLoginsDisabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
