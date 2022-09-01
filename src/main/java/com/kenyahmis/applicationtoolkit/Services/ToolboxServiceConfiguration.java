package com.kenyahmis.applicationtoolkit.Services;

import java.net.URL;

/**
 * A configuration model that can be used to pass information between classes/scenes
 */
public class ToolboxServiceConfiguration {
    private String userPass; // to execute shell script
    private String mysqlPass; // mysql password to be used within shell script

    private String baseDir; // where the package is downloaded and unzipped

    private String pathToSetupScript; // a concatenation of baseDir, package name, and rollback_script.sh

    private String pathToBackupScript; // a concatenation of BaseDire,Resources, and openmrs_backup.sh
    private String pathToRollbackScript; // a concatenation of BaseDire,Resources, and openmrs_backup.sh

    private String pathToRollsetupScript; // a concatenation of BaseDire,Resources, and openmrs_backup.sh

    private  String remoteproperties;

    private URL packageDownloadUrl;
    private String packageUnzipDir;

    private String apppackageDir;

    private URL appulr;
    private URL scriptsurl;
    private String scriptpackageUnzipDir;
    private String apppackageUnzipDir;

    private String pathToolkitUpgradeScript;

    public ToolboxServiceConfiguration(String userPass, String mysqlPass) {
        this.userPass = userPass;
        this.mysqlPass = mysqlPass;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getMysqlPass() {
        return mysqlPass;
    }

    public void setMysqlPass(String mysqlPass) {
        this.mysqlPass = mysqlPass;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getPathToSetupScript() {
        return pathToSetupScript;
    }

    public void setPathToSetupScript(String pathToSetupScript) {
        this.pathToSetupScript = pathToSetupScript;
    }

    public URL getPackageDownloadUrl() {
        return packageDownloadUrl;
    }

    public void setPackageDownloadUrl(URL packageDownloadUrl) {
        this.packageDownloadUrl = packageDownloadUrl;
    }

    public String getPackageUnzipDir() {
        return packageUnzipDir;
    }

    public void setPackageUnzipDir(String packageUnzipDir) {
        this.packageUnzipDir = packageUnzipDir;
    }

    public String getPathToBackupScript() {
        return pathToBackupScript;
    }

    public void setPathToBackupScript(String pathToBackupScript) {
        this.pathToBackupScript = pathToBackupScript;
    }

    public String getPathToRollbackScript() {
        return pathToRollbackScript;
    }

    public void setPathToRollbackScript(String pathToRollbackScript) {
        this.pathToRollbackScript = pathToRollbackScript;
    }

    public String getPathToRollsetupScript() {
        return pathToRollsetupScript;
    }

    public void setPathToRollsetupScript(String pathToRollsetupScript) {
        this.pathToRollsetupScript = pathToRollsetupScript;
    }

    public String getRemoteproperties() {
        return remoteproperties;
    }

    public void setRemoteproperties(String remoteproperties) {
        this.remoteproperties = remoteproperties;
    }

    public String getApppackageDir() {
        return apppackageDir;
    }

    public void setApppackageDir(String apppackageDir) {
        this.apppackageDir = apppackageDir;
    }

    public URL getAppulr() {
        return appulr;
    }

    public void setAppulr(URL appulr) {
        this.appulr = appulr;
    }

    public URL getScriptsurl() {
        return scriptsurl;
    }

    public void setScriptsurl(URL scriptsurl) {
        this.scriptsurl = scriptsurl;
    }

    public String getScriptpackageUnzipDir() {
        return scriptpackageUnzipDir;
    }

    public void setScriptpackageUnzipDir(String scriptpackageUnzipDir) {
        this.scriptpackageUnzipDir = scriptpackageUnzipDir;
    }

    public String getApppackageUnzipDir() {
        return apppackageUnzipDir;
    }

    public void setApppackageUnzipDir(String apppackageUnzipDir) {
        this.apppackageUnzipDir = apppackageUnzipDir;
    }

    public String getPathToolkitUpgradeScript() {
        return pathToolkitUpgradeScript;
    }

    public void setPathToolkitUpgradeScript(String pathToolkitUpgradeScript) {
        this.pathToolkitUpgradeScript = pathToolkitUpgradeScript;
    }
}
