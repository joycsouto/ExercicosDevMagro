package ArrayListExercise.zPostExercise;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Post {
    private Date time;
    private String title;
    private String content;
    private Integer likes;
    Comments comments ;
    ArrayList<Comments> comment;

Scanner scanner = new Scanner(System.in);

public void collectingData(){
    System.out.println("Enter the title");
    title = scanner.next();
    System.out.println("likes :");
    likes = scanner.nextInt();
    System.out.println("ArrayListExercise.Post content:");
    content = scanner.next();
    System.out.println("Comment:");


}

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
