package com.colak.lombok.delegate.interfacebased;

import java.util.List;

public interface CodeReviewer {
    void assignReview(String pullRequestId);
    void submitReview(String pullRequestId, List<String> comments);
}
