package com.example.full_connection.Repository;

import com.example.full_connection.Entity.Classrooms;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ClassroomsRepository extends JpaRepository<Classrooms, UUID> {}
