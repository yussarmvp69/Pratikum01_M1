package com.yussar.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PaperRockScissorsController {

    public Button idPaper;
    public Button idRock;
    public Button idScissors;
    public ImageView imageComp;
    public ImageView imageUser;
    public TextArea textWin;
    public TextArea textDraw;
    public TextArea textLose;
    public int win = 0;
    public int draw = 0;
    public int lose = 0;

    public void ExitButton(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void PaperAction(ActionEvent actionEvent) {
        imageUser.setImage(new Image("paper.jfif"));
        int random = (int)(Math.random() * 3 + 1);
        if(random == 1)
        {
            imageComp.setImage(new Image("paper.jfif"));
            draw = draw + 1;
            textDraw.setText(String.valueOf(draw));
        }
        else if (random == 2)
        {
            imageComp.setImage(new Image("rock.jfif"));
            win = win + 1;
            textWin.setText(String.valueOf(win));
        }
        else
        {
            imageComp.setImage(new Image("scissors.jfif"));
            lose = lose + 1;
            textLose.setText(String.valueOf(lose));
        }
    }

    public void RockAction(ActionEvent actionEvent) {
        imageUser.setImage(new Image("rock.jfif"));
        int random = (int)(Math.random() * 3 + 1);
        if(random == 1)
        {
            imageComp.setImage(new Image("paper.jfif"));
            lose = lose + 1;
            textLose.setText(String.valueOf(lose));
        }
        else if (random == 2)
        {
            imageComp.setImage(new Image("rock.jfif"));
            draw = draw + 1;
            textDraw.setText(String.valueOf(draw));
        }
        else
        {
            imageComp.setImage(new Image("scissors.jfif"));
            win = win + 1;
            textWin.setText(String.valueOf(win));
        }
    }

    public void ScissorsAction(ActionEvent actionEvent) {
        imageUser.setImage(new Image("scissors.jfif"));
        int random = (int)(Math.random() * 3 + 1);
        if(random == 1)
        {
            imageComp.setImage(new Image("paper.jfif"));
            win = win + 1;
            textWin.setText(String.valueOf(win));
        }
        else if (random == 2)
        {
            imageComp.setImage(new Image("rock.jfif"));
            lose = lose + 1;
            textLose.setText(String.valueOf(lose));
        }
        else
        {
            imageComp.setImage(new Image("scissors.jfif"));
            draw = draw + 1;
            textDraw.setText(String.valueOf(draw));
        }
    }
}
