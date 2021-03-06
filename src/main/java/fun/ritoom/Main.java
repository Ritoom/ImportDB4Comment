package fun.ritoom;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main extends Application {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Override
    public void start(Stage primaryStage) throws Exception {
        logger.info("程序开始运行");
        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/mainview.fxml"));
        primaryStage.setTitle("注释导入工具");
        primaryStage.setScene(new Scene(parent, 400, 275));
        //parent.getStylesheets().add("/CSS/style.css");
        primaryStage.show();
        logger.debug("start() : { }");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
