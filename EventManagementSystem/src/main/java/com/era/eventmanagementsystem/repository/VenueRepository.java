package com.era.eventmanagementsystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.era.eventmanagementsystem.entity.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
