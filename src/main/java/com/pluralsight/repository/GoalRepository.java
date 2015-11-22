package com.pluralsight.repository;

import com.pluralsight.model.Goal;

/**
 * Created by jeanbernard on 11/22/15.
 */
public interface GoalRepository {
    Goal saveGoal(Goal goal);
}
