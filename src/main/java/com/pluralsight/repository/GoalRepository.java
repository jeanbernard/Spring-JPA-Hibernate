package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by jeanbernard on 11/22/15.
 */
public interface GoalRepository {
    Goal saveGoal(Goal goal);

    List<Goal> loadAll();

    List<GoalReport> findAllGoalReports();
}
