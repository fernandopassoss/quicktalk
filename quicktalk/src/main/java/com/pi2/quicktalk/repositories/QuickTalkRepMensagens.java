package com.pi2.quicktalk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi2.quicktalk.models.QuickTalkMensagens;

@Repository
public interface QuickTalkRepMensagens extends JpaRepository <QuickTalkMensagens, Long> {
    
}
