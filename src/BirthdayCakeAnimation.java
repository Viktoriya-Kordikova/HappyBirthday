import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BirthdayCakeAnimation extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        // Загружаем изображение торта
        Image cakeImage = new Image("https://emojio.ru/images/apple-b/1f382.png"); // Укажите путь к изображению торта
        ImageView cakeImageView = new ImageView(cakeImage);

        // Добавляем изображение торта на сцену
        root.getChildren().add(cakeImageView);

        // Создаем анимацию масштабирования торта
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(cakeImageView.scaleXProperty(), 1),
                        new KeyValue(cakeImageView.scaleYProperty(), 1)),
                new KeyFrame(Duration.seconds(1), new KeyValue(cakeImageView.scaleXProperty(), 1.2),
                        new KeyValue(cakeImageView.scaleYProperty(), 1.2)),
                new KeyFrame(Duration.seconds(2), new KeyValue(cakeImageView.scaleXProperty(), 1),
                        new KeyValue(cakeImageView.scaleYProperty(), 1))
        );

        // Устанавливаем количество повторений анимации (здесь: бесконечность)
        timeline.setCycleCount(Timeline.INDEFINITE);

        // Запускаем анимацию
        timeline.play();

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Днюха!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
