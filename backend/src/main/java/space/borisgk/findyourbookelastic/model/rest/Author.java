package space.borisgk.findyourbookelastic.model.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains information about authors
 */
@ApiModel(description = "Contains information about authors")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-11T17:16:40.444092736+03:00[Europe/Moscow]")
public class Author   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("year_birth")
  private Integer yearBirth;

  @JsonProperty("year_death")
  private Integer yearDeath;

  @JsonProperty("biography")
  private String biography;

  @JsonProperty("img_url")
  private String imgUrl;

  @JsonProperty("books_ids")
  @Valid
  private List<Integer> booksIds = null;

  public Author id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id
   * @return id
  */
  @ApiModelProperty(value = "id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Author name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Author's name
   * @return name
  */
  @ApiModelProperty(value = "Author's name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author yearBirth(Integer yearBirth) {
    this.yearBirth = yearBirth;
    return this;
  }

  /**
   * Author's date of birth
   * @return yearBirth
  */
  @ApiModelProperty(value = "Author's date of birth")


  public Integer getYearBirth() {
    return yearBirth;
  }

  public void setYearBirth(Integer yearBirth) {
    this.yearBirth = yearBirth;
  }

  public Author yearDeath(Integer yearDeath) {
    this.yearDeath = yearDeath;
    return this;
  }

  /**
   * Author's date of death
   * @return yearDeath
  */
  @ApiModelProperty(value = "Author's date of death")


  public Integer getYearDeath() {
    return yearDeath;
  }

  public void setYearDeath(Integer yearDeath) {
    this.yearDeath = yearDeath;
  }

  public Author biography(String biography) {
    this.biography = biography;
    return this;
  }

  /**
   * Author's biography
   * @return biography
  */
  @ApiModelProperty(value = "Author's biography")


  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public Author imgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

  /**
   * Author's img
   * @return imgUrl
  */
  @ApiModelProperty(value = "Author's img")


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public Author booksIds(List<Integer> booksIds) {
    this.booksIds = booksIds;
    return this;
  }

  public Author addBooksIdsItem(Integer booksIdsItem) {
    if (this.booksIds == null) {
      this.booksIds = new ArrayList<>();
    }
    this.booksIds.add(booksIdsItem);
    return this;
  }

  /**
   * Author's books
   * @return booksIds
  */
  @ApiModelProperty(value = "Author's books")


  public List<Integer> getBooksIds() {
    return booksIds;
  }

  public void setBooksIds(List<Integer> booksIds) {
    this.booksIds = booksIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.id, author.id) &&
        Objects.equals(this.name, author.name) &&
        Objects.equals(this.yearBirth, author.yearBirth) &&
        Objects.equals(this.yearDeath, author.yearDeath) &&
        Objects.equals(this.biography, author.biography) &&
        Objects.equals(this.imgUrl, author.imgUrl) &&
        Objects.equals(this.booksIds, author.booksIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, yearBirth, yearDeath, biography, imgUrl, booksIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    yearBirth: ").append(toIndentedString(yearBirth)).append("\n");
    sb.append("    yearDeath: ").append(toIndentedString(yearDeath)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    booksIds: ").append(toIndentedString(booksIds)).append("\n");
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

