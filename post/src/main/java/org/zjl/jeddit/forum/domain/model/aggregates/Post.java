package org.zjl.jeddit.forum.domain.model.aggregates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zjl.jeddit.forum.domain.model.valueobjects.User;

/**
 * @author Junlin Zhou
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Post {

    @JsonProperty
    private String id;

    @JsonProperty
    private User author;

    @JsonProperty
    private Post replyTo;

    @JsonProperty
    private String title;

    @JsonProperty
    private String content;

    /**
     * need it for updating mongo document.
     * If not present, {@link PersistentEntityIsNewStrategy#isNew} will treat this as a new entity,
     * and {@code repository#save} will throw duplicate key exception.
     */
    private Long version;
}
