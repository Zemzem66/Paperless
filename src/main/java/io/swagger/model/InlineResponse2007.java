package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InlineResponse2007ArchiveMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2007
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-18T15:01:04.033019109Z[GMT]")


public class InlineResponse2007   {
  @JsonProperty("original_checksum")
  private String originalChecksum = null;

  @JsonProperty("original_size")
  private Integer originalSize = null;

  @JsonProperty("original_mime_type")
  private String originalMimeType = null;

  @JsonProperty("media_filename")
  private String mediaFilename = null;

  @JsonProperty("has_archive_version")
  private Boolean hasArchiveVersion = null;

  @JsonProperty("original_metadata")
  @Valid
  private List<Object> originalMetadata = new ArrayList<Object>();

  @JsonProperty("archive_checksum")
  private String archiveChecksum = null;

  @JsonProperty("archive_media_filename")
  private String archiveMediaFilename = null;

  @JsonProperty("original_filename")
  private String originalFilename = null;

  @JsonProperty("lang")
  private String lang = null;

  @JsonProperty("archive_size")
  private Integer archiveSize = null;

  @JsonProperty("archive_metadata")
  @Valid
  private List<InlineResponse2007ArchiveMetadata> archiveMetadata = new ArrayList<InlineResponse2007ArchiveMetadata>();

  public InlineResponse2007 originalChecksum(String originalChecksum) {
    this.originalChecksum = originalChecksum;
    return this;
  }

  /**
   * Get originalChecksum
   * @return originalChecksum
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOriginalChecksum() {
    return originalChecksum;
  }

  public void setOriginalChecksum(String originalChecksum) {
    this.originalChecksum = originalChecksum;
  }

  public InlineResponse2007 originalSize(Integer originalSize) {
    this.originalSize = originalSize;
    return this;
  }

  /**
   * Get originalSize
   * @return originalSize
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getOriginalSize() {
    return originalSize;
  }

  public void setOriginalSize(Integer originalSize) {
    this.originalSize = originalSize;
  }

  public InlineResponse2007 originalMimeType(String originalMimeType) {
    this.originalMimeType = originalMimeType;
    return this;
  }

  /**
   * Get originalMimeType
   * @return originalMimeType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOriginalMimeType() {
    return originalMimeType;
  }

  public void setOriginalMimeType(String originalMimeType) {
    this.originalMimeType = originalMimeType;
  }

  public InlineResponse2007 mediaFilename(String mediaFilename) {
    this.mediaFilename = mediaFilename;
    return this;
  }

  /**
   * Get mediaFilename
   * @return mediaFilename
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getMediaFilename() {
    return mediaFilename;
  }

  public void setMediaFilename(String mediaFilename) {
    this.mediaFilename = mediaFilename;
  }

  public InlineResponse2007 hasArchiveVersion(Boolean hasArchiveVersion) {
    this.hasArchiveVersion = hasArchiveVersion;
    return this;
  }

  /**
   * Get hasArchiveVersion
   * @return hasArchiveVersion
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isHasArchiveVersion() {
    return hasArchiveVersion;
  }

  public void setHasArchiveVersion(Boolean hasArchiveVersion) {
    this.hasArchiveVersion = hasArchiveVersion;
  }

  public InlineResponse2007 originalMetadata(List<Object> originalMetadata) {
    this.originalMetadata = originalMetadata;
    return this;
  }

  public InlineResponse2007 addOriginalMetadataItem(Object originalMetadataItem) {
    this.originalMetadata.add(originalMetadataItem);
    return this;
  }

  /**
   * Get originalMetadata
   * @return originalMetadata
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<Object> getOriginalMetadata() {
    return originalMetadata;
  }

  public void setOriginalMetadata(List<Object> originalMetadata) {
    this.originalMetadata = originalMetadata;
  }

  public InlineResponse2007 archiveChecksum(String archiveChecksum) {
    this.archiveChecksum = archiveChecksum;
    return this;
  }

  /**
   * Get archiveChecksum
   * @return archiveChecksum
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getArchiveChecksum() {
    return archiveChecksum;
  }

  public void setArchiveChecksum(String archiveChecksum) {
    this.archiveChecksum = archiveChecksum;
  }

  public InlineResponse2007 archiveMediaFilename(String archiveMediaFilename) {
    this.archiveMediaFilename = archiveMediaFilename;
    return this;
  }

  /**
   * Get archiveMediaFilename
   * @return archiveMediaFilename
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getArchiveMediaFilename() {
    return archiveMediaFilename;
  }

  public void setArchiveMediaFilename(String archiveMediaFilename) {
    this.archiveMediaFilename = archiveMediaFilename;
  }

  public InlineResponse2007 originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

  /**
   * Get originalFilename
   * @return originalFilename
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }

  public InlineResponse2007 lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public InlineResponse2007 archiveSize(Integer archiveSize) {
    this.archiveSize = archiveSize;
    return this;
  }

  /**
   * Get archiveSize
   * @return archiveSize
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getArchiveSize() {
    return archiveSize;
  }

  public void setArchiveSize(Integer archiveSize) {
    this.archiveSize = archiveSize;
  }

  public InlineResponse2007 archiveMetadata(List<InlineResponse2007ArchiveMetadata> archiveMetadata) {
    this.archiveMetadata = archiveMetadata;
    return this;
  }

  public InlineResponse2007 addArchiveMetadataItem(InlineResponse2007ArchiveMetadata archiveMetadataItem) {
    this.archiveMetadata.add(archiveMetadataItem);
    return this;
  }

  /**
   * Get archiveMetadata
   * @return archiveMetadata
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InlineResponse2007ArchiveMetadata> getArchiveMetadata() {
    return archiveMetadata;
  }

  public void setArchiveMetadata(List<InlineResponse2007ArchiveMetadata> archiveMetadata) {
    this.archiveMetadata = archiveMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.originalChecksum, inlineResponse2007.originalChecksum) &&
        Objects.equals(this.originalSize, inlineResponse2007.originalSize) &&
        Objects.equals(this.originalMimeType, inlineResponse2007.originalMimeType) &&
        Objects.equals(this.mediaFilename, inlineResponse2007.mediaFilename) &&
        Objects.equals(this.hasArchiveVersion, inlineResponse2007.hasArchiveVersion) &&
        Objects.equals(this.originalMetadata, inlineResponse2007.originalMetadata) &&
        Objects.equals(this.archiveChecksum, inlineResponse2007.archiveChecksum) &&
        Objects.equals(this.archiveMediaFilename, inlineResponse2007.archiveMediaFilename) &&
        Objects.equals(this.originalFilename, inlineResponse2007.originalFilename) &&
        Objects.equals(this.lang, inlineResponse2007.lang) &&
        Objects.equals(this.archiveSize, inlineResponse2007.archiveSize) &&
        Objects.equals(this.archiveMetadata, inlineResponse2007.archiveMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalChecksum, originalSize, originalMimeType, mediaFilename, hasArchiveVersion, originalMetadata, archiveChecksum, archiveMediaFilename, originalFilename, lang, archiveSize, archiveMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    originalChecksum: ").append(toIndentedString(originalChecksum)).append("\n");
    sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
    sb.append("    originalMimeType: ").append(toIndentedString(originalMimeType)).append("\n");
    sb.append("    mediaFilename: ").append(toIndentedString(mediaFilename)).append("\n");
    sb.append("    hasArchiveVersion: ").append(toIndentedString(hasArchiveVersion)).append("\n");
    sb.append("    originalMetadata: ").append(toIndentedString(originalMetadata)).append("\n");
    sb.append("    archiveChecksum: ").append(toIndentedString(archiveChecksum)).append("\n");
    sb.append("    archiveMediaFilename: ").append(toIndentedString(archiveMediaFilename)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    archiveSize: ").append(toIndentedString(archiveSize)).append("\n");
    sb.append("    archiveMetadata: ").append(toIndentedString(archiveMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
