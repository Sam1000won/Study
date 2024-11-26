package admin.Dao;

import com.fitmate.admin.dto.DashboardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface MainDAO{
    // layout
    String getname(String admin_idx);

    // Login
    int login(String admin_id, String pw);
    int checkid(String admin_id);
    int getidx(String admin_id);

    // 데시보드 > 공지사항 목록
    List<DashboardDTO>dashboardList1();
    List<DashboardDTO>dashboardList2();

    List<Integer> getChartData();
    List<Integer> getTableDate();
}