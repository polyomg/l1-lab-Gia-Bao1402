package poly.edu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dientichchuvi")
public class RectangleController {

    @Autowired
    HttpServletRequest request;

    @GetMapping("/form")
    public String form() {
        return "rectangle"; 
    }

    @PostMapping("/tinhtoan")
    public String calc(Model model) {
        double chieuDai = Double.parseDouble(request.getParameter("chieuDai"));
        double chieuRong = Double.parseDouble(request.getParameter("chieuRong"));

        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);

        model.addAttribute("dienTich", dienTich);
        model.addAttribute("chuVi", chuVi);

        return "rectangle";
    }
}
