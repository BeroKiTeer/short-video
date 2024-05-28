package cn.edu.ujn.shortvideo.mapper;

import cn.edu.ujn.shortvideo.entities.dox.Comments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentsMapper extends BaseMapper<Comments> {

    @Insert("INSERT INTO comments(video_id, user_id, text, status, created_at) VALUES(#{videoId}, #{userId}, #{text}, #{status}, #{createdAt})")
    void insertComment(Comments comment);

    @Delete("DELETE FROM comments WHERE comment_id = #{commentId}")
    void deleteComment(int commentId);

    @Select("SELECT * FROM comments WHERE video_id = #{videoId} AND status = 'visible'")
    List<Comments> selectCommentsByVideoId(int videoId);

    @Select("SELECT * FROM comments WHERE video_id = #{videoId} AND status = 'visible'")
    IPage<Comments> selectCommentsByVideoIdWithPagination(Page<?> page, int videoId);

    @Select("SELECT * FROM comments WHERE comment_id = #{commentId}")
    Comments selectById(int commentId);

    @Select("SELECT COUNT(*) > 0 FROM comments WHERE comment_id = #{commentId} AND user_id = #{userId}")
    boolean isCommentOwnedByUser(int commentId, int userId);
}




