package com.gdg_market.app.part_time.service.implement;

import com.gdg_market.app.part_time.dto.RecruitPostRequestDTO;
import com.gdg_market.app.part_time.model.RecruitPost;
import com.gdg_market.app.part_time.repository.RecruitPostRepository;
import com.gdg_market.app.part_time.service.RecruitPostService;
import com.gdg_market.app.product.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecruitPostServiceImpl implements RecruitPostService {
    private final RecruitPostRepository recruitPostRepository;


    @Override
    public List<RecruitPost> getAllRecruitPosts() {
        return recruitPostRepository.findAll();
    }

    @Override
    public RecruitPost getRecruitPostById(Long id) {
        return recruitPostRepository.findById(id).orElseThrow(() -> new RuntimeException("Recruit post not found"));
    }

    @Override
    public RecruitPost createRecruitPost(RecruitPostRequestDTO recruitPostRequestDTO) {
        return null;
    }

    @Override
    public void deleteRecruitPostById(Long id) {
        RecruitPost recruitPost = recruitPostRepository.findById(id).orElseThrow
                (()-> new RuntimeException("Recruit post not found"));
        recruitPostRepository.delete(recruitPost);
    }
}
