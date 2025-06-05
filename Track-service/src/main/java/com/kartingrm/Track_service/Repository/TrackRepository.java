package com.kartingrm.Track_service.Repository;


import com.kartingrm.Track_service.Entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {
}
