package com.restapi.rest.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class ImmutableLiveStream {

    private final String id;
    private final String title;
    private final String url;
    private final String description;
    private final LocalDateTime startDate;

    public ImmutableLiveStream(String id, String title, String url, String description, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private final LocalDateTime endDate;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "ImmutableLiveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableLiveStream that = (ImmutableLiveStream) o;
        return id.equals(that.id) && title.equals(that.title) && url.equals(that.url) && description.equals(that.description) && startDate.equals(that.startDate) && endDate.equals(that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, url, description, startDate, endDate);
    }
}
