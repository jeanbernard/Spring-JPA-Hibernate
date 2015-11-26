package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by jeanbernard on 11/22/15.
 */
public interface GoalService {

    Goal saveGoal(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> findAllGoalReports();
}
