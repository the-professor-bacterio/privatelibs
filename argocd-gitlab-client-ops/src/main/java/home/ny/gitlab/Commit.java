package home.ny.gitlab;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.gitlab4j.api.models.CommitAction;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Commit {
    String branch;
    String projectFile;
    String contents;
    CommitAction.Action action;
    String author;
    String authorName;
    String commitMessage;
}
