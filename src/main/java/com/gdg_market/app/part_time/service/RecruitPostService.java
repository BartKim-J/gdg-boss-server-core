package com.gdg_market.app.part_time.service;


import com.gdg_market.app.part_time.dto.RecruitPostRequestDTO;
import com.gdg_market.app.part_time.model.RecruitPost;
import com.gdg_market.app.product.model.Product;

import java.util.List;

public interface RecruitPostService {
    List<RecruitPost> getAllRecruitPosts();
    RecruitPost getRecruitPostById(Long id);
    RecruitPost createRecruitPost(RecruitPostRequestDTO recruitPostRequestDTO);
    void deleteRecruitPostById(Long id);
}