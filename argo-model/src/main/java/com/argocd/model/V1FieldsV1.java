package com.argocd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.  Each key is either a &#x27;.&#x27; representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: &#x27;f:&lt;name&gt;&#x27;, where &lt;name&gt; is the name of a field in a struct, or key in a map &#x27;v:&lt;value&gt;&#x27;, where &lt;value&gt; is the exact json formatted value of a list item &#x27;i:&lt;index&gt;&#x27;, where &lt;index&gt; is position of a item in a list &#x27;k:&lt;keys&gt;&#x27;, where &lt;keys&gt; is a map of  a list item&#x27;s key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.  The exact format is defined in sigs.k8s.io/structured-merge-diff +protobuf.options.(gogoproto.goproto_stringer)&#x3D;false
 */
@Schema(description = "FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.  Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.  The exact format is defined in sigs.k8s.io/structured-merge-diff +protobuf.options.(gogoproto.goproto_stringer)=false")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-08T14:30:40.531698698-05:00[America/New_York]")


public class V1FieldsV1  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Raw")
  private byte[] raw = null;

  public V1FieldsV1 raw(byte[] raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Raw is the underlying serialization of this object.
   * @return raw
   **/
  @Schema(description = "Raw is the underlying serialization of this object.")
  
    public byte[] getRaw() {
    return raw;
  }

  public void setRaw(byte[] raw) {
    this.raw = raw;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FieldsV1 v1FieldsV1 = (V1FieldsV1) o;
    return Objects.equals(this.raw, v1FieldsV1.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FieldsV1 {\n");
    
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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
