package com.springboot3essentialtraining.room_web_app.data.repository;

import com.springboot3essentialtraining.room_web_app.data.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoomRepository extends JpaRepository<RoomEntity, UUID> {
}
