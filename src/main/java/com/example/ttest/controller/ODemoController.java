package com.example.ttest.controller;

import com.example.ttest.form.FormModel;
import com.example.ttest.model.KeyValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
public class ODemoController {

    @GetMapping("/oservice")
    public String ommService(Model model, @ModelAttribute("keys") ArrayList<KeyValue> keys) {
        FormModel sendEmailForm = new FormModel();
        ArrayList<KeyValue> kList = new ArrayList<>();
        if (keys != null) {
            for (KeyValue key : keys) {
                kList.add(key);
            }
        }

        sendEmailForm.setKeys(kList);
        model.addAttribute("form", sendEmailForm);


        return "oservice";
    }

    @GetMapping("/addkey")
    public String addKey(Model model, RedirectAttributes redirectAttributes) {
        ArrayList<KeyValue> kList = new ArrayList<>();
        kList.add(new KeyValue("key", "value"));
        kList.add(new KeyValue("key1", "value1"));

        redirectAttributes.addFlashAttribute("keys", kList);

        return "redirect:/ommservice";
    }

}
