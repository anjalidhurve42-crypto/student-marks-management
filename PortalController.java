package com.studentportal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PortalController {
  private final StudentRepository repo;
  public PortalController(StudentRepository repo){this.repo=repo;}

  @GetMapping("/")
  public String home(Model model){
    model.addAttribute("students",repo.findAll());
    model.addAttribute("student",new Student());
    return "index";
  }
  @PostMapping("/admin/students")
  public String add(@ModelAttribute Student student, RedirectAttributes ra){
    if(student.getName()==null || student.getName().isBlank() || student.getRollNumber()==null || student.getRollNumber().isBlank()){
      ra.addFlashAttribute("error","Please enter student name and roll number."); return "redirect:/";
    }
    if(student.getSubject1()<0 || student.getSubject1()>100 || student.getSubject2()<0 || student.getSubject2()>100 || student.getSubject3()<0 || student.getSubject3()>100){
      ra.addFlashAttribute("error","Each subject mark must be between 0 and 100."); return "redirect:/";
    }
    repo.save(student); ra.addFlashAttribute("success","Student added successfully."); return "redirect:/";
  }
  @PostMapping("/admin/students/{id}/delete")
  public String delete(@PathVariable Long id, RedirectAttributes ra){
    if(repo.existsById(id)) repo.deleteById(id);
    ra.addFlashAttribute("success","Student record deleted."); return "redirect:/";
  }
}
