package cristinauzunov.u5d8.controllers;

import cristinauzunov.u5d8.entities.Blog;
import cristinauzunov.u5d8.services.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogController {

    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> getTutti() {
        return blogService.getTutti();
    }

    @GetMapping("/{id}")
    public Blog getById(@PathVariable String id) {
        return blogService.getById(id);
    }

    @PostMapping
    public Blog crea(@RequestBody Blog nuovoBlog) {
        return blogService.crea(nuovoBlog);
    }

    @PutMapping("/{id}")
    public Blog modifica(@PathVariable String id, @RequestBody Blog blogAggiornato) {
        return blogService.modifica(id, blogAggiornato);
    }

    @DeleteMapping("/{id}")
    public void elimina(@PathVariable String id) {
        blogService.elimina(id);
    }
}