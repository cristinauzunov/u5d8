package cristinauzunov.u5d8.services;

import cristinauzunov.u5d8.entities.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {

    private List<Blog> blogPosts = new ArrayList<>();

    public List<Blog> getTutti() {
        return blogPosts;
    }

    public Blog getById(String id) {
        for (Blog blog : blogPosts) {
            if (blog.getId().equals(id)) {
                return blog;
            }
        }
        return null;
    }

    public Blog crea(Blog nuovoBlog) {
        blogPosts.add(nuovoBlog);
        return nuovoBlog;
    }

    public Blog modifica(String id, Blog blogAggiornato) {
        Blog blog = getById(id);
        if (blog != null) {
            blog.setCategoria(blogAggiornato.getCategoria());
            blog.setTitolo(blogAggiornato.getTitolo());
            blog.setContenuto(blogAggiornato.getContenuto());
            blog.setTempoDiLettura(blogAggiornato.getTempoDiLettura());
        }
        return blog;
    }

    public void elimina(String id) {
        Blog blog = getById(id);
        if (blog != null) {
            blogPosts.remove(blog);
        }
    }
}