package space.borisgk.findyourbookelastic.model.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains information about books
 */
@ApiModel(description = "Contains information about books")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T11:46:42.237920939+03:00[Europe/Moscow]")
public class Book   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("poster_url")
  private String posterUrl;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("year")
  private String year;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  @JsonProperty("genres")
  @Valid
  private List<String> genres = null;

  @JsonProperty("place_of_events")
  @Valid
  private List<String> placeOfEvents = null;

  @JsonProperty("time_of_events")
  @Valid
  private List<String> timeOfEvents = null;

  @JsonProperty("protagonists")
  @Valid
  private List<String> protagonists = null;

  @JsonProperty("authors")
  @Valid
  private List<Author> authors = null;

  public Book id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Book posterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
    return this;
  }

  /**
   * book's cover
   * @return posterUrl
  */
  @ApiModelProperty(value = "book's cover")


  public String getPosterUrl() {
    return posterUrl;
  }

  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }

  public Book name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book description(String description) {
    this.description = description;
    return this;
  }

  /**
   * short description
   * @return description
  */
  @ApiModelProperty(value = "short description")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Book year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @ApiModelProperty(value = "")


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public Book tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Book addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @ApiModelProperty(value = "")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Book genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public Book addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Get genres
   * @return genres
  */
  @ApiModelProperty(value = "")


  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public Book placeOfEvents(List<String> placeOfEvents) {
    this.placeOfEvents = placeOfEvents;
    return this;
  }

  public Book addPlaceOfEventsItem(String placeOfEventsItem) {
    if (this.placeOfEvents == null) {
      this.placeOfEvents = new ArrayList<>();
    }
    this.placeOfEvents.add(placeOfEventsItem);
    return this;
  }

  /**
   * Get placeOfEvents
   * @return placeOfEvents
  */
  @ApiModelProperty(value = "")


  public List<String> getPlaceOfEvents() {
    return placeOfEvents;
  }

  public void setPlaceOfEvents(List<String> placeOfEvents) {
    this.placeOfEvents = placeOfEvents;
  }

  public Book timeOfEvents(List<String> timeOfEvents) {
    this.timeOfEvents = timeOfEvents;
    return this;
  }

  public Book addTimeOfEventsItem(String timeOfEventsItem) {
    if (this.timeOfEvents == null) {
      this.timeOfEvents = new ArrayList<>();
    }
    this.timeOfEvents.add(timeOfEventsItem);
    return this;
  }

  /**
   * Get timeOfEvents
   * @return timeOfEvents
  */
  @ApiModelProperty(value = "")


  public List<String> getTimeOfEvents() {
    return timeOfEvents;
  }

  public void setTimeOfEvents(List<String> timeOfEvents) {
    this.timeOfEvents = timeOfEvents;
  }

  public Book protagonists(List<String> protagonists) {
    this.protagonists = protagonists;
    return this;
  }

  public Book addProtagonistsItem(String protagonistsItem) {
    if (this.protagonists == null) {
      this.protagonists = new ArrayList<>();
    }
    this.protagonists.add(protagonistsItem);
    return this;
  }

  /**
   * Get protagonists
   * @return protagonists
  */
  @ApiModelProperty(value = "")


  public List<String> getProtagonists() {
    return protagonists;
  }

  public void setProtagonists(List<String> protagonists) {
    this.protagonists = protagonists;
  }

  public Book authors(List<Author> authors) {
    this.authors = authors;
    return this;
  }

  public Book addAuthorsItem(Author authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<>();
    }
    this.authors.add(authorsItem);
    return this;
  }

  /**
   * Get authors
   * @return authors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.posterUrl, book.posterUrl) &&
        Objects.equals(this.name, book.name) &&
        Objects.equals(this.description, book.description) &&
        Objects.equals(this.year, book.year) &&
        Objects.equals(this.tags, book.tags) &&
        Objects.equals(this.genres, book.genres) &&
        Objects.equals(this.placeOfEvents, book.placeOfEvents) &&
        Objects.equals(this.timeOfEvents, book.timeOfEvents) &&
        Objects.equals(this.protagonists, book.protagonists) &&
        Objects.equals(this.authors, book.authors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, posterUrl, name, description, year, tags, genres, placeOfEvents, timeOfEvents, protagonists, authors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    placeOfEvents: ").append(toIndentedString(placeOfEvents)).append("\n");
    sb.append("    timeOfEvents: ").append(toIndentedString(timeOfEvents)).append("\n");
    sb.append("    protagonists: ").append(toIndentedString(protagonists)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
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

