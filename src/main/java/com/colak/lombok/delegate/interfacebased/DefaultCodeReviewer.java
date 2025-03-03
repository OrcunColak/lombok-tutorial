package com.colak.lombok.delegate.interfacebased;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultCodeReviewer implements CodeReviewer {
    private Map<String, List<String>> pendingReviews = new HashMap<>();
    private Map<String, List<String>> completedReviews = new HashMap<>();

    @Override
    public void assignReview(String pullRequestId) {
        pendingReviews.putIfAbsent(pullRequestId, new ArrayList<>());
    }

    @Override
    public void submitReview(String pullRequestId, List<String> comments) {
        pendingReviews.remove(pullRequestId);
        completedReviews.put(pullRequestId, comments);
    }



}
