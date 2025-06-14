/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.645.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A JSON Web Key (JWK) that can be used in conjunction with [JWT libraries](https://jwt.io/#libraries-io) to verify Plaid webhooks
 */
@ApiModel(description = "A JSON Web Key (JWK) that can be used in conjunction with [JWT libraries](https://jwt.io/#libraries-io) to verify Plaid webhooks")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-12T21:24:48.076128Z[Etc/UTC]")
public class JWKPublicKey {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_CRV = "crv";
  @SerializedName(SERIALIZED_NAME_CRV)
  private String crv;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_KTY = "kty";
  @SerializedName(SERIALIZED_NAME_KTY)
  private String kty;

  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private String use;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private String x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private String y;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_EXPIRED_AT = "expired_at";
  @SerializedName(SERIALIZED_NAME_EXPIRED_AT)
  private Integer expiredAt;


  public JWKPublicKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * The alg member identifies the cryptographic algorithm family used with the key.
   * @return alg
  **/
  @ApiModelProperty(required = true, value = "The alg member identifies the cryptographic algorithm family used with the key.")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public JWKPublicKey crv(String crv) {
    
    this.crv = crv;
    return this;
  }

   /**
   * The crv member identifies the cryptographic curve used with the key.
   * @return crv
  **/
  @ApiModelProperty(required = true, value = "The crv member identifies the cryptographic curve used with the key.")

  public String getCrv() {
    return crv;
  }


  public void setCrv(String crv) {
    this.crv = crv;
  }


  public JWKPublicKey kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The kid (Key ID) member can be used to match a specific key. This can be used, for instance, to choose among a set of keys within the JWK during key rollover.
   * @return kid
  **/
  @ApiModelProperty(required = true, value = "The kid (Key ID) member can be used to match a specific key. This can be used, for instance, to choose among a set of keys within the JWK during key rollover.")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public JWKPublicKey kty(String kty) {
    
    this.kty = kty;
    return this;
  }

   /**
   * The kty (key type) parameter identifies the cryptographic algorithm family used with the key, such as RSA or EC.
   * @return kty
  **/
  @ApiModelProperty(required = true, value = "The kty (key type) parameter identifies the cryptographic algorithm family used with the key, such as RSA or EC.")

  public String getKty() {
    return kty;
  }


  public void setKty(String kty) {
    this.kty = kty;
  }


  public JWKPublicKey use(String use) {
    
    this.use = use;
    return this;
  }

   /**
   * The use (public key use) parameter identifies the intended use of the public key.
   * @return use
  **/
  @ApiModelProperty(required = true, value = "The use (public key use) parameter identifies the intended use of the public key.")

  public String getUse() {
    return use;
  }


  public void setUse(String use) {
    this.use = use;
  }


  public JWKPublicKey x(String x) {
    
    this.x = x;
    return this;
  }

   /**
   * The x member contains the x coordinate for the elliptic curve point, provided as a base64url-encoded string of the coordinate&#39;s big endian representation.
   * @return x
  **/
  @ApiModelProperty(required = true, value = "The x member contains the x coordinate for the elliptic curve point, provided as a base64url-encoded string of the coordinate's big endian representation.")

  public String getX() {
    return x;
  }


  public void setX(String x) {
    this.x = x;
  }


  public JWKPublicKey y(String y) {
    
    this.y = y;
    return this;
  }

   /**
   * The y member contains the y coordinate for the elliptic curve point, provided as a base64url-encoded string of the coordinate&#39;s big endian representation.
   * @return y
  **/
  @ApiModelProperty(required = true, value = "The y member contains the y coordinate for the elliptic curve point, provided as a base64url-encoded string of the coordinate's big endian representation.")

  public String getY() {
    return y;
  }


  public void setY(String y) {
    this.y = y;
  }


  public JWKPublicKey createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The timestamp when the key was created, in Unix time.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The timestamp when the key was created, in Unix time.")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public JWKPublicKey expiredAt(Integer expiredAt) {
    
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * The timestamp when the key expired, in Unix time.
   * @return expiredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The timestamp when the key expired, in Unix time.")

  public Integer getExpiredAt() {
    return expiredAt;
  }


  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWKPublicKey jwKPublicKey = (JWKPublicKey) o;
    return Objects.equals(this.alg, jwKPublicKey.alg) &&
        Objects.equals(this.crv, jwKPublicKey.crv) &&
        Objects.equals(this.kid, jwKPublicKey.kid) &&
        Objects.equals(this.kty, jwKPublicKey.kty) &&
        Objects.equals(this.use, jwKPublicKey.use) &&
        Objects.equals(this.x, jwKPublicKey.x) &&
        Objects.equals(this.y, jwKPublicKey.y) &&
        Objects.equals(this.createdAt, jwKPublicKey.createdAt) &&
        Objects.equals(this.expiredAt, jwKPublicKey.expiredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, crv, kid, kty, use, x, y, createdAt, expiredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWKPublicKey {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
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

