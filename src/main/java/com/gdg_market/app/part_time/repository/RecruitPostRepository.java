package com.gdg_market.app.part_time.repository;

import com.gdg_market.app.part_time.model.RecruitPost;
import com.gdg_market.app.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruitPostRepository extends JpaRepository<RecruitPost, Long> {
}
