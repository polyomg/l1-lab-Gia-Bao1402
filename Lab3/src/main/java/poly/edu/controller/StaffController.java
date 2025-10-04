package poly.edu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.model.Staff;

@Controller
public class StaffController {

    @RequestMapping("/staff/detail")
    public String detail(Model model) {
        Staff staff = new Staff("baodhgts01383@fpt.edu.vn	","Đinh Huỳnh Gia Bảo",2);
        model.addAttribute("staff", staff);
        return "/demo/staff-detail";
    }

    @RequestMapping("/staff/list")
    public String list(Model model) {
        List<Staff> list = List.of(
                new Staff("baodhgts013831","user1",0),
                new Staff("baodhgts013832","user2",1),
                new Staff("baodhgts013833","user3",2),
                new Staff("baodhgts013834","user4",2),
                new Staff("baodhgts013835","user5",1),
                new Staff("baodhgts013836","user6",0)
        );
        model.addAttribute("list", list);
        return "/demo/staff-list";
    }

    @RequestMapping("/staff/list-status")
    public String listStatus(Model model) {
        List<Staff> list = List.of(
        		 new Staff("baodhgts013831","user1",0),
                 new Staff("baodhgts013832","user2",1),
                 new Staff("baodhgts013833","user3",2),
                 new Staff("baodhgts013834","user4",2),
                 new Staff("baodhgts013835","user5",1),
                 new Staff("baodhgts013836","user6",0)
        );
        model.addAttribute("list", list);
        return "/demo/list-status";
    }

    @RequestMapping("/staff/list-controls")
    public String listControls(Model model) {
        List<Staff> list = List.of(
        		 new Staff("baodhgts013831","user1",0),
                 new Staff("baodhgts013832","user2",1),
                 new Staff("baodhgts013833","user3",2),
                 new Staff("baodhgts013834","user4",2),
                 new Staff("baodhgts013835","user5",1),
                 new Staff("baodhgts013836","user6",0)
        );
        model.addAttribute("list", list);
        return "/demo/list-controls";
    }

    
}

