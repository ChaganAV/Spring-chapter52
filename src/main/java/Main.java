import configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cs1 = context.getBean("commentService",CommentService.class);
        UserService us2 = context.getBean("userService", UserService.class);

        boolean b1 = cs1.getCommentRepository() == us2.getCommentRepository();
        System.out.println(b1);
    }
}
