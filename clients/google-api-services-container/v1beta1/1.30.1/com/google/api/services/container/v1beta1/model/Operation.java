/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.container.v1beta1.model;

/**
 * This operation resource represents operations that may have happened or are happening on the
 * cluster. All fields are output only.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Operation extends com.google.api.client.json.GenericJson {

  /**
   * Which conditions caused the current cluster state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StatusCondition> clusterConditions;

  /**
   * Detailed operation progress, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detail;

  /**
   * [Output only] The time the operation completed, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endTime;

  /**
   * [Output only] The name of the Google Compute Engine [zone](/compute/docs/regions-zones/regions-
   * zones#available) or [region](/compute/docs/regions-zones/regions-zones#available) in which the
   * cluster resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The server-assigned ID for the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Which conditions caused the current node pool state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StatusCondition> nodepoolConditions;

  /**
   * The operation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * Output only. [Output only] Progress information for an operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationProgress progress;

  /**
   * Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output only] The time the operation started, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * The current status of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. If an error has occurred, a textual description of the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * Server-defined URL for the target of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetLink;

  /**
   * The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the
   * operation is taking place. This field is deprecated, use location instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Which conditions caused the current cluster state.
   * @return value or {@code null} for none
   */
  public java.util.List<StatusCondition> getClusterConditions() {
    return clusterConditions;
  }

  /**
   * Which conditions caused the current cluster state.
   * @param clusterConditions clusterConditions or {@code null} for none
   */
  public Operation setClusterConditions(java.util.List<StatusCondition> clusterConditions) {
    this.clusterConditions = clusterConditions;
    return this;
  }

  /**
   * Detailed operation progress, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetail() {
    return detail;
  }

  /**
   * Detailed operation progress, if available.
   * @param detail detail or {@code null} for none
   */
  public Operation setDetail(java.lang.String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * [Output only] The time the operation completed, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTime() {
    return endTime;
  }

  /**
   * [Output only] The time the operation completed, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @param endTime endTime or {@code null} for none
   */
  public Operation setEndTime(java.lang.String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * [Output only] The name of the Google Compute Engine [zone](/compute/docs/regions-zones/regions-
   * zones#available) or [region](/compute/docs/regions-zones/regions-zones#available) in which the
   * cluster resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * [Output only] The name of the Google Compute Engine [zone](/compute/docs/regions-zones/regions-
   * zones#available) or [region](/compute/docs/regions-zones/regions-zones#available) in which the
   * cluster resides.
   * @param location location or {@code null} for none
   */
  public Operation setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The server-assigned ID for the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The server-assigned ID for the operation.
   * @param name name or {@code null} for none
   */
  public Operation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Which conditions caused the current node pool state.
   * @return value or {@code null} for none
   */
  public java.util.List<StatusCondition> getNodepoolConditions() {
    return nodepoolConditions;
  }

  /**
   * Which conditions caused the current node pool state.
   * @param nodepoolConditions nodepoolConditions or {@code null} for none
   */
  public Operation setNodepoolConditions(java.util.List<StatusCondition> nodepoolConditions) {
    this.nodepoolConditions = nodepoolConditions;
    return this;
  }

  /**
   * The operation type.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * The operation type.
   * @param operationType operationType or {@code null} for none
   */
  public Operation setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Output only. [Output only] Progress information for an operation.
   * @return value or {@code null} for none
   */
  public OperationProgress getProgress() {
    return progress;
  }

  /**
   * Output only. [Output only] Progress information for an operation.
   * @param progress progress or {@code null} for none
   */
  public Operation setProgress(OperationProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Operation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output only] The time the operation started, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * [Output only] The time the operation started, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * @param startTime startTime or {@code null} for none
   */
  public Operation setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The current status of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The current status of the operation.
   * @param status status or {@code null} for none
   */
  public Operation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. If an error has occurred, a textual description of the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Output only. If an error has occurred, a textual description of the error.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Operation setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Server-defined URL for the target of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetLink() {
    return targetLink;
  }

  /**
   * Server-defined URL for the target of the operation.
   * @param targetLink targetLink or {@code null} for none
   */
  public Operation setTargetLink(java.lang.String targetLink) {
    this.targetLink = targetLink;
    return this;
  }

  /**
   * The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the
   * operation is taking place. This field is deprecated, use location instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the
   * operation is taking place. This field is deprecated, use location instead.
   * @param zone zone or {@code null} for none
   */
  public Operation setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Operation set(String fieldName, Object value) {
    return (Operation) super.set(fieldName, value);
  }

  @Override
  public Operation clone() {
    return (Operation) super.clone();
  }

}
