package com.hexaware.entity;

import java.util.ArrayList; 
import java.util.List;

interface IAdoptable {
    void adopt();
}

class AdoptionEvent {
    private List<IAdoptable> participants;

    public AdoptionEvent() {
        participants = new ArrayList<>();
    }

    public void hostEvent() {
        
    }

    public void registerParticipant(IAdoptable participant) {
        participants.add(participant);
    }
}