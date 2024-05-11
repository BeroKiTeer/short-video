package cn.edu.ujn.shortvideo.entities;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName videos
 */
@Data
public class Videos implements Serializable {
    private Integer video_id;

    /**
     * 
     */
    private Integer user_id;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String video_url;

    /**
     * 
     */
    private String thumbnail_url;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private Integer duration;

    /**
     * 
     */
    private String tags;

    /**
     * 
     */
    private LocalDateTime created_at;

    /**
     * 
     */
    private LocalDateTime updated_at;

    @Serial
    private static final long serialVersionUID = 1L;
}