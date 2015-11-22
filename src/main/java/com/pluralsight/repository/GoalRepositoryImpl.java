package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.service.GoalService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by jeanbernard on 11/22/15.
 */

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Goal saveGoal(Goal goal) {
        entityManager.persist(goal);
        entityManager.flush();
        return goal;
    }
}
