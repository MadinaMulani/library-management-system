package library;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String author;

    // Constructor
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // toString method
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author;
    }
}
