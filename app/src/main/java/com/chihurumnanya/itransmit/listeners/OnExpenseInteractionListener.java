package com.chihurumnanya.itransmit.listeners;

import com.chihurumnanya.itransmit.models.ExpenseModel;

/**
 * Listener for communication between ExpenseListFragment and its host Activity
 */
public interface OnExpenseInteractionListener {
    void onExpenseClicked(ExpenseModel expense);
}