package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.service.GoalService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jeanbernard on 11/22/15.
 */

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Goal saveGoal(Goal goal) {

        if(goal.getId() == null) {
            entityManager.persist(goal);
            entityManager.flush();
        } else {
            entityManager.merge(goal);
        }


        return goal;
    }

    public List<Goal> loadAll() {
        TypedQuery<Goal> query = entityManager.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
        return query.getResultList();
    }

    public List<GoalReport> findAllGoalReports() {
        TypedQuery<GoalReport> query = entityManager.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
        return query.getResultList();
    }


}
