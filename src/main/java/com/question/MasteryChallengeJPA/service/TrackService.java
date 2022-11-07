package com.question.MasteryChallengeJPA.service;

import com.question.MasteryChallengeJPA.domain.Track;

import java.util.List;

public interface TrackService {

    Track addTrack(Track track);

    List<Track> getAllTracks();

    boolean deleteTrackByTrackId(int trackId);

    List<Track> getTrackByTrackId(int trackId);

    List<Track> getTrackByTrackArtist(String trackArtist);

    Track updateTrack(Track track,int trackId);
}
