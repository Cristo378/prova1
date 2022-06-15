package appspring.src.main.java.appspring;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.model;



@Controller
public class HomeController {
@RequestMapping("/")
public String index(model model) {
model.addAttribute("mensagem", "Olá Mundo!!!");
return "/home/index";
}
}