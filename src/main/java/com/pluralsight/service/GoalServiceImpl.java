package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jeanbernard on 11/22/15.
 */

@Transactional
@Service("goalService")
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;


    public Goal saveGoal(Goal goal) {
        return goalRepository.saveGoal(goal);
    }

    public List<Goal> findAllGoals() {
        return goalRepository.loadAll();
    }

    public List<GoalReport> findAllGoalReports() {
        return goalRepository.findAllGoalReports();
    }


}
