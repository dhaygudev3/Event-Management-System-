package com.era.eventmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.era.eventmanagementsystem.entity.Organizer;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}

