package com.pluralsight.repository;

import com.pluralsight.model.Exercise;

/**
 * Created by jeanbernard on 11/25/15.
 */
public interface ExerciseRepository {

    Exercise save(Exercise exercise);

}
