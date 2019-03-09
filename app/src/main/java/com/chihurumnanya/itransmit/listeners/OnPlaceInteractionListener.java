package com.chihurumnanya.itransmit.listeners;

import com.chihurumnanya.itransmit.models.PlaceModel;

/**
 * Listener for communication between PlaceListFragment and its host Activity
 */
public interface OnPlaceInteractionListener {
    void onPlaceClicked(PlaceModel place);
}