package admin.Controller;

import admin.Service.NoticeService; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class NoticeController {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired NoticeService notice_service;

	// 세션 체크
	String page = "";
	public void checkPermit(String addr, Model model, HttpSession session) {
		if (session.getAttribute("loginIdx") == null) {
			model.addAttribute("msg", "관리자 로그인이 필요한 페이지입니다.");
			if (addr.equals("") || addr == null) {
				model.addAttribute("addr", "redirect:/admin_dashboard.go");
			} else {
				model.addAttribute("addr", addr);
			}
			page = "admin_login";
		}
	}

	// 공지사항
	@RequestMapping (value = "/admin_notice.go")
	public String list (Model model, HttpSession session) {
		page = "admin_notice";
		checkPermit("redirect:/admin_notice.go", model, session);
		return page;
	}

	// 공지사항 작성
	@RequestMapping (value = "/admin_noticeWrite.do")
	public String write (@RequestParam Map<String, String> params, Model model, HttpSession session) {
		page = "redirect:/admin_notice.go";
		checkPermit(page, model, session);
		if (session.getAttribute("loginIdx") != null) {
			int admin_idx = (int) session.getAttribute("loginIdx");
			if (notice_service.write(params.get("notice_cont"), admin_idx)){
				model.addAttribute("msg", "공지사항을 작성했습니다. 내용을 확인하세요.");
			} else {
				model.addAttribute("msg", "문제가 발생하여 공지사항을 작성하지 못했습니다. 공지사항을 다시 작성하세요.");
			}
		}
		return page;
	}

	// 공지사항 목록
	@RequestMapping (value = "/notice_list.ajax")
	@ResponseBody
	public Map<String, Object> list(String page, String cnt, String opt, String keyword, String sortType) {
		int pageInt = Integer.parseInt(page);
		int cntInt = Integer.parseInt(cnt);
		return notice_service.list(pageInt, cntInt, opt, keyword, sortType);
	}

	// 공지사항 삭제
	@RequestMapping (value = "notice_invisible.ajax")
	@ResponseBody
	public Map<String, Object> invisible(String notice_idx) {
		Map<String, Object> result = new HashMap<String, Object>();
		int noticeIdx = Integer.parseInt(notice_idx);
		result.put("success", notice_service.invisible(noticeIdx));
		return result;
	}
}