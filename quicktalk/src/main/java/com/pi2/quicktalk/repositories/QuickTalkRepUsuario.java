package com.pi2.quicktalk.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pi2.quicktalk.models.QuickTalkUsuarios;

@Repository
public interface QuickTalkRepUsuario extends JpaRepository <QuickTalkUsuarios, Long> {
    QuickTalkUsuarios findByEmail(@Param("email") String email);
}
