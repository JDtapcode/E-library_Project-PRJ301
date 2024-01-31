/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author Nguyen Thanh Dung
 */
public class Book {
    public int id;
    public String title;
    public String author;
    public String Category;
    public int page;
    public String image;
    public String description;
    public String linkbook;
    public int user_id;

    public Book() {
    }

    public Book(int id, String title, String author, String Category, int page, String image, String description, String linkbook, int user_id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.Category = Category;
        this.page = page;
        this.image = image;
        this.description = description;
        this.linkbook = linkbook;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkbook() {
        return linkbook;
    }

    public void setLinkbook(String linkbook) {
        this.linkbook = linkbook;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
}
