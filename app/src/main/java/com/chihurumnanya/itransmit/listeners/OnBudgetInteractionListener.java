package com.chihurumnanya.itransmit.listeners;

import com.chihurumnanya.itransmit.models.BudgetModel;

/**
 * Listener for communication between BudgetListFragment and its host Activity
 */
public interface OnBudgetInteractionListener {
    void onBudgetClicked(BudgetModel budget);
}