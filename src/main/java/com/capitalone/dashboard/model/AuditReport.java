package com.capitalone.dashboard.model;

import org.json.simple.JSONObject;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "audit_reports")
public class AuditReport extends BaseModel {

    private AuditType auditType;
    private String identifierType;
    private String identifierName;
    private String identifierVersion;
    private String identifierUrl;
    private String identifierSubtype;
    private JSONObject auditResponse;
    private String auditRequest;
    private String businessService;
    private String businessApplication;
    private String source;
    private String buildUrl;
    private long lastReleaseTimestamp;
    private long timestamp;
    private String sourceIdentifier;
    private String testResultsUrl;
    private EvaluationStatus evaluationStatus;

    public AuditReport() { }

    public AuditType getAuditType() {
        return auditType;
    }

    public void setAuditType(AuditType auditType) {
        this.auditType = auditType;
    }

    public String getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(String identifierType) {
        this.identifierType = identifierType;
    }

    public String getIdentifierName() {
        return identifierName;
    }

    public void setIdentifierName(String identifierName) {
        this.identifierName = identifierName;
    }

    public String getIdentifierVersion() {
        return identifierVersion;
    }

    public void setIdentifierVersion(String identifierVersion) {
        this.identifierVersion = identifierVersion;
    }

    public String getIdentifierUrl() {
        return identifierUrl;
    }

    public void setIdentifierUrl(String identifierUrl) {
        this.identifierUrl = identifierUrl;
    }

    public String getIdentifierSubtype() {
        return identifierSubtype;
    }

    public void setIdentifierSubtype(String identifierSubtype) {
        this.identifierSubtype = identifierSubtype;
    }

    public Object getAuditResponse() {
        return auditResponse;
    }

    public void setAuditResponse(JSONObject auditResponse) {
        this.auditResponse = auditResponse;
    }

    public String getAuditRequest() {
        return auditRequest;
    }

    public void setAuditRequest(String auditRequest) {
        this.auditRequest = auditRequest;
    }

    public String getBusinessService() {
        return businessService;
    }

    public void setBusinessService(String businessService) {
        this.businessService = businessService;
    }

    public String getBusinessApplication() {
        return businessApplication;
    }

    public void setBusinessApplication(String businessApplication) {
        this.businessApplication = businessApplication;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBuildUrl() {
        return buildUrl;
    }

    public void setBuildUrl(String buildUrl) {
        this.buildUrl = buildUrl;
    }

    public long getLastReleaseTimestamp() {
        return lastReleaseTimestamp;
    }

    public void setLastReleaseTimestamp(long lastReleaseTimestamp) {
        this.lastReleaseTimestamp = lastReleaseTimestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getTestResultsUrl() { return testResultsUrl; }

    public void setTestResultsUrl(String testResultsUrl) {
        this.testResultsUrl = testResultsUrl;
    }

    public EvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }

    public void setEvaluationStatus(EvaluationStatus evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }
}
