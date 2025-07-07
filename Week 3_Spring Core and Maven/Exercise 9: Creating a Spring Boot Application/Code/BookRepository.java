package com.library.Management.repository;

import com.library.Management.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
