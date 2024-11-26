package admin.Dao;

import com.fitmate.admin.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDAO {
    // 공지사항 작성
    int write(NoticeDTO dto);
    
    // 알림 추가
    int insertAlert(int notice_idx);

    // 전체 공지사항 수 카운트
    int allCount(int cnt, String opt, String keyword, String sortType);

    // 특정 조건에 따른 공지사항 수 카운트
    int countIdx(String opt, String keyword, String sortType);
    
    // 공지사항 목록 조회
    List<NoticeDTO> list(int limit, int offset, String opt, String keyword, String sortType);

    // 공지사항 비가시화
    int invisible(int noticeIdx);
}
