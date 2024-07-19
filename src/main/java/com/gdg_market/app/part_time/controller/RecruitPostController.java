package com.gdg_market.app.part_time.controller;

import com.gdg_market.app.part_time.dto.RecruitPostRequestDTO;
import com.gdg_market.app.part_time.dto.RecruitPostResponseDTO;
import com.gdg_market.app.part_time.model.RecruitPost;
import com.gdg_market.app.part_time.service.RecruitPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/recruit-posts")
public class RecruitPostController {

    @Autowired
    private RecruitPostService recruitPostService;

    @PostMapping
    public RecruitPostResponseDTO createRecruitPost(@RequestBody RecruitPostRequestDTO requestDTO) {
        RecruitPost recruitPost = recruitPostService.createRecruitPost(requestDTO);
        return convertToResponseDTO(recruitPost);
    }

    @GetMapping("/{id}")
    public RecruitPostResponseDTO getRecruitPost(@PathVariable Long id) {
        RecruitPost recruitPost = recruitPostService.getRecruitPostById(id);
        return convertToResponseDTO(recruitPost);
    }

    @GetMapping
    public List<RecruitPostResponseDTO> getAllRecruitPosts() {
        List<RecruitPost> recruitPosts = recruitPostService.getAllRecruitPosts();
        return recruitPosts.stream().map(this::convertToResponseDTO).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecruitPost(@PathVariable Long id) {
        recruitPostService.deleteRecruitPostById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    private RecruitPostResponseDTO convertToResponseDTO(RecruitPost recruitPost) {
        RecruitPostResponseDTO responseDTO = new RecruitPostResponseDTO();
        responseDTO.setId(recruitPost.getId());
        responseDTO.setTitle(recruitPost.getTitle());
        responseDTO.setContent(recruitPost.getContent());
        responseDTO.setWorkTime(recruitPost.getWorkTime());
        responseDTO.setHourlyWage(recruitPost.getHourlyWage());
        responseDTO.setLocation(recruitPost.getLocation());
        return responseDTO;
    }
}
