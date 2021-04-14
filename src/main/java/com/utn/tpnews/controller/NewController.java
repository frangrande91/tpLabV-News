package com.utn.tpnews.controller;

        import com.utn.tpnews.model.New;
        import com.utn.tpnews.service.NewService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/new")
public class NewController {

    @Autowired
    private NewService newService;

    @PostMapping("/")
    public void addNew(@RequestBody New n){
        newService.addNew(n);
    }

    @GetMapping      //Filtro por titulo sin que sea obligatorio
    public List<New> getAll(@RequestParam (required = false) String title){
        return newService.getAll(title);
    }

    @GetMapping("/{id}")
    public New getNewById(@PathVariable Integer id){
        return newService.getNewById(id);
    }


}
